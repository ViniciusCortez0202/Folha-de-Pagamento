/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.ServiceEntity;

/**
 *
 * @author Vinicius
 */
public interface IState<T> {
    public void addUndo(T obj);
    public void undo();
    
}
