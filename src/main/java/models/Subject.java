/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.PaymentEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class Subject implements ISubject<PaymentEntity>{
    List<IObserver> observers;
    List<PaymentEntity> payment;

    public Subject() {
        this.observers = new ArrayList<IObserver>();
        this.payment = new ArrayList<>();
    }        

    @Override
    public void subscribe(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribe(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void alert() {
        this.observers.forEach(action -> {
            action.make();
        });
    }

    @Override
    public void setValue(PaymentEntity object) {
        this.payment.add(object);
        this.alert();
    }

    @Override
    public void removeValue(PaymentEntity object) {
        this.payment.add(object);
        this.alert();
    }
    
    
    
    
}
