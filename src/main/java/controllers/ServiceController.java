/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ServiceEntity;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import repositories.ServiceRepository;

/**
 *
 * @author Vinicius
 */
public class ServiceController {

    public boolean createService(ServiceEntity newService) {
        if (newService == null) {
            return false;
        }

        if (newService.getName().isEmpty()) {
            return false;
        }
        if (newService.getDescription().isEmpty()) {
            return false;
        }

        ServiceRepository repository = new ServiceRepository();

        repository.insertService(newService);
        return true;
    }

    public void addListService(ServiceEntity newService, JTable table) {

        //table.addRowSelectionInterval(0, 0);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setNumRows(df.getRowCount() + 1);
        String rate = String.format("%.2f", newService.getRate());
        int index = df.getRowCount() - 1;
        table.setValueAt(newService.getName(), index, 0);
        table.setValueAt(rate, index, 1);
        table.setValueAt(newService.getDescription(), index, 2);

    }

    public void getAllServices(JTable table) {
        ServiceRepository repository = new ServiceRepository();
        List<ServiceEntity> list = repository.getAll();
        for (int i = 0; i < list.size(); i++) {
            addListService(list.get(i), table);
        }
    }

    public boolean updateService(ServiceEntity oldService, ServiceEntity newService, JTable table) {

        if (newService == null) {
            return false;
        }

        if (newService.getName().isEmpty()) {
            return false;
        }
        if (newService.getDescription().isEmpty()) {
            return false;
        }

        this.updateData(oldService, newService);
        this.updateTable(newService, table);
        return true;
    }

    private void updateData(ServiceEntity oldService, ServiceEntity newService) {
        ServiceRepository repository = new ServiceRepository();
        int index = repository.getAll().indexOf(oldService);
        repository.updateServiceforName(index, newService);
    }

    private void updateTable(ServiceEntity service, JTable table) {
        int row = table.getSelectedRow();

        String rate = String.format("%.2f", service.getRate()).replace('.', ',');

        table.setValueAt(service.getName(), row, 0);
        table.setValueAt(rate, row, 1);
        table.setValueAt(service.getDescription(), row, 2);
    }

    public void deleteService(ServiceEntity service, JTable table) {
        ServiceRepository repository = new ServiceRepository();
        repository.delete(service);
        repository.addUndo(service);
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.removeRow(table.getSelectedRow());
    }

    public void undo() {
        ServiceRepository repository = new ServiceRepository();
        repository.undo();

    }

    public ServiceEntity getSingleServiceForName(String name) {
        ServiceRepository repository = new ServiceRepository();
        return repository.getSingle(name);
    }
}
