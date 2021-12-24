/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public class SalariedEntity extends EmployeeEntity {

    private String salary;

    public SalariedEntity(String salary, String name, AddressEntity address, String CPF, boolean union, PaymentTypeEnum payment) {
        super(name, address, CPF, union, payment);
        this.salary = salary;
        
        ScheduleEntity salaried = new ScheduleEntity("salaried", "7");
        super.setSchedule(salaried);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }        
}
