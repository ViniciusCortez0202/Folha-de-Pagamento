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
    
    private LocalDateTime lastPayment;
    private String value;

    public PaymentEntity(String value) {
        this.lastPayment = LocalDateTime.now();
        this.value = value;
    }


    public LocalDateTime getLastPayment() {
        return lastPayment;
    }

    public String getValue() {
        return value;
    }
}
