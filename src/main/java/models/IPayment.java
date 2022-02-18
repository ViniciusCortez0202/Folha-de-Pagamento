/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.EmployeeEntity;

/**
 *
 * @author Vinicius
 * @param <T>
 */
public interface IPayment<T extends EmployeeEntity> {
    double payment(T employee);
}
