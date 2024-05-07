/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bonsspassos.loja.edicao;

import com.bonsspassos.loja.cadastro.CadastroCliente;
import com.bonsspassos.loja.consulta.ConsultaCliente;
import com.bonsspassos.loja.model.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author dantas
 */
public class EditaCliente extends javax.swing.JFrame {

    List<Cliente> clientes = new ArrayList<>();

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public EditaCliente() {

        UIManager.put(
                "OptionPane.yesButtonText", "Sim");
        UIManager.put(
                "OptionPane.noButtonText", "Não");
        UIManager.put(
                "OptionPane.cancelButtonText", "Cancelar");
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

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblNasc = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        selectSexo = new javax.swing.JComboBox<>();
        selectEstadoCivil = new javax.swing.JComboBox<>();
        btnEditaCliente = new javax.swing.JButton();
        lblPainelCadastro = new javax.swing.JLabel();
        fieldNasc = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        fieldEndereco = new javax.swing.JTextField();
        fieldCpf = new javax.swing.JFormattedTextField();
        fieldTelefone = new javax.swing.JFormattedTextField();

        setTitle("BONS PASSOS - EDIÇÃO CLIENTES");
        setResizable(false);

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        lblEmail.setText("Email:");

        lblNasc.setText("Data de nasc:");

        lblTelefone.setText("Telefone:");

        lblSexo.setText("Sexo:");

        lblEstadoCivil.setText("Estado Civil:");

        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        fieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        selectSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Masculino", "Feminino"}));
        selectSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexoActionPerformed(evt);
            }
        });

        selectEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Solteiro", "Casado", "Divorciado"}));
        selectEstadoCivil.setToolTipText("");
        selectEstadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEstadoCivilActionPerformed(evt);
            }
        });

        btnEditaCliente.setText("Salvar");
        btnEditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaClienteActionPerformed(evt);
            }
        });

        lblPainelCadastro.setText("EDITAR CLIENTE");

        try {
            fieldNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setText("Endereço:");

        fieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEnderecoActionPerformed(evt);
            }
        });

        try {
            fieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(156, 156, 156))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(8, 8, 8)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(fieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                                                        .addComponent(fieldCpf)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(lblNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblEndereco)
                                                                                .addGap(70, 70, 70)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(fieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                                                        .addComponent(fieldNasc)
                                                                        .addComponent(fieldTelefone)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnEditaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(42, 42, 42)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(selectSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(selectEstadoCivil, 0, 99, Short.MAX_VALUE))))
                                                                .addGap(102, 102, 102))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblPainelCadastro)
                                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblPainelCadastro)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEndereco)
                                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addComponent(btnEditaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexoActionPerformed

    private void selectEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEstadoCivilActionPerformed

    }//GEN-LAST:event_selectEstadoCivilActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnEditaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaClienteActionPerformed

        Cliente cliente = new Cliente();
        List<String> result = CadastroCliente.validaCamposCadastro(fieldNome, fieldEmail, fieldEndereco, fieldCpf, fieldTelefone, fieldNasc);
        try {
            cliente.setDataNascimento(LocalDate.parse(fieldNasc.getText(), formatter));
        } catch (Exception e) {
            result.add("A data informada não é valida");
        }
        if (result.size() == 0) {
            cliente.setNome(fieldNome.getText());
            cliente.setCpf(fieldCpf.getText());
            cliente.setEmail(fieldEmail.getText());
            cliente.setDataNascimento(LocalDate.parse(fieldNasc.getText(), formatter));
            // cliente.setTelefone(fieldTelefone.getText());
            cliente.setEndereco(fieldEndereco.getText());
            cliente.setSexo(selectSexo.getSelectedItem().toString());
            cliente.setEstadoCivil(selectEstadoCivil.getSelectedItem().toString());
            int op = JOptionPane.showConfirmDialog(rootPane, "Confirmar edição?\n\n" + cliente + "\n\n", "CONFIRME OS DADOS DO CLIENTE", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (op) {
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(rootPane, "Edição Realizada com sucesso!", "Edição concluida", JOptionPane.INFORMATION_MESSAGE);
                    clientes.add(cliente);
                    this.setVisible(false);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;

            }

        } else {
            StringBuilder erros = new StringBuilder();
            for (String erro : result) {
                erros.append(erro).append("\n");
            }
            JOptionPane.showMessageDialog(rootPane, erros.toString(), "Erro ao realizar cadastro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnEditaClienteActionPerformed

    public static void preencheCampos(List<Cliente> clientes, Object valor, String atributo) {

        Map<Object, Cliente> mapCliente = new HashMap<>();
        for (Cliente cliente : clientes) {
            switch (atributo) {
                case "ID":
                    mapCliente.put(valor, cliente);
                    break;
                case "Nome":
                    mapCliente.put(valor, cliente);
                    break;
                case "CPF":
                    mapCliente.put(valor, cliente);
                    break;
                case "Email":
                    mapCliente.put(valor, cliente);
                    break;

            }
            Cliente result = mapCliente.get(valor);
            fieldNome.setText(result.getNome());
            fieldCpf.setText(result.getCpf().toString());
            fieldEmail.setText(result.getEmail());
            fieldNasc.setText(result.getDataNascimento().format(formatter));
            fieldTelefone.setValue(result.getTelefone());
            fieldEndereco.setText(result.getEndereco());
            selectSexo.setSelectedItem(result.getSexo());
            selectEstadoCivil.setSelectedItem(result.getEstadoCivil());
        }

    }

    private void fieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEnderecoActionPerformed

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(EditaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditaCliente;
    private static javax.swing.JFormattedTextField fieldCpf;
    private static javax.swing.JTextField fieldEmail;
    private static javax.swing.JTextField fieldEndereco;
    private static javax.swing.JFormattedTextField fieldNasc;
    private static javax.swing.JTextField fieldNome;
    private static javax.swing.JFormattedTextField fieldTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPainelCadastro;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private static javax.swing.JComboBox<String> selectEstadoCivil;
    private static javax.swing.JComboBox<String> selectSexo;
    // End of variables declaration//GEN-END:variables
}
