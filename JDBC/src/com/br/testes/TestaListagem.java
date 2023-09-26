package com.br.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.br.jdbc.ConnectionFactory;

public class TestaListagem 
{
    public static void main(String[] args) throws Exception 
    {
        ConnectionFactory conexao = new ConnectionFactory();
        Connection con = conexao.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("select id, nome, descricao from PRODUTO");
        stm.execute();
        
        ResultSet rst = stm.getResultSet();
        while (rst.next())
        {
            Integer id = rst.getInt("id");
            System.out.println(id);

            String nome = rst.getString("nome");
            System.out.println(nome);

            String descricao = rst.getString("descricao");
            System.out.println(descricao);
        }

        System.out.println("Fechando conexao");
        con.close();
    }
}
