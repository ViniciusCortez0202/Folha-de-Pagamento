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
public class EmployeeEntity {
    
    private String name;
    private AddressEntity address;
    private String workTime;
    private String kickback;
    private String salary;

    public EmployeeEntity(String name, AddressEntity address, String workTime, String kickback, String salary) {
        this.name = name;
        this.address = address;
        this.workTime = workTime;
        this.kickback = kickback;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
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
