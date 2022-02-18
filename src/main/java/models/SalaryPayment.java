/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.SalariedEntity;

/**
 *
 * @author Vinicius
 */
public class SalaryPayment implements IPayment<SalariedEntity>{

    @Override
    public double payment(SalariedEntity employee) {
        return Double.valueOf(employee.getSalary());
    }


    
}
