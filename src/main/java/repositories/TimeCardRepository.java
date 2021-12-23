/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.EmployeeEntity;
import entities.TimeCardEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Vinicius
 */
public class TimeCardRepository implements IState<TimeCardEntity> {

    private final static List<TimeCardEntity> timeCard = new ArrayList();
    private final static Stack<TimeCardEntity> undo = new Stack();
    private final static Stack<TimeCardEntity> redo = new Stack();

    public void insertTimeCard(TimeCardEntity newTimeCardEntity) {
        TimeCardRepository.timeCard.add(newTimeCardEntity);
    }

    public List<TimeCardEntity> getAll() {
        List<TimeCardEntity> all = new ArrayList();
        TimeCardRepository.timeCard.stream().filter((timeCardEntity)
                -> (timeCardEntity.isActivate())).forEachOrdered((timeCardEntity) -> {
            all.add(timeCardEntity);
        });
        return all;
    }

    public void updateTimeCard(int index, TimeCardEntity timeCard) {
        TimeCardRepository.timeCard.set(index, timeCard);
    }

    public void delete(TimeCardEntity obj) {
        int index = TimeCardRepository.timeCard.indexOf(obj);
        TimeCardRepository.timeCard.get(index).setActivate(false);
    }

    @Override
    public void addUndo(TimeCardEntity timeCard) {
        TimeCardRepository.undo.add(timeCard);
    }

    public TimeCardEntity get() {
        return TimeCardRepository.undo.pop();
    }

    @Override
    public void undo() {
        if (!TimeCardRepository.undo.empty()) {
            TimeCardEntity timeCardEntity = TimeCardRepository.undo.pop();
            int index = TimeCardRepository.timeCard.indexOf(timeCardEntity);
            TimeCardRepository.timeCard.get(index).setActivate(true);
        }
    }

    public TimeCardEntity getSingle(String CPF) {

        EmployeeRepositoriy employeeRepository = new EmployeeRepositoriy();
        EmployeeEntity employee = employeeRepository.getForCPF(CPF);

        int index = TimeCardRepository.timeCard.indexOf(new TimeCardEntity(employee));
        return TimeCardRepository.timeCard.get(index);
    }

}
