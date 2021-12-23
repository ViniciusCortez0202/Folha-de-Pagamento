/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.EmployeeEntity;
import repositories.EmployeeRepositoriy;
import entities.CommissionedEntity;
import entities.HourlyEntity;
import entities.SalariedEntity;
import entities.ServiceEntity;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import repositories.ServiceRepository;
import utils.TypeEmployEnum;

/**
 *
 * @author Vinicius
 */
public class EmployeeController {

    public boolean createEmployee(EmployeeEntity newEmployee) {
        if (newEmployee == null) {
            return false;
        }
        EmployeeRepositoriy repository = new EmployeeRepositoriy();

        if (newEmployee instanceof CommissionedEntity) {
            repository.insertEmployee((CommissionedEntity) newEmployee);
        } else if (newEmployee instanceof HourlyEntity) {
            repository.insertEmployee((HourlyEntity) newEmployee);
        } else if (newEmployee instanceof SalariedEntity) {
            repository.insertEmployee((SalariedEntity) newEmployee);
        }

        return true;
    }

    public boolean updateEmployee(EmployeeEntity newEmployee) {

        if (newEmployee == null) {
            return false;
        }
        EmployeeRepositoriy repository = new EmployeeRepositoriy();
        int index = repository.getAll().indexOf(newEmployee);
        repository.updateforCPF(index, newEmployee);

        return true;
    }

    public void delete(EmployeeEntity employeeEntity) {
        EmployeeRepositoriy repository = new EmployeeRepositoriy();
        repository.delete(employeeEntity);
        repository.addUndo(employeeEntity);
    }

    private void addEmployeTable(EmployeeEntity newEmployee, JTable table) {
        //table.addRowSelectionInterval(0, 0);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setNumRows(df.getRowCount() + 1);
        //String rate = String.format("%.2f", newService.getRate());
        int index = df.getRowCount() - 1;

        if (newEmployee instanceof CommissionedEntity) {
            CommissionedEntity commissionedEntity = (CommissionedEntity) newEmployee;
            table.setValueAt(commissionedEntity.getName(), index, 0);
            table.setValueAt(commissionedEntity.getAddress().getCEP(), index, 1);
            table.setValueAt(TypeEmployEnum.Commissionaed.getType(), index, 2);
            table.setValueAt(commissionedEntity.getSalary(), index, 3);
            table.setValueAt("-", index, 4);
            table.setValueAt(commissionedEntity.getKickback(), index, 5);
            table.setValueAt(commissionedEntity.getCPF(), index, 6);

        } else if (newEmployee instanceof HourlyEntity) {
            HourlyEntity hourlyEntity = (HourlyEntity) newEmployee;
            table.setValueAt(hourlyEntity.getName(), index, 0);
            table.setValueAt(hourlyEntity.getAddress().getCEP(), index, 1);
            table.setValueAt(TypeEmployEnum.Hourly.getType(), index, 2);
            table.setValueAt("-", index, 3);
            table.setValueAt(hourlyEntity.getWorkTime(), index, 4);
            table.setValueAt("-", index, 5);
            table.setValueAt(hourlyEntity.getCPF(), index, 6);
        } else if (newEmployee instanceof SalariedEntity) {
            SalariedEntity salariedEntity = (SalariedEntity) newEmployee;
            table.setValueAt(salariedEntity.getName(), index, 0);
            table.setValueAt(salariedEntity.getAddress().getCEP(), index, 1);
            table.setValueAt(TypeEmployEnum.Salaried.getType(), index, 2);
            table.setValueAt(salariedEntity.getSalary(), index, 3);
            table.setValueAt("-", index, 4);
            table.setValueAt("-", index, 5);
            table.setValueAt(salariedEntity.getCPF(), index, 6);
        }

    }

    public EmployeeEntity getEmployeeForCPF(String CPF) {
        EmployeeRepositoriy repository = new EmployeeRepositoriy();
        return repository.getForCPF(CPF);
    }

    public void getAll(JTable table) {
        EmployeeRepositoriy repository = new EmployeeRepositoriy();
        List<EmployeeEntity> list = repository.getAll();
        for (int i = 0; i < list.size(); i++) {
            addEmployeTable(list.get(i), table);
        }
    }

    public void undo() {
        EmployeeRepositoriy repository = new EmployeeRepositoriy();        
        repository.undo();
    }
    
    public List<ServiceEntity> getServices(){
        ServiceRepository repository = new ServiceRepository();
        
        return repository.getAll();
    }       
    
}
