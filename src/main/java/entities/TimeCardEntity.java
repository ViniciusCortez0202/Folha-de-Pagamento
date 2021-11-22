/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Vinicius
 */
public class TimeCardEntity {
    private EmployeeEntity employee;
    private Date in;
    private Date out;

    public TimeCardEntity(EmployeeEntity employee, Date in, Date out) {
        this.employee = employee;
        this.in = in;
        this.out = out;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Date getIn() {
        return in;
    }

    public void setIn(Date in) {
        this.in = in;
    }

    public Date getOut() {
        return out;
    }

    public void setOut(Date out) {
        this.out = out;
    }
    
    
}
