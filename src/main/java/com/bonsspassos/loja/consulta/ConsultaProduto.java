/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bonsspassos.loja.consulta;

import com.bonsspassos.loja.cadastro.CadastroProduto;
import static com.bonsspassos.loja.consulta.ConsultaProduto.addProdutoTable;
import com.bonsspassos.loja.edicao.EditaProduto;
import com.bonsspassos.loja.model.Produto;
import java.util.List;

/**
 *
 * @author RSG
 */
public class ConsultaProduto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaProduto
     */
    public ConsultaProduto() {
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

        selectTipoBusca = new javax.swing.JComboBox<>();
        fieldBuscaPorID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultaProduto = new javax.swing.JTable();
        lblbuscarID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btneditaProduto = new javax.swing.JButton();
        lblConsultaProdutos = new javax.swing.JLabel();
        lblTipoBusca = new javax.swing.JLabel();
        lblbuscaID = new javax.swing.JLabel();

        setTitle("LOJA BONS PASSOS - CONSULTA PRODUTOS");
        setResizable(false);

        selectTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome" }));
        selectTipoBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectTipoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoBuscaActionPerformed(evt);
            }
        });

        fieldBuscaPorID.setDragEnabled(true);

        tableConsultaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produto", "Marca", "Departamento", "Modelo", "Tamanho", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tableConsultaProduto);

        lblbuscarID.setText("Buscar");
        lblbuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbuscarIDActionPerformed(evt);
            }
        });

        jButton1.setText("REMOVER");

        btneditaProduto.setText("EDITAR");
        btneditaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditaProdutoActionPerformed(evt);
            }
        });

        lblConsultaProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultaProdutos.setText("CONSULTA DE PRODUTOS");

        lblTipoBusca.setText("Tipo de busca:");

        lblbuscaID.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(lblConsultaProdutos)
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btneditaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoBusca)
                        .addGap(18, 18, 18)
                        .addComponent(selectTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbuscaID)
                        .addGap(11, 11, 11)
                        .addComponent(fieldBuscaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblbuscarID)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoBusca)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldBuscaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblbuscarID)
                        .addComponent(lblbuscaID)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btneditaProduto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectTipoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoBuscaActionPerformed
        // TODO add your handling code here:
        String[] opcoes = {"ID", "Nome"};
        if (selectTipoBusca.getSelectedItem().toString() == opcoes[0]) {
            lblbuscaID.setText("ID: ");

        } else if (selectTipoBusca.getSelectedItem().toString() == opcoes[1]) {
            lblbuscaID.setText("Nome: ");
        }
    }//GEN-LAST:event_selectTipoBuscaActionPerformed

    private void lblbuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblbuscarIDActionPerformed

    private void btneditaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditaProdutoActionPerformed
        int row = tableConsultaProduto.getSelectedRow();
        int colunm = tableConsultaProduto.getSelectedColumn();
        String nomeColumn = tableConsultaProduto.getColumnName(colunm);
        Object valorBusca = tableConsultaProduto.getValueAt(row, colunm);

        EditaProduto telaEditaProduto = new EditaProduto();
        telaEditaProduto.setVisible(rootPaneCheckingEnabled);
        telaEditaProduto.preencheCampos(CadastroProduto.produtos, valorBusca, nomeColumn);

    }//GEN-LAST:event_btneditaProdutoActionPerformed

    public static void bufferProduto(List<Produto> produtos) {
        if (tableConsultaProduto.isVisible() && produtos.size() > 0) {
            addProdutoTable(produtos);
        }
    }
    
    public static void addProdutoTable(List<Produto> produtos) {
        int pos = 0;
        int id = 1;
        for (Produto produto : produtos) {

            if (tableConsultaProduto.getValueAt(pos, pos) == null) {
                tableConsultaProduto.setValueAt(id, pos, 0);
                tableConsultaProduto.setValueAt(produto.getNomeProduto(), pos, 1);
                tableConsultaProduto.setValueAt(produto.getMarcaProduto(), pos, 2);
                tableConsultaProduto.setValueAt(produto.getDepartamentoProd(), pos, 3);
                tableConsultaProduto.setValueAt(produto.getModeloProduto(), pos, 4);
                tableConsultaProduto.setValueAt(produto.getTamanhoProduto(), pos, 5);
                tableConsultaProduto.setValueAt(produto.getQtdProduto(), pos, 6);
                tableConsultaProduto.setValueAt(produto.getValorProduto(), pos, 7);

            } else {

                for (pos = 1; pos <= tableConsultaProduto.getRowCount(); pos++) {
                    id++;
                    if (tableConsultaProduto.getValueAt(pos, pos) == null) {
                        tableConsultaProduto.setValueAt(id, pos, 0);
                        tableConsultaProduto.setValueAt(produto.getNomeProduto(), pos, 1);
                        tableConsultaProduto.setValueAt(produto.getMarcaProduto(), pos, 2);
                        tableConsultaProduto.setValueAt(produto.getDepartamentoProd(), pos, 3);
                        tableConsultaProduto.setValueAt(produto.getModeloProduto(), pos, 4);
                        tableConsultaProduto.setValueAt(produto.getTamanhoProduto(), pos, 5);
                        tableConsultaProduto.setValueAt(produto.getQtdProduto(), pos, 6);
                        tableConsultaProduto.setValueAt(produto.getValorProduto(), pos, 7);
                    }

                }

            }
        }

    }

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditaProduto;
    private javax.swing.JTextField fieldBuscaPorID;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaProdutos;
    private javax.swing.JLabel lblTipoBusca;
    private javax.swing.JLabel lblbuscaID;
    private javax.swing.JButton lblbuscarID;
    private javax.swing.JComboBox<String> selectTipoBusca;
    private static javax.swing.JTable tableConsultaProduto;
    // End of variables declaration//GEN-END:variables
}
