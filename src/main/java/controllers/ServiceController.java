/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ServiceEntity;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import repositories.ServiceRepository;

/**
 *
 * @author Vinicius
 */
public class ServiceController {
    
    public boolean createService(ServiceEntity newService){
        if(newService == null) return false;
        ServiceRepository controller  = new ServiceRepository();
        
        controller.insertService(newService);
        return true;
    }
    
    public void addListService(ServiceEntity newService, JTable table){
        
        //table.addRowSelectionInterval(0, 0);
        
        DefaultTableModel df = (DefaultTableModel)table.getModel();
        df.setNumRows(df.getRowCount()+1);
        String rate = String.format("%.2f", newService.getRate());
        
        table.setValueAt(newService.getName(), df.getRowCount(), 0);
        table.setValueAt(rate, df.getRowCount(), 1);
        table.setValueAt(newService.getDescription(), df.getRowCount(), 2);
        table.setValueAt(newService.getDescription(), df.getRowCount(), 3);
        
    }
    
}
