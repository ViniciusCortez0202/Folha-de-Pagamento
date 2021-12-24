/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.PaymentEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class PaymentRollRepository {
    
    private static List<PaymentEntity> payment = new ArrayList();
    
    public List<PaymentEntity> getAll(){
        return PaymentRollRepository.payment;
    }
    
    public void setPayment(PaymentEntity newPayment){
        PaymentRollRepository.payment.add(newPayment);
    }
    
}
