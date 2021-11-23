/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.ServiceEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class ServiceRepository {
    private final List<ServiceEntity> service = new ArrayList();
    
    public void insertService(ServiceEntity newServiceEntity){
        this.service.add(newServiceEntity);
    }
        
}
