package com.bonsspassos.loja.home.cadastro;

import com.bonsspassos.loja.model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author RSG
 */
public class CadastroProduto extends javax.swing.JFrame {

    public CadastroProduto() {
        initComponents();
    }


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
        btnCadastroProduto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tamanhoProduto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        modeloProduto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        marcaProduto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        btnCadastroProduto.setText("Cadastrar");
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

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

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextField1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tamanhoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departamentoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed

    }//GEN-LAST:event_nomeProdutoActionPerformed

    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed
        
        Produto produto = new Produto();
        
        String nome = nomeProduto.getText();
        String marca = (String) marcaProduto.getSelectedItem();
        String departamento = (String) departamentoProd.getSelectedItem();
        String modelo = (String) modeloProduto.getSelectedItem();
        int tamanho = Integer.parseInt((String) tamanhoProduto.getSelectedItem());
        int quantidade = (Integer) qtdProduto.getValue();

        int op = JOptionPane.showConfirmDialog(rootPane,
                "Produto: " + nome
                + "\nDepartamento: " + departamento
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nTamanho: " + tamanho
                + "\nQuantidade: " + quantidade
                + "\nConfirmar cadastro deste produto?");
        
        if (op == 0) {
            produto.setNomeProduto(nomeProduto.getText());
            produto.setMarcaProduto((String) marcaProduto.getSelectedItem());
            produto.setDepartamento((String) departamentoProd.getSelectedItem());
            produto.setModeloProduto((String) modeloProduto.getSelectedItem());
            produto.setTamanhoProduto(Integer.parseInt((String) tamanhoProduto.getSelectedItem()));
            produto.setQtdProduto((Integer) qtdProduto.getValue());

            JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado!");
            this.setVisible(false);
        }
            
    }//GEN-LAST:event_btnCadastroProdutoActionPerformed

    private void marcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaProdutoActionPerformed

    }//GEN-LAST:event_marcaProdutoActionPerformed

    private void departamentoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoProdActionPerformed

    }//GEN-LAST:event_departamentoProdActionPerformed

    private void modeloProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloProdutoActionPerformed

    }//GEN-LAST:event_modeloProdutoActionPerformed

    private void tamanhoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoProdutoActionPerformed

    }//GEN-LAST:event_tamanhoProdutoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JComboBox<String> departamentoProd;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> marcaProduto;
    private javax.swing.JComboBox<String> modeloProduto;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JSpinner qtdProduto;
    private javax.swing.JComboBox<String> tamanhoProduto;
    // End of variables declaration//GEN-END:variables
}
