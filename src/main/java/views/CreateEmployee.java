/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import entities.AddressEntity;
import entities.CommissionedEntity;
import entities.EmployeeEntity;
import entities.HourlyEntity;
import entities.SalariedEntity;
import javax.swing.JOptionPane;
import utils.TypeEmployEnum;

/**
 *
 * @author Vinicius
 */
public class CreateEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AdicionarEmpregado
     */
    public CreateEmployee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelHoraTrabalho = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelComissao = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jFormattedTextFieldHoraTrabalho = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSalario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldComissao = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(958, 589));

        jLabelNome.setText("Nome:");

        jLabelCEP.setText("CEP:");

        jLabelTipo.setText("Tipo:");

        jLabelLogradouro.setText("Rua/Avenida:");

        jLabelNumero.setText("N°");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade/UF:");

        jLabelHoraTrabalho.setVisible(false);
        jLabelHoraTrabalho.setText("Valor Hora");

        jLabelSalario.setVisible(false);
        jLabelSalario.setText("Salário:");

        jLabelComissao.setVisible(false);
        jLabelComissao.setText("Comissão:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { TypeEmployEnum.Commissionaed.getType(), TypeEmployEnum.Salaried.getType(), TypeEmployEnum.Hourly.getType() }));
        jComboBoxTipo.setSelectedIndex(-1);
        jComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoItemStateChanged(evt);
            }
        });
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Limpar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jFormattedTextFieldHoraTrabalho.setVisible(false);
        jFormattedTextFieldHoraTrabalho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("R$ #,##0.00"))));
        jFormattedTextFieldHoraTrabalho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldHoraTrabalhoFocusLost(evt);
            }
        });

        jFormattedTextFieldSalario.setVisible(false);
        jFormattedTextFieldSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("R$ #,##0.00"))));
        jFormattedTextFieldSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldSalarioFocusLost(evt);
            }
        });

        jFormattedTextFieldComissao.setVisible(false);
        jFormattedTextFieldComissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));
        jFormattedTextFieldComissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldComissaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogradouro)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTipo)
                                        .addGap(41, 41, 41)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelSalario)
                                            .addComponent(jLabelHoraTrabalho)
                                            .addComponent(jLabelComissao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextFieldComissao)
                                            .addComponent(jFormattedTextFieldSalario)
                                            .addComponent(jFormattedTextFieldHoraTrabalho))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraTrabalho)
                    .addComponent(jFormattedTextFieldHoraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalario)
                    .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComissao)
                    .addComponent(jFormattedTextFieldComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonDelete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jFormattedTextFieldHoraTrabalhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraTrabalhoFocusLost
        // TODO add your handling code here:
        String value = this.jFormattedTextFieldHoraTrabalho.getText();
        this.jFormattedTextFieldHoraTrabalho.setText("R$ " + value);
    }//GEN-LAST:event_jFormattedTextFieldHoraTrabalhoFocusLost

    private void jFormattedTextFieldSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSalarioFocusLost
        // TODO add your handling code here:
        String value = this.jFormattedTextFieldSalario.getText();
        this.jFormattedTextFieldSalario.setText("R$ " + value);
    }//GEN-LAST:event_jFormattedTextFieldSalarioFocusLost

    private void jFormattedTextFieldComissaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldComissaoFocusLost
        // TODO add your handling code here:
        String value = this.jFormattedTextFieldComissao.getText();
        this.jFormattedTextFieldComissao.setText(value+"%");
    }//GEN-LAST:event_jFormattedTextFieldComissaoFocusLost

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        int barCity = this.jTextFieldCidade.getText().indexOf("/");
        AddressEntity addressEmployee = new AddressEntity(this.jTextFieldLogradouro.getText(),
                this.jTextFieldNumero.getText(),
                this.jTextFieldBairro.getText(),
                this.jTextFieldCidade.getText().substring(0, barCity - 1),
                this.jTextFieldCidade.getText().substring(barCity,
                        this.jTextFieldCidade.getText().length()),
                this.jFormattedTextFieldCEP.getText());
        String typeEmployee = (String) this.jComboBoxTipo.getSelectedItem();

        EmployeeEntity newEmployee = null;
        if (TypeEmployEnum.Commissionaed.getType().equals(typeEmployee)) {

            newEmployee = new CommissionedEntity(
                    this.jFormattedTextFieldComissao.getText(),
                    this.jFormattedTextFieldSalario.getText(),
                    this.jTextFieldName.getText(),                    
                    addressEmployee);
        } else if (TypeEmployEnum.Hourly.getType().equals(typeEmployee)) {
            newEmployee = new HourlyEntity(
                    this.jFormattedTextFieldHoraTrabalho.getText(),
                    this.jTextFieldName.getText(),
                    addressEmployee);
        } else if (TypeEmployEnum.Salaried.getType().equals(typeEmployee)) {
            newEmployee = new SalariedEntity(
                    this.jFormattedTextFieldSalario.getText(),
                    this.jTextFieldName.getText(),
                    addressEmployee);
        }
        EmployeeController controller = new EmployeeController();
        if (!controller.createEmployee(newEmployee)) {
            JOptionPane.showMessageDialog(null, "Por Favor, preencha todos os campos", "Vazio!", JOptionPane.ERROR);
        } else {
            clear();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemStateChanged
        // TODO add your handling code here:

        this.jLabelHoraTrabalho.setVisible(false);
        this.jLabelSalario.setVisible(false);
        this.jLabelComissao.setVisible(false);
        this.jFormattedTextFieldHoraTrabalho.setVisible(false);
        this.jFormattedTextFieldSalario.setVisible(false);
        this.jFormattedTextFieldComissao.setVisible(false);

        String typeEmployee = (String) this.jComboBoxTipo.getSelectedItem();
        if (TypeEmployEnum.Commissionaed.getType().equals(typeEmployee)) {

            this.jFormattedTextFieldComissao.setVisible(true);
            this.jFormattedTextFieldSalario.setVisible(true);
            this.jLabelComissao.setVisible(true);
            this.jLabelSalario.setVisible(true);
        } else if (TypeEmployEnum.Hourly.getType().equals(typeEmployee)) {
            this.jFormattedTextFieldHoraTrabalho.setVisible(true);
            this.jLabelHoraTrabalho.setVisible(true);
        } else if (TypeEmployEnum.Salaried.getType().equals(typeEmployee)) {
            this.jFormattedTextFieldSalario.setVisible(true);
            this.jLabelSalario.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxTipoItemStateChanged

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void clear() {
        this.jLabelHoraTrabalho.setVisible(false);
        this.jLabelSalario.setVisible(false);
        this.jLabelComissao.setVisible(false);
        this.jFormattedTextFieldHoraTrabalho.setVisible(false);
        this.jFormattedTextFieldSalario.setVisible(false);
        this.jFormattedTextFieldComissao.setVisible(false);
        this.jComboBoxTipo.setSelectedIndex(-1);
        this.jTextFieldName.setText("");
        this.jFormattedTextFieldCEP.setText("");
        this.jTextFieldBairro.setText("");
        this.jTextFieldCidade.setText("");
        this.jTextFieldLogradouro.setText("");
        this.jTextFieldNumero.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldComissao;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraTrabalho;
    private javax.swing.JFormattedTextField jFormattedTextFieldSalario;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComissao;
    private javax.swing.JLabel jLabelHoraTrabalho;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
