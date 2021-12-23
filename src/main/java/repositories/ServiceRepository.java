/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.ServiceEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Vinicius
 */
public class ServiceRepository implements IState<ServiceEntity>{
    private final static List<ServiceEntity> service = new ArrayList();
    private final static Stack<ServiceEntity> undo = new Stack();
    private final static Stack<ServiceEntity> redo = new Stack();
    
    public void insertService(ServiceEntity newServiceEntity){
        ServiceRepository.service.add(newServiceEntity);
    }
    
    public List<ServiceEntity>getAll(){
        List<ServiceEntity> all = new ArrayList();
        ServiceRepository.service.stream().filter((serviceEntity) -> 
                (serviceEntity.isActivate())).forEachOrdered((serviceEntity) -> {
            all.add(serviceEntity);
        });
        return all;
    }
    
    public void updateServiceforName(int index, ServiceEntity service){
        ServiceRepository.service.set(index, service);
    }
    
    public void delete(ServiceEntity obj){
        int index = ServiceRepository.service.indexOf(obj);
        ServiceRepository.service.get(index).setActivate(false);
    }

    @Override
    public void addUndo(ServiceEntity service) {
        ServiceRepository.undo.add(service);
    }
    
    public ServiceEntity get(){
        return ServiceRepository.undo.pop();
    }

    @Override
    public void undo() {
        ServiceEntity serviceEntity = ServiceRepository.undo.pop();
        int index = ServiceRepository.service.indexOf(serviceEntity);
        ServiceRepository.service.get(index).setActivate(true);
    }
    
    public ServiceEntity getSingle(String name){
        int index = ServiceRepository.service.indexOf(new ServiceEntity(name));
        return ServiceRepository.service.get(index);
    }
}
