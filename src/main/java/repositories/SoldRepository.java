/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.SoldEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Vinicius
 */
public class SoldRepository implements IState<SoldEntity>{
        private final static List<SoldEntity> sold = new ArrayList();
    private final static Stack<SoldEntity> undo = new Stack();
    private final static Stack<SoldEntity> redo = new Stack();
    
    public void insertSold(SoldEntity newSoldEntity){
        SoldRepository.sold.add(newSoldEntity);
    }
    
    public List<SoldEntity>getAll(){
        List<SoldEntity> all = new ArrayList();
        SoldRepository.sold.stream().filter((serviceEntity) -> 
                (serviceEntity.isActivate())).forEachOrdered((soldEntity) -> {
            all.add(soldEntity);
        });
        return all;
    }
    
    public void updateServiceforName(int index, SoldEntity sold){
        SoldRepository.sold.set(index, sold);
    }
    
    public void delete(SoldEntity obj){
        int index = SoldRepository.sold.indexOf(obj);
        SoldRepository.sold.get(index).setActivate(false);
    }

    @Override
    public void addUndo(SoldEntity sold) {
        SoldRepository.undo.add(sold);
    }
    
    public SoldEntity get(){
        return SoldRepository.undo.pop();
    }

    @Override
    public void undo() {
        if(!SoldRepository.undo.empty()){
        SoldEntity soldEntity = SoldRepository.undo.pop();
        int index = SoldRepository.sold.indexOf(soldEntity);
        SoldRepository.sold.get(index).setActivate(true);
        }
    }
    
    public SoldEntity getSingle(String id){
        int index = SoldRepository.sold.indexOf(new SoldEntity(id));
        return SoldRepository.sold.get(index);
    }
}
