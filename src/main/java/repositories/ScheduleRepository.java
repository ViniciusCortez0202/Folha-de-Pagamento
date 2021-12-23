/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.ScheduleEntity;
import entities.ScheduleEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Vinicius
 */
public class ScheduleRepository implements IState<ScheduleEntity>{

    
    private final static List<ScheduleEntity> schedule = new ArrayList();
    private final static Stack<ScheduleEntity> undo = new Stack();
    private final static Stack<ScheduleEntity> redo = new Stack();
    
    public void insertSchedule(ScheduleEntity newScheduleEntity){
        ScheduleRepository.schedule.add(newScheduleEntity);
    }
    
    public List<ScheduleEntity>getAll(){
        List<ScheduleEntity> all = new ArrayList();
        ScheduleRepository.schedule.stream().filter((ScheduleEntity) -> 
                (ScheduleEntity.isActivate())).forEachOrdered((ScheduleEntity) -> {
            all.add(ScheduleEntity);
        });
        return all;
    }
    
    public void updateScheduleforName(int index, ScheduleEntity schedule){
        ScheduleRepository.schedule.set(index, schedule);
    }
    
    public void delete(ScheduleEntity obj){
        int index = ScheduleRepository.schedule.indexOf(obj);
        ScheduleRepository.schedule.get(index).setActivate(false);
    }

    @Override
    public void addUndo(ScheduleEntity Schedule) {
        ScheduleRepository.undo.add(Schedule);
    }
    
    public ScheduleEntity get(){
        return ScheduleRepository.undo.pop();
    }

    @Override
    public void undo() {
        if(!ScheduleRepository.undo.empty()){            
            ScheduleEntity ScheduleEntity = ScheduleRepository.undo.pop();
            int index = ScheduleRepository.schedule.indexOf(ScheduleEntity);
            ScheduleRepository.schedule.get(index).setActivate(true);
        }
    }
    
    public ScheduleEntity getSingle(String name){
        int index = ScheduleRepository.schedule.indexOf(new ScheduleEntity(name));
        return ScheduleRepository.schedule.get(index);
    }
    
}
