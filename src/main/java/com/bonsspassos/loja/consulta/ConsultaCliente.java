/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bonsspassos.loja.consulta;

import com.bonsspassos.loja.cadastro.CadastroCliente;
import com.bonsspassos.loja.edicao.EditaCliente;
import com.bonsspassos.loja.model.Cliente;
import java.util.List;

/**
 *
 * @author danta
 */
public class ConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCliente
     */
    public ConsultaCliente() {
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

        telaConsultaClientes = new javax.swing.JPanel();
        lblConsultaClientes = new javax.swing.JLabel();
        lblTipoBusca = new javax.swing.JLabel();
        selectTipoBusca = new javax.swing.JComboBox<>();
        lblBusca = new javax.swing.JLabel();
        fieldBuscaPorNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultaCliente = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btneditaCliente = new javax.swing.JButton();

        setTitle("LOJA BONS PASSOS - CONSULTA CLIENTES");

        lblConsultaClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultaClientes.setText("CONSULTA DE CLIENTES");

        lblTipoBusca.setText("Tipo de busca:");

        selectTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        selectTipoBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectTipoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoBuscaActionPerformed(evt);
            }
        });

        lblBusca.setLabelFor(fieldBuscaPorNome);
        lblBusca.setText("Digite o nome do cliente:");

        fieldBuscaPorNome.setDragEnabled(true);
        fieldBuscaPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaPorNomeActionPerformed(evt);
            }
        });

        tableConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Email"
            }
        ));
        jScrollPane1.setViewportView(tableConsultaCliente);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("REMOVER");

        btneditaCliente.setText("EDITAR");
        btneditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaConsultaClientesLayout = new javax.swing.GroupLayout(telaConsultaClientes);
        telaConsultaClientes.setLayout(telaConsultaClientesLayout);
        telaConsultaClientesLayout.setHorizontalGroup(
            telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                .addGroup(telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                        .addGroup(telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTipoBusca)
                                .addGap(18, 18, 18)
                                .addComponent(selectTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBusca)
                                .addGap(18, 18, 18)
                                .addComponent(fieldBuscaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lblConsultaClientes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaConsultaClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btneditaCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        telaConsultaClientesLayout.setVerticalGroup(
            telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaConsultaClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoBusca)
                    .addComponent(selectTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca)
                    .addComponent(fieldBuscaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btneditaCliente))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void selectTipoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoBuscaActionPerformed
        // TODO add your handling code here:
        String[] opcoes = {"Nome", "CPF"};
        if (selectTipoBusca.getSelectedItem().toString() == opcoes[0]) {
            lblBusca.setText("Digite o nome do cliente");

        } else if (selectTipoBusca.getSelectedItem().toString() == opcoes[1]) {
            lblBusca.setText("Digite o CPF do cliente");
        }
    }//GEN-LAST:event_selectTipoBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btneditaCliente;
    private javax.swing.JTextField fieldBuscaPorNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblConsultaClientes;
    private javax.swing.JLabel lblTipoBusca;
    private javax.swing.JComboBox<String> selectTipoBusca;
    private static javax.swing.JTable tableConsultaCliente;
    private javax.swing.JPanel telaConsultaClientes;
    // End of variables declaration//GEN-END:variables
}
