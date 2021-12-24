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
public class HourlyEntity extends EmployeeEntity{

    private String workTime;

    public HourlyEntity(String workTime, String name, AddressEntity address, String CPF, boolean union, PaymentTypeEnum payment) {
        super(name, address, CPF, union, payment);
        this.workTime = workTime;
    }
    
    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

}
