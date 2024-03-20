/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bonsspassos.loja.model;

/**
 *
 * @author RSG
 */
public class Produto {

    private String nomeProduto;
    private String departamentoProd;
    private String marcaProduto;
    private String modeloProduto;
    private int tamanhoProduto;
    private int qtdProduto;

    public Produto() {
        
    };
    
    public Produto(String nomeProduto, String departamentoProd, int qtdProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.departamentoProd = departamentoProd;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public String getDepartamento() {
        return departamentoProd;
    }
    
    public void setDepartamento(String departamentoProd) {
        this.departamentoProd = departamentoProd;
    }
    
    public int getQtdProduto() {
        return qtdProduto;
    }
    
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    /**
     * @return the marcaProduto
     */
    public String getMarcaProduto() {
        return marcaProduto;
    }

    /**
     * @param marcaProduto the marcaProduto to set
     */
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    /**
     * @return the modeloProduto
     */
    public String getModeloProduto() {
        return modeloProduto;
    }

    /**
     * @param modeloProduto the modeloProduto to set
     */
    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }

    /**
     * @return the tamanhoProduto
     */
    public int getTamanhoProduto() {
        return tamanhoProduto;
    }

    /**
     * @param tamanhoProduto the tamanhoProduto to set
     */
    public void setTamanhoProduto(int tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }
    
    
}
