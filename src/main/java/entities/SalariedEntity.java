/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDateTime;
import models.SalaryPayment;
import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public class SalariedEntity extends EmployeeEntity {

    private String salary;

    public SalariedEntity(String salary, String name, AddressEntity address,
            String CPF, boolean union, PaymentTypeEnum payment, LocalDateTime admission) {
        super(name, address, CPF, union, payment,
                admission.plusDays(30), new SalaryPayment(), admission);
        this.salary = salary;

        ScheduleEntity salaried = new ScheduleEntity("salaried", "30");
        super.setSchedule(salaried);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public double getSalaryPayment() {
        return super.getPaymenteValue().payment(this);
    }
}
