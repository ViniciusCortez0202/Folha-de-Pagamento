/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entities.AddressEntity;
import entities.HourlyEntity;
import javax.swing.JFrame;
import repositories.EmployeeRepositoriy;
import utils.PaymentTypeEnum;

/**
 *
 * @author Vinicius
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {        
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        AddressEntity ad = new AddressEntity("margarida", "20", "grande", "arapiraca", "al", "57.307-160");
        HourlyEntity hr = new HourlyEntity("33,00", "Vinicius", ad, "12921601443", true, PaymentTypeEnum.Bank);
          
        EmployeeRepositoriy e = new EmployeeRepositoriy();
        e.insertEmployee(hr);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarAcoes = new javax.swing.JMenuBar();
        jMenuEmpregados = new javax.swing.JMenu();
        jMenuItemEmpregadoAdicionar = new javax.swing.JMenuItem();
        jMenuItemEmpregadoModificar = new javax.swing.JMenuItem();
        jMenuPagamentos = new javax.swing.JMenu();
        jMenuItemPagamentosFolha = new javax.swing.JMenuItem();
        jMenuItemPagamentosAgendas = new javax.swing.JMenuItem();
        jMenuLancamentos = new javax.swing.JMenu();
        jMenuItemLancamentosServicos = new javax.swing.JMenuItem();
        jMenuItemLancamentosPonto = new javax.swing.JMenuItem();
        jMenuItemLancamentosVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jMenuEmpregados.setText("Empregados");

        jMenuItemEmpregadoAdicionar.setText("Adicionar");
        jMenuItemEmpregadoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpregadoAdicionarActionPerformed(evt);
            }
        });
        jMenuEmpregados.add(jMenuItemEmpregadoAdicionar);

        jMenuItemEmpregadoModificar.setText("Modificar");
        jMenuItemEmpregadoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpregadoModificarActionPerformed(evt);
            }
        });
        jMenuEmpregados.add(jMenuItemEmpregadoModificar);

        jMenuBarAcoes.add(jMenuEmpregados);

        jMenuPagamentos.setText("Pagamentos");

        jMenuItemPagamentosFolha.setText("Folha de Pagamento");
        jMenuPagamentos.add(jMenuItemPagamentosFolha);

        jMenuItemPagamentosAgendas.setText("Agendas");
        jMenuItemPagamentosAgendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPagamentosAgendasActionPerformed(evt);
            }
        });
        jMenuPagamentos.add(jMenuItemPagamentosAgendas);

        jMenuBarAcoes.add(jMenuPagamentos);

        jMenuLancamentos.setText("Lançamentos");

        jMenuItemLancamentosServicos.setText("Serviços");
        jMenuItemLancamentosServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLancamentosServicosActionPerformed(evt);
            }
        });
        jMenuLancamentos.add(jMenuItemLancamentosServicos);

        jMenuItemLancamentosPonto.setText("Cartão de Ponto");
        jMenuItemLancamentosPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLancamentosPontoActionPerformed(evt);
            }
        });
        jMenuLancamentos.add(jMenuItemLancamentosPonto);

        jMenuItemLancamentosVenda.setText("Venda");
        jMenuItemLancamentosVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLancamentosVendaActionPerformed(evt);
            }
        });
        jMenuLancamentos.add(jMenuItemLancamentosVenda);

        jMenuBarAcoes.add(jMenuLancamentos);

        setJMenuBar(jMenuBarAcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEmpregadoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpregadoAdicionarActionPerformed
        // TODO add your handling code here:
        CreateEmployee createEmployee = new CreateEmployee();

        //novo.setVisible(true);
        this.setContentPane(createEmployee);
        this.pack();
        this.repaint();

    }//GEN-LAST:event_jMenuItemEmpregadoAdicionarActionPerformed

    private void jMenuItemEmpregadoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpregadoModificarActionPerformed
        // TODO add your handling code here:
        ModifyEmployee modifyEmployee = new ModifyEmployee();

        //novo.setVisible(true);
        this.setContentPane(modifyEmployee);
        this.pack();
        this.repaint();
    }//GEN-LAST:event_jMenuItemEmpregadoModificarActionPerformed

    private void jMenuItemPagamentosAgendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPagamentosAgendasActionPerformed
        // TODO add your handling code here:
        CreateSchedule createSchedule = new CreateSchedule();

        //novo.setVisible(true);        
        this.setContentPane(createSchedule);
        pack();
        this.repaint();
    }//GEN-LAST:event_jMenuItemPagamentosAgendasActionPerformed

    private void jMenuItemLancamentosServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLancamentosServicosActionPerformed
        // TODO add your handling code here:
        CreateService createService = new CreateService();
 
        //createService.setVisible(true);
        this.setContentPane(createService);
        pack();
        this.repaint();
    }//GEN-LAST:event_jMenuItemLancamentosServicosActionPerformed

    private void jMenuItemLancamentosPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLancamentosPontoActionPerformed
        // TODO add your handling code here:
        TimeCard timeCard = new TimeCard();
         
        this.setContentPane(timeCard);
        pack();
        this.repaint();
    }//GEN-LAST:event_jMenuItemLancamentosPontoActionPerformed

    private void jMenuItemLancamentosVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLancamentosVendaActionPerformed
        // TODO add your handling code here:
        CreateSold createSold = new CreateSold();
         
        this.setContentPane(createSold);
        pack();
        this.repaint();
    }//GEN-LAST:event_jMenuItemLancamentosVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarAcoes;
    private javax.swing.JMenu jMenuEmpregados;
    private javax.swing.JMenuItem jMenuItemEmpregadoAdicionar;
    private javax.swing.JMenuItem jMenuItemEmpregadoModificar;
    private javax.swing.JMenuItem jMenuItemLancamentosPonto;
    private javax.swing.JMenuItem jMenuItemLancamentosServicos;
    private javax.swing.JMenuItem jMenuItemLancamentosVenda;
    private javax.swing.JMenuItem jMenuItemPagamentosAgendas;
    private javax.swing.JMenuItem jMenuItemPagamentosFolha;
    private javax.swing.JMenu jMenuLancamentos;
    private javax.swing.JMenu jMenuPagamentos;
    // End of variables declaration//GEN-END:variables
}
