/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDateTime;
import models.CommissionPayment;
import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public class CommissionedEntity extends EmployeeEntity {

    private String kickback;
    private String salary;

    public CommissionedEntity(String kickback, String salary, String name,
            AddressEntity address, String CPF, boolean union,
            PaymentTypeEnum payment, LocalDateTime admission) {
        super(name, address, CPF, union, payment,
                admission.plusDays(15), new CommissionPayment(), admission);
        this.kickback = kickback;
        this.salary = salary;
        ScheduleEntity commissioned = new ScheduleEntity("commissioned", "15");
        super.setSchedule(commissioned);

    }

    public String getKickback() {
        return kickback;
    }

    public void setKickback(String kickback) {
        this.kickback = kickback;
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
