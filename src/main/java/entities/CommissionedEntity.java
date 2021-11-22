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
public class CommissionedEntity extends EmployeeEntity{

    private String kickback;

    public CommissionedEntity(String kickback, String name, AddressEntity address) {
        super(name, address);
        this.kickback = kickback;
    }

    public String getKickback() {
        return kickback;
    }

    public void setKickback(String kickback) {
        this.kickback = kickback;
    }
    
    
}
