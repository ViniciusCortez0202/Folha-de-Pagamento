/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Vinicius
 */
public class SalariedEntity extends EmployeeEntity {

    private String salary;

    public SalariedEntity(String salary, String name, AddressEntity address, String CPF, boolean union) {
        super(name, address, CPF, union);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }        
}
