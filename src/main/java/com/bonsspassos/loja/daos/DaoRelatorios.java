/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bonsspassos.loja.daos;

import com.bonsspassos.loja.configDB.Conexao;
import com.bonsspassos.loja.model.RelatorioSintetico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dantas
 */
public class DaoRelatorios {

    private final Conexao conexao = new Conexao();

    public List<RelatorioSintetico> relatorioSinteticoPorPeriodo(Date inicio, Date fim) {
        String sql = "SELECT vendas.id,clientes.nome,vendas.idCliente,vendas.dataVenda, vendas.valorVenda FROM vendas INNER JOIN clientes ON clientes.id=vendas.idCliente WHERE dataVenda BETWEEN ? AND ?";
        ResultSet rs = null;
         
        List<RelatorioSintetico> listaRelatorios = new ArrayList<>();
        try {
            Connection con = conexao.getConexao();
            PreparedStatement preparedStatement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            System.out.println(new java.sql.Date(inicio.getTime()));
            preparedStatement.setDate(1,new java.sql.Date(inicio.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(fim.getTime()));
            rs = preparedStatement.executeQuery();
            if (rs != null) {
                while(rs.next()){
                    System.out.println(rs.getInt("idCliente") + rs.getString("nome"));
              listaRelatorios.add(new RelatorioSintetico(rs.getInt("idCliente"),rs.getString("nome"),rs.getBigDecimal("valorVenda"),rs.getInt("id"),rs.getDate("dataVenda")));
                /*itemRelatorio.setIdCliente(rs.getInt("idCliente"));
                itemRelatorio.setDataVenda(rs.getDate("dataVenda"));
                itemRelatorio.setNomeCliente(rs.getString("nome"));
                itemRelatorio.setValorVenda(rs.getBigDecimal("valorVenda"));
                itemRelatorio.setIdVenda(rs.getInt("idVenda"));*/
                ;
                }
            }
            
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return listaRelatorios;
    }
}
