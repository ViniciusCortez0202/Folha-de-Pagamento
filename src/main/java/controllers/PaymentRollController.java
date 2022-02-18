/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.EmployeeEntity;
import entities.PaymentEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import repositories.PaymentRollRepository;

/**
 *
 * @author Vinicius
 */
public class PaymentRollController {

    public void paymentList(JTable table) {

        DefaultTableModel df = (DefaultTableModel) table.getModel();

        EmployeeController controller = new EmployeeController();
        List<EmployeeEntity> list = controller.getAll();       
        
        for (int i = 0; i < list.size(); i++) {
            EmployeeEntity employee = list.get(i); 
            System.out.println(employee.getPaymentDay().toLocalDate());
            System.out.println(LocalDate.now());
            if (employee.getPaymentDay().toLocalDate().equals(LocalDate.now())) {
                                
                df.setNumRows(df.getRowCount() + 1);
                int index = df.getRowCount() - 1;
                table.setValueAt(employee.getName(), index, 0);
                table.setValueAt(employee.getCPF(), index, 1);
                table.setValueAt(employee.getSalaryPayment(), index, 2);
                table.setValueAt(employee.getPayment().getType(), index, 3);
            }
        }
    }

}
