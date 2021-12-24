/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public abstract class EmployeeEntity {

    private String name;
    private AddressEntity address;
    private boolean activate;
    private String CPF;
    private ServiceEntity service;
    private boolean union;
    private PaymentTypeEnum payment;
    private String unionRate;
    private ScheduleEntity schedule;

    public EmployeeEntity(String name, AddressEntity address, String CPF, boolean union, PaymentTypeEnum payment) {
        unionRate = null;
        schedule = null;
        this.service = null;
        this.activate = true;
        this.name = name;
        this.address = address;
        this.CPF = CPF;
        this.union = union;
        this.payment = payment;
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

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ServiceEntity getService() {
        return service;
    }

    public void setServices(ServiceEntity service) {
        this.service = service;
    }

    public boolean isUnion() {
        return union;
    }

    public void setUnion(boolean union) {
        this.union = union;
    }

    public PaymentTypeEnum getPayment() {
        return payment;
    }

    public void setPayment(PaymentTypeEnum payment) {
        this.payment = payment;
    }

    public String getUnionRate() {
        return unionRate;
    }

    public void setUnionRate(String unionRate) {
        this.unionRate = unionRate;
    }

    public ScheduleEntity getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleEntity schedule) {
        this.schedule = schedule;
    }
       
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.CPF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeEntity other = (EmployeeEntity) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }

}
