/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.SoldEntity;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import repositories.SoldRepository;

/**
 *
 * @author Vinicius
 */
public class SoldController {
     public boolean createSold(SoldEntity newSold) {
        if (newSold == null) {
            return false;
        }

        if (newSold.getEmployee().getCPF().isEmpty()) {
            return false;
        }
        if (newSold.getId().isEmpty()) {
            return false;
        }
        if (newSold.getValue().isEmpty()) {
            return false;
        }

        SoldRepository repository = new SoldRepository();

        repository.insertSold(newSold);
        return true;
    }

    public void addListSold(SoldEntity newSold, JTable table) {

        //table.addRowSelectionInterval(0, 0);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setNumRows(df.getRowCount() + 1);
        
        int row = df.getRowCount() - 1;
        table.setValueAt(newSold.getId(), row, 0);        
        table.setValueAt(newSold.getEmployee().getCPF(), row, 1);
        table.setValueAt(newSold.getValue(), row, 2);

    }

    public void getAllSold(JTable table) {
        SoldRepository repository = new SoldRepository();
        List<SoldEntity> list = repository.getAll();
        for (int i = 0; i < list.size(); i++) {
            addListSold(list.get(i), table);
        }
    }

    public boolean updateSold(SoldEntity oldSold, SoldEntity newSold, JTable table) {

        if (newSold == null) {
            return false;
        }

        if (newSold.getEmployee().getName().isEmpty()) {
            return false;
        }
        if (newSold.getValue().isEmpty()) {
            return false;
        }
        if (newSold.getId().isEmpty()) {
            return false;
        }

        this.updateData(oldSold, newSold);
        this.updateTable(newSold, table);
        return true;
    }

    private void updateData(SoldEntity oldSold, SoldEntity newSold) {
        SoldRepository repository = new SoldRepository();
        int index = repository.getAll().indexOf(oldSold);
        repository.updateServiceforName(index, newSold);
    }

    private void updateTable(SoldEntity sold, JTable table) {
        int row = table.getSelectedRow();

        table.setValueAt(sold.getId(), row, 0);
        table.setValueAt(sold.getEmployee().getCPF(), row, 1);
        table.setValueAt(sold.getValue(), row, 2);
    }

    public void deleteSold(SoldEntity sold, JTable table) {
        SoldRepository repository = new SoldRepository();
        repository.delete(sold);
        repository.addUndo(sold);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.removeRow(table.getSelectedRow());
    }

    public void undo() {
        SoldRepository repository = new SoldRepository();
        repository.undo();

    }

    public SoldEntity getSingleSold(String cpf) {
        SoldRepository repository = new SoldRepository();
        return repository.getSingle(cpf);
    }
}
