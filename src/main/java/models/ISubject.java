/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Vinicius
 */
public interface ISubject<T> {
    void setValue(T object);
    void removeValue(T object);
    void subscribe(IObserver observer);
    void unSubscribe(IObserver observer);
    void alert();
}
