/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.SoldController;
import entities.CommissionedEntity;
import entities.SoldEntity;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class CommissionPayment implements IPayment<CommissionedEntity>{

    @Override
    public double payment(CommissionedEntity employee) {
        double salary;
        
        salary = Double.parseDouble(employee.getSalary());

            SoldController sold = new SoldController();

            List<SoldEntity> solds = sold.getAllSold();

            for (int i = 0; i < solds.size(); i++) {
                if (solds.get(i).getEmployee().equals(employee)) {
                    salary += Double.parseDouble(solds.get(i).getValue());
                    solds.get(i).setActivate(false);
                }
            }
        return salary;
    }
    
}
