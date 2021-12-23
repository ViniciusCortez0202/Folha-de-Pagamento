/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ScheduleEntity;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import repositories.ScheduleRepository;

/**
 *
 * @author Vinicius
 */
public class ScheduleController {
    
     public boolean createSchedule(ScheduleEntity newSchedule) {
        if (newSchedule == null) {
            return false;
        }

        if (newSchedule.getName().isEmpty()) {
            return false;
        }
        if (newSchedule.getSchedule().isEmpty()) {
            return false;
        }

        ScheduleRepository repository = new ScheduleRepository();

        repository.insertSchedule(newSchedule);
        return true;
    }

    public void addListSchedule(ScheduleEntity newSchedule, JTable table) {

        //table.addRowSelectionInterval(0, 0);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setNumRows(df.getRowCount() + 1);
        int index = df.getRowCount() - 1;
        table.setValueAt(newSchedule.getName(), index, 0);
        table.setValueAt(newSchedule.getSchedule(), index, 1);

    }

    public void getAllSchedules(JTable table) {
        ScheduleRepository repository = new ScheduleRepository();
        List<ScheduleEntity> list = repository.getAll();
        for (int i = 0; i < list.size(); i++) {
            addListSchedule(list.get(i), table);
        }
    }

    public boolean updateSchedule(ScheduleEntity oldSchedule, ScheduleEntity newSchedule, JTable table) {

        if (newSchedule == null) {
            return false;
        }

        if (newSchedule.getName().isEmpty()) {
            return false;
        }       

        this.updateData(oldSchedule, newSchedule);
        this.updateTable(newSchedule, table);
        return true;
    }

    private void updateData(ScheduleEntity oldSchedule, ScheduleEntity newSchedule) {
        ScheduleRepository repository = new ScheduleRepository();
        int index = repository.getAll().indexOf(oldSchedule);
        repository.updateScheduleforName(index, newSchedule);
    }

    private void updateTable(ScheduleEntity Schedule, JTable table) {
        int row = table.getSelectedRow();        

        table.setValueAt(Schedule.getName(), row, 0);
        table.setValueAt(Schedule.getSchedule(), row, 1);  
    }

    public void deleteSchedule(ScheduleEntity Schedule, JTable table) {
        ScheduleRepository repository = new ScheduleRepository();
        repository.delete(Schedule);
        repository.addUndo(Schedule);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.removeRow(table.getSelectedRow());
    }

    public void undo() {
        ScheduleRepository repository = new ScheduleRepository();
        repository.undo();

    }

    public ScheduleEntity getSingleScheduleForName(String name) {
        ScheduleRepository repository = new ScheduleRepository();
        return repository.getSingle(name);
    }
    
}
