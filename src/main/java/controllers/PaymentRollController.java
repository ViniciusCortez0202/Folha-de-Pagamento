/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.CommissionedEntity;
import entities.EmployeeEntity;
import entities.HourlyEntity;
import entities.PaymentEntity;
import entities.SalariedEntity;
import entities.SoldEntity;
import entities.TimeCardEntity;
import java.time.temporal.ChronoUnit;
import java.util.List;
import repositories.PaymentRollRepository;
import utils.TypeEmployEnum;

/**
 *
 * @author Vinicius
 */
public class PaymentRollController {
    
    
    public void paymentList(){
        
        EmployeeController controller = new EmployeeController();
        List<EmployeeEntity> list = controller.getAll();
        PaymentRollRepository repository = new PaymentRollRepository();
        
        List<PaymentEntity> payment = repository.getAll();
        
        for(int i = 0; i < list.size(); i++){
            if(payment.contains(list.get(i))){
                int index = payment.indexOf(list.get(i));               
            }
        }
    }

    private double calculatePayment(EmployeeEntity newEmployee) {
        PaymentRollRepository repository = new PaymentRollRepository();
        List<PaymentEntity> list = repository.getAll();

        double value = 0;

        if (newEmployee instanceof CommissionedEntity) {
            CommissionedEntity commissionedEntity = (CommissionedEntity) newEmployee;

            value = Double.parseDouble(commissionedEntity.getSalary());

            SoldController sold = new SoldController();

            List<SoldEntity> solds = sold.getAllSold();

            for (int i = 0; i < solds.size(); i++) {
                if (solds.get(i).getEmployee().equals(newEmployee)) {
                    value += Double.parseDouble(solds.get(i).getValue());
                    solds.get(i).setActivate(false);
                }
            }

        } else if (newEmployee instanceof HourlyEntity) {
            HourlyEntity hourlyEntity = (HourlyEntity) newEmployee;

            double time = 0;

            TimeCardController timeCard = new TimeCardController();

            List<TimeCardEntity> timeCards = timeCard.getAllTimeCards();

            for (int i = 0; i < timeCards.size(); i++) {
                if (timeCards.get(i).getEmployee().equals(newEmployee)) {
                    time = ChronoUnit.HOURS.between(timeCards.get(i).getOut().toInstant(), timeCards.get(i).getIn().toInstant());
                }
            }
            double work = Double.parseDouble(hourlyEntity.getWorkTime());
            if(time <= 8){
                value = time * work;
            } else {
                value = 8*work + ((time - 8) * (work*15));
            }

        } else if (newEmployee instanceof SalariedEntity) {
            SalariedEntity salariedEntity = (SalariedEntity) newEmployee;
            value = Double.parseDouble(salariedEntity.getSalary());
        }
        return value;
    }

}
