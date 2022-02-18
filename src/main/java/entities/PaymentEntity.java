/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.IPayment;

/**
 *
 * @author Vinicius
 */
public class PaymentEntity {

    private EmployeeEntity employeeEntity;
    private LocalDateTime lastPayment;
    private String value;

    public PaymentEntity(EmployeeEntity employeeEntity, LocalDateTime lastPayment, IPayment payment) {

        this.employeeEntity = employeeEntity;
        this.lastPayment = LocalDateTime.now();
        this.value = String.valueOf(payment.payment(employeeEntity));

    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public LocalDateTime getLastPayment() {
        return lastPayment;
    }

    public String getValue() {
        return value;
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
