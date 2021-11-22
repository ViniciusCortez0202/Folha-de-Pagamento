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
public class ServiceEntity {
    private String name;
    private double rate;
    private String description;

    public ServiceEntity(String name, double rate, String description) {
        this.name = name;
        this.rate = rate;
        this.description = description;
    }

    public ServiceEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
