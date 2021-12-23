/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.AddressEntity;
import entities.EmployeeEntity;
import entities.HourlyEntity;
import entities.ServiceEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Vinicius
 */
public class EmployeeRepositoriy implements IState<EmployeeEntity> {

    private static final List<EmployeeEntity> employee = new ArrayList();
    private static final Stack<EmployeeEntity> undo = new Stack();
    private static final Stack<EmployeeEntity> redo = new Stack();

    public void insertEmployee(EmployeeEntity newEmployee) {
        EmployeeRepositoriy.employee.add(newEmployee);
    }

    public List<EmployeeEntity> getAll() {
        List<EmployeeEntity> all = new ArrayList();
        EmployeeRepositoriy.employee.stream().filter((employee)
                -> (employee.isActivate())).forEachOrdered((employee) -> {
            all.add(employee);
        });

        return all;
    }

    public void updateforCPF(int index, EmployeeEntity obj) {
        EmployeeRepositoriy.employee.set(index, obj);
    }

    public void delete(EmployeeEntity obj) {
        int index = EmployeeRepositoriy.employee.indexOf(obj);
        EmployeeRepositoriy.employee.get(index).setActivate(false);
    }

    @Override
    public void addUndo(EmployeeEntity obj) {
        EmployeeRepositoriy.undo.add(obj);
    }

    @Override
    public void undo() {
        if (!EmployeeRepositoriy.undo.empty()) {
            EmployeeEntity employeeEntity = EmployeeRepositoriy.undo.pop();
            int index = EmployeeRepositoriy.employee.indexOf(employeeEntity);
            EmployeeRepositoriy.employee.get(index).setActivate(true);
        }
    }

    public EmployeeEntity getForCPF(String CPF) {
        EmployeeEntity employeeEntity = null;
        for (int i = 0; i < EmployeeRepositoriy.employee.size(); i++) {
            if (EmployeeRepositoriy.employee.get(i).getCPF().equals(CPF)) {
                employeeEntity = EmployeeRepositoriy.employee.get(i);
            }
        }
        return employeeEntity;
    }

}
