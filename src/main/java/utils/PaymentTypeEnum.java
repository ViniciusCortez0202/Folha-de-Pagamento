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
public enum PaymentTypeEnum {
    Bank("Banco"),
    Hand("Em mãos"),
    Post("Correios");

    private String type;

    private PaymentTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    
}
