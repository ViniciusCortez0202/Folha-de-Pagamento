/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDateTime;
import models.HourPayment;
import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public class HourlyEntity extends EmployeeEntity {

    private String workTime;

    public HourlyEntity(String workTime, String name, AddressEntity address, 
            String CPF, boolean union, PaymentTypeEnum payment, LocalDateTime admission) {
        super(name, address, CPF, union, payment,
                admission.plusDays(7), new HourPayment(), admission);
        this.workTime = workTime;

        ScheduleEntity hourly = new ScheduleEntity("hourly", "7");
        super.setSchedule(hourly);
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    @Override
    public double getSalaryPayment() {
        return super.getPaymenteValue().payment(this);
    }

}
