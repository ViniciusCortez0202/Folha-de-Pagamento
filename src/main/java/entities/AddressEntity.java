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
public class AddressEntity {
    private String address;
    private String number;
    private String district;
    private String city;
    private String states;
    private String CEP;

    public AddressEntity(String address, String number, String district) {
        this.address = address;
        this.number = number;
        this.district = district;
    }

    public AddressEntity(String address, String number, String district, String city, String states, String CEP) {
        this.address = address;
        this.number = number;
        this.district = district;
        this.city = city;
        this.states = states;
        this.CEP = CEP;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    
}
