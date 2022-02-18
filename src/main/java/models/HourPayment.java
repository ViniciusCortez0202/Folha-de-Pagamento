/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.TimeCardController;
import entities.HourlyEntity;
import entities.TimeCardEntity;
import java.time.Duration;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class HourPayment implements IPayment<HourlyEntity>{

    @Override
    public double payment(HourlyEntity employee) {
        double salary;
        
        double time = 0;

            TimeCardController timeCard = new TimeCardController();

            List<TimeCardEntity> timeCards = timeCard.getAllTimeCards();

            for (int i = 0; i < timeCards.size(); i++) {
                if (timeCards.get(i).getEmployee().equals(employee)) {
                    time += Duration.between(timeCards.get(i).getIn(), timeCards.get(i).getOut()).toHours();
                }
            }
        System.out.println(time);            
            double work = Double.parseDouble(employee.getWorkTime());
            if(time <= 8){
                salary = time * work;
            } else {
                salary = 8*work + ((time - 8) * (work*1.5));
            }
        
        return salary;
    }
    
}
