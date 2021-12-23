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
public class CommissionedEntity extends EmployeeEntity {

    private String kickback;
    private String salary;

    public CommissionedEntity(String kickback, String salary, String name, AddressEntity address, String CPF, boolean union) {
        super(name, address, CPF, union);
        this.kickback = kickback;
        this.salary = salary;
    }

  

    public String getKickback() {
        return kickback;
    }

    public void setKickback(String kickback) {
        this.kickback = kickback;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
