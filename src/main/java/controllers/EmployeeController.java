/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.EmployeeEntity;
import repositories.EmployeeRepositoriy;

/**
 *
 * @author Vinicius
 */
public class EmployeeController {
    
    public boolean createEmployee(EmployeeEntity newEmployee){
        if(newEmployee == null) return false;
        EmployeeRepositoriy repository = new EmployeeRepositoriy();
        
        repository.insertEmployee(newEmployee);
        
        return true;
    }
    
}
