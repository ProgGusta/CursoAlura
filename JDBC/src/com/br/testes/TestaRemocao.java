package com.br.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.br.jdbc.ConnectionFactory;

public class TestaRemocao 
{
    public static void main(String[] args) throws Exception
    {
        ConnectionFactory conexao = new ConnectionFactory();
        Connection con = conexao.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("delete from PRODUTO where id > ?");
        stm.setInt(1, 6);
        stm.execute();

        // retorna a quantidade de linhas modificadas
        Integer linhas = stm.getUpdateCount();
        System.out.println("Linhas modificadas: " + linhas);
    }
}
