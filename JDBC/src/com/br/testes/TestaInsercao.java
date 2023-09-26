package com.br.testes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.br.jdbc.ConnectionFactory;

public class TestaInsercao 
{
    public static void main(String[] args) throws Exception
    {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.recuperarConexao();

        Statement stm = con.createStatement();
        //boolean result = 
            stm.execute("insert into PRODUTO (nome, descricao) values ('MOUSE', 'MOUSE SEM FIO')", Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next())
        {
            Integer id = rst.getInt(1);
            System.out.println("O id criado foi: " + id);
        }
    }
}
