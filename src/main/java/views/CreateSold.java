/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import controllers.SoldController;
import entities.SoldEntity;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius
 */
public class CreateSold extends javax.swing.JPanel {

    /**
     * Creates new form AddRateService
     */
    public CreateSold() {
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicesEmployee = new javax.swing.JTable();
        jLabelChoseidEmployee = new javax.swing.JLabel();
        jTextFieldEmployeeId = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonUndo = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelValue = new javax.swing.JLabel();
        jFormattedTextFieldValue = new javax.swing.JFormattedTextField();

        jButtonAdd.setText("Adiconar");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jTableServicesEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Funcionario", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableServicesEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServicesEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableServicesEmployee);
        if (jTableServicesEmployee.getColumnModel().getColumnCount() > 0) {
            jTableServicesEmployee.getColumnModel().getColumn(0).setResizable(false);
            jTableServicesEmployee.getColumnModel().getColumn(1).setResizable(false);
            jTableServicesEmployee.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabelChoseidEmployee.setText("C??digo Funcion??rio:");

        jButtonDelete.setVisible(false);
        jButtonDelete.setText("Deletar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUndo.setText("Undo");
        jButtonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUndoActionPerformed(evt);
            }
        });

        jButtonClear.setText("Limpar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelValue.setText("Valor:");

        jFormattedTextFieldValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAdd)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelChoseidEmployee)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldValue)
                                    .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonClear)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChoseidEmployee)
                            .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jButtonAdd)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelValue)
                                    .addComponent(jFormattedTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonClear)
                                    .addComponent(jButtonUndo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String cpf = this.jTextFieldEmployeeId.getText();
        String value = this.jFormattedTextFieldValue.getText();

        SoldController controller = new SoldController();
        EmployeeController employeeController = new EmployeeController();

        SoldEntity newSold = new SoldEntity(String.valueOf(System.currentTimeMillis()), employeeController.getEmployeeForCPF(cpf), value);

        if (!controller.createSold(newSold)) {
            JOptionPane.showMessageDialog(null, "Por Favor, preencha todos os campos", "Vazio!", JOptionPane.ERROR_MESSAGE);

        } else {
            controller.addListSold(newSold, this.jTableServicesEmployee);
            clear();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String cpf = this.jTextFieldEmployeeId.getText();
        String value = this.jFormattedTextFieldValue.getText();

        SoldController controller = new SoldController();
        EmployeeController employeeController = new EmployeeController();
        int row = this.jTableServicesEmployee.getSelectedRow();
        String id = this.jTableServicesEmployee.getValueAt(row, 0).toString();

        SoldEntity sold = new SoldEntity(id, employeeController.getEmployeeForCPF(cpf), value);

        controller.deleteSold(sold, this.jTableServicesEmployee);
        clear();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUndoActionPerformed
        // TODO add your handling code here:
        SoldController controller = new SoldController();
        controller.undo();
        DefaultTableModel df = (DefaultTableModel) this.jTableServicesEmployee.getModel();
        df.getDataVector().removeAllElements();
        controller.getAllSold(this.jTableServicesEmployee);
    }//GEN-LAST:event_jButtonUndoActionPerformed

    private void jTableServicesEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServicesEmployeeMouseClicked
        // TODO add your handling code here:
        int index = this.jTableServicesEmployee.getSelectedRow();
        EmployeeController employeeController = new EmployeeController();

        SoldEntity sold = new SoldEntity(
                this.jTableServicesEmployee.getValueAt(index, 0).toString(),
                employeeController.getEmployeeForCPF(this.jTableServicesEmployee.getValueAt(index, 1).toString()),
                this.jTableServicesEmployee.getValueAt(index, 2).toString()
        );

        this.jTextFieldEmployeeId.setText(sold.getEmployee().getCPF());
        this.jFormattedTextFieldValue.setText(sold.getValue());

        this.jButtonAdd.setVisible(false);
        this.jButtonDelete.setVisible(true);        
    }//GEN-LAST:event_jTableServicesEmployeeMouseClicked

    private void load() {
        SoldController controller = new SoldController();
        controller.getAllSold(this.jTableServicesEmployee);
    }

    private void clear() {
        this.jButtonAdd.setVisible(true);
        this.jButtonDelete.setVisible(false);
        this.jTextFieldEmployeeId.setText("");
        this.jFormattedTextFieldValue.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUndo;
    private javax.swing.JFormattedTextField jFormattedTextFieldValue;
    private javax.swing.JLabel jLabelChoseidEmployee;
    private javax.swing.JLabel jLabelValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableServicesEmployee;
    private javax.swing.JTextField jTextFieldEmployeeId;
    // End of variables declaration//GEN-END:variables
}
