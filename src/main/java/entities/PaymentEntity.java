/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.IDateFormat;

/**
 *
 * @author Vinicius
 */
public class PaymentEntity {
    private EmployeeEntity employeeEntity;
    private Date lastPayment;
    private String value;

    public PaymentEntity(EmployeeEntity employeeEntity, Date lastPayment, String value) {
        try {
            this.employeeEntity = employeeEntity;
            this.lastPayment = IDateFormat.format.parse(this.getDate());
            this.value = value;
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    private String getDate(){
        StringBuilder date = new StringBuilder();
        int day = LocalDate.now().getDayOfMonth();
        date.append(
                ((day < 10) ? "0" + String.valueOf(day) : String.valueOf(day))
        );
        date.append("/");
        int month = LocalDate.now().getMonthValue();
        date.append(
                ((month < 10) ? "0" + String.valueOf(month) : String.valueOf(month))
        );
        date.append("/");
        int year = LocalDate.now().getYear();
        date.append(
                String.valueOf(year)
        ).append(" 12:00");
        
        return date.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.employeeEntity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaymentEntity other = (PaymentEntity) obj;
        if (!Objects.equals(this.employeeEntity, other.employeeEntity)) {
            return false;
        }
        return true;
    }
    
    
    
}
