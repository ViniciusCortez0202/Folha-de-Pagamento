/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Vinicius
 */
public enum TypeEmployEnum {
    Commissionaed("Comissioanado"),
    Hourly("Horista"),
    Salaried("Assalariado");

    private String type;

    private TypeEmployEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
