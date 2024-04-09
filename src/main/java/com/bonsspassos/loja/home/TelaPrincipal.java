/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bonsspassos.loja.home;

import com.bonsspassos.loja.cadastro.CadastroCliente;
import com.bonsspassos.loja.cadastro.CadastroProduto;
import com.bonsspassos.loja.vendas.TelaVenda;

/**
 *
 * @author danta
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        setExtendedState(MAXIMIZED_BOTH);
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

        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroCalcados = new javax.swing.JMenuItem();
        cadastroClientes = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuItemVendas = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bons Passos Calçados");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 204, 255));
        setLocationByPlatform(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        jMenuBar1.setToolTipText("");

        menuCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        menuCadastro.setText("Cadastro");

        cadastroCalcados.setText("Calçados");
        cadastroCalcados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroCalcados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCalcadosActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroCalcados);

        cadastroClientes.setBackground(new java.awt.Color(51, 153, 255));
        cadastroClientes.setText("Clientes");
        cadastroClientes.setToolTipText("Cadastro de clientes");
        cadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroClientes);

        jMenuBar1.add(menuCadastro);

        menuVendas.setText("Vendas");
        menuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasActionPerformed(evt);
            }
        });

        menuItemVendas.setText("Realizar vendas");
        menuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendasActionPerformed(evt);
            }
        });
        menuVendas.add(menuItemVendas);

        jMenuBar1.add(menuVendas);

        menuRelatorios.setText("Relatorios");
        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroCalcadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCalcadosActionPerformed
        // TODO add your handling code here:
        CadastroProduto telaCadastroProduto = new CadastroProduto();
        telaCadastroProduto.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_cadastroCalcadosActionPerformed

    private void cadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClientesActionPerformed
      CadastroCliente telaCadastro = new CadastroCliente();
      telaCadastro.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_cadastroClientesActionPerformed

    private void menuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menuVendasActionPerformed

    private void menuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendasActionPerformed
        // TODO add your handling code here:
         TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
    }//GEN-LAST:event_menuItemVendasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCalcados;
    private javax.swing.JMenuItem cadastroClientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemVendas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables
}
