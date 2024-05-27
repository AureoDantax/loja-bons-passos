package com.bonsspassos.loja.edicao;

import com.bonsspassos.loja.cadastro.CadastroProduto;
import com.bonsspassos.loja.consulta.ConsultaProduto;
import com.bonsspassos.loja.daos.DaoProduto;
import com.bonsspassos.loja.model.Produto;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author RSG
 */
public class EditaProduto extends javax.swing.JFrame {

    static DaoProduto dao = new DaoProduto();

    public EditaProduto() {
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
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
        jLabel1 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        departamentoProd = new javax.swing.JComboBox<>();
        qtdProduto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        tamanhoProduto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        modeloProduto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        marcaProduto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorProduto = new javax.swing.JTextField();
        btnEditaProduto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fieldId = new javax.swing.JTextField();

        setTitle(" EDIÇÃO PRODUTOS");
        setResizable(false);

        jLabel1.setText("Produto:");

        nomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Departamento:");

        departamentoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Streetwear", "Corrida", "Academia e Treino", "Chuteiras", "Basquete", "Sandalias e Chinelos" }));
        departamentoProd.setToolTipText("");
        departamentoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoProdActionPerformed(evt);
            }
        });

        qtdProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel4.setText("Tamanho:");

        tamanhoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "34", "36", "38", "40", "41", "42", "43", "44", "45", "46", "47", "48" }));
        tamanhoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Modelo:");

        modeloProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Unissex" }));
        modeloProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloProdutoActionPerformed(evt);
            }
        });

        jLabel6.setText("Marca:");

        marcaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike", "Tesla", "Adidas", "Mizuno", "DC Shoes", "QIX", "Puma", "Vans", "New Balance", "Hocks" }));
        marcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaProdutoActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor:");

        jLabel8.setText("EDITAR  PRODUTO");

        btnEditaProduto.setText("Salvar");
        btnEditaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaProdutoActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        fieldId.setEditable(false);
        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departamentoProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modeloProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamanhoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(valorProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(qtdProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(48, 48, 48))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeProduto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(departamentoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(modeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tamanhoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnEditaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed

    }//GEN-LAST:event_nomeProdutoActionPerformed

    private void departamentoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoProdActionPerformed

    }//GEN-LAST:event_departamentoProdActionPerformed

    private void btnEditaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaProdutoActionPerformed
        Produto produto = new Produto();
        List<String> result = CadastroProduto.validaCamposProduto(nomeProduto, valorProduto);

        if (result.size() == 0) {
            produto.setId(Integer.parseInt(fieldId.getText()));
            produto.setNomeProduto(nomeProduto.getText());
            produto.setMarcaProduto(marcaProduto.getSelectedItem().toString());
            produto.setDepartamentoProd(departamentoProd.getSelectedItem().toString());
            produto.setModeloProduto(modeloProduto.getSelectedItem().toString());
            produto.setTamanhoProduto(Integer.parseInt(tamanhoProduto.getSelectedItem().toString()));
            produto.setQtdProduto(Integer.parseInt(qtdProduto.getValue().toString()));
            produto.setValorProduto(new BigDecimal(valorProduto.getText().replace(",", ".")));
            int op = JOptionPane.showConfirmDialog(rootPane, "Confirmar edição?\n\n" + produto + "\n\n", "CONFIRME OS DADOS DO PRODUTO", JOptionPane.YES_NO_OPTION);
            switch (op) {
                case JOptionPane.YES_OPTION:
                    if (dao.updateProduto(produto, produto.getId())) {
                        ConsultaProduto.addProdutoTable();
                        JOptionPane.showMessageDialog(rootPane, "Edição Realizada com sucesso!", "Edição Concluida", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Falha na edição!", "Edição não executada", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                case JOptionPane.NO_OPTION:
                    break;

            }
        } else {
            StringBuilder erros = new StringBuilder();
            for (String erro : result) {
                erros.append(erro).append("\n");
            }
            JOptionPane.showMessageDialog(rootPane, erros.toString(), "Erro ao realizar cadastro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnEditaProdutoActionPerformed

    public void preencheCampos(int id) {

        Produto result = dao.buscaProdutoPorId(id);
        fieldId.setText(String.valueOf(result.getId()));
        nomeProduto.setText(result.getNomeProduto());
        marcaProduto.setSelectedItem(result.getMarcaProduto());
        departamentoProd.setSelectedItem(result.getDepartamentoProd());
        modeloProduto.setSelectedItem(result.getModeloProduto());
        tamanhoProduto.setSelectedItem(result.getTamanhoProduto());
        qtdProduto.setValue(result.getQtdProduto());
        valorProduto.setText(result.getValorProduto().toString().replace(".", ","));
    }


    private void tamanhoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoProdutoActionPerformed

    }//GEN-LAST:event_tamanhoProdutoActionPerformed

    private void modeloProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloProdutoActionPerformed

    }//GEN-LAST:event_modeloProdutoActionPerformed

    private void marcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaProdutoActionPerformed

    }//GEN-LAST:event_marcaProdutoActionPerformed

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdActionPerformed

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
            java.util.logging.Logger.getLogger(EditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditaProduto;
    private javax.swing.JComboBox<String> departamentoProd;
    private javax.swing.JTextField fieldId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> marcaProduto;
    private javax.swing.JComboBox<String> modeloProduto;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JSpinner qtdProduto;
    private javax.swing.JComboBox<String> tamanhoProduto;
    private javax.swing.JTextField valorProduto;
    // End of variables declaration//GEN-END:variables
}
