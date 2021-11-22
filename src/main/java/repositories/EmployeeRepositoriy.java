/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.EmployeeEntity;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Vinicius
 */
public class EmployeeRepositoriy {
    
    private final List<EmployeeEntity> employee = new ArrayList();
    
    
    public void insertEmployee(EmployeeEntity newEmployee){
        this.employee.add(newEmployee);
    }
        
    
}
