/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.TimeCardEntity;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import repositories.TimeCardRepository;
import utils.IDateFormat;

/**
 *
 * @author Vinicius
 */
public class TimeCardController {

    public boolean createTimeCard(TimeCardEntity newTimeCard) {
        if (newTimeCard == null) {
            return false;
        }

        if (newTimeCard.getEmployee().getName().isEmpty()) {
            return false;
        }
        if (newTimeCard.getIn().toString().isEmpty()) {
            return false;
        }
        if (newTimeCard.getOut().toString().isEmpty()) {
            return false;
        }

        TimeCardRepository repository = new TimeCardRepository();

        repository.insertTimeCard(newTimeCard);
        return true;
    }

    public void addListTimeCard(TimeCardEntity newTimeCard, JTable table) {

        //table.addRowSelectionInterval(0, 0);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setNumRows(df.getRowCount() + 1);
        
        int row = df.getRowCount() - 1;
        table.setValueAt(newTimeCard.getEmployee().getName(), row, 0);
        table.setValueAt(IDateFormat.format.format(newTimeCard.getIn()), row, 1);
        table.setValueAt(IDateFormat.format.format(newTimeCard.getOut()), row, 2);
        table.setValueAt(newTimeCard.getId(), row, 3);

    }

    public void getAllTimeCards(JTable table) {
        TimeCardRepository repository = new TimeCardRepository();
        List<TimeCardEntity> list = repository.getAll();
        for (int i = 0; i < list.size(); i++) {
            addListTimeCard(list.get(i), table);
        }
    }

    public boolean updateTimeCard(TimeCardEntity oldTimeCard, TimeCardEntity newTimeCard, JTable table) {

        if (newTimeCard == null) {
            return false;
        }

        if (newTimeCard.getEmployee().getName().isEmpty()) {
            return false;
        }
        if (newTimeCard.getIn().toString().isEmpty()) {
            return false;
        }
        if (newTimeCard.getOut().toString().isEmpty()) {
            return false;
        }

        this.updateData(oldTimeCard, newTimeCard);
        this.updateTable(newTimeCard, table);
        return true;
    }

    private void updateData(TimeCardEntity oldTimeCard, TimeCardEntity newTimeCard) {
        TimeCardRepository repository = new TimeCardRepository();
        int index = repository.getAll().indexOf(oldTimeCard);
        repository.updateTimeCard(index, newTimeCard);
    }

    private void updateTable(TimeCardEntity timeCard, JTable table) {
        int row = table.getSelectedRow();

        table.setValueAt(timeCard.getEmployee().getName(), row, 0);
        table.setValueAt(timeCard.getIn().toString(), row, 1);
        table.setValueAt(timeCard.getOut().toString(), row, 2);
    }

    public void deleteTimeCard(TimeCardEntity timeCard, JTable table) {
        TimeCardRepository repository = new TimeCardRepository();
        repository.delete(timeCard);
        repository.addUndo(timeCard);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.removeRow(table.getSelectedRow());
    }

    public void undo() {
        TimeCardRepository repository = new TimeCardRepository();
        repository.undo();

    }

    public TimeCardEntity getSingleTimeCard(String cpf) {
        TimeCardRepository repository = new TimeCardRepository();
        return repository.getSingle(cpf);
    }
}
