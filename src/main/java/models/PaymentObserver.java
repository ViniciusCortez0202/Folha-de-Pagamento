/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.EmployeeController;
import entities.EmployeeEntity;
import entities.PaymentEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class PaymentObserver implements IObserver{

    public PaymentObserver(PaymentEntity payment, ISubject subject) {
        subject.subscribe(this);
        subject.setValue(payment);
    }        

    @Override
    public void make() {
        EmployeeController controller = new EmployeeController();
        List<EmployeeEntity> list = controller.getAll(); 
        
        for (int i = 0; i < list.size(); i++) {
            EmployeeEntity employee = list.get(i);            
            if (employee.getPaymentDay().toLocalDate().equals(LocalDate.now())) {  
                int n = Integer.parseInt(employee.getSchedule().getSchedule());                                
                employee.setPaymentDay(LocalDateTime.now().plusDays( n ));
            }
        }
    }
    
}
