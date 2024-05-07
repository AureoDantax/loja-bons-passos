/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bonsspassos.loja.daos;

import com.bonsspassos.loja.configDB.Conexao;
import com.bonsspassos.loja.model.Cliente;
import java.sql.*;

/**
 * @author dantas
 */
public class DaoCliente {
    private final Conexao conexao = new Conexao();

    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes(nome,cpf, email, telefone,estadoCivil,sexo,endereco,dataNasc,removido) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            Connection con = conexao.getConexao();
            PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getTelefone());
            preparedStatement.setString(5, cliente.getEstadoCivil());
            preparedStatement.setString(6, cliente.getSexo());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setDate(8, Date.valueOf(cliente.getDataNascimento()));
            preparedStatement.setBoolean(9, false);
            preparedStatement.execute();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
