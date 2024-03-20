/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bonsspassos.loja.model;

import java.time.LocalDate;

/**
 *
 * @author dantas
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String sexo;
    private String estadooCivil;
    
    
    public Cliente(){};

    public Cliente(String nome, String cpf, String email, String telefone, LocalDate dataNascimento, String sexo, String estadooCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadooCivil = estadooCivil;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadooCivil() {
        return estadooCivil;
    }

    public void setEstadooCivil(String estadooCivil) {
        this.estadooCivil = estadooCivil;
    }
    

}
