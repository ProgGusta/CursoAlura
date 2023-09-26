package com.br.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.br.jdbc.ConnectionFactory;

public class InsercaoComParametro 
{
    public static void main(String[] args) throws Exception
    {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection con = factory.recuperarConexao())
        {
            con.setAutoCommit(false);

            try 
            (
                //verifica se os parametros são corretos
                //prepara a statement
                PreparedStatement stm = con.prepareStatement("insert into PRODUTO (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            ){    
                adicionar("SmartTV", "45 polegadas", stm);
                adicionar("Radio", "Radio de bateria", stm);

                con.commit();

                stm.close();
            } catch (Exception e) 
            {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                con.rollback();
            }
        }
    }

    public static void adicionar (String nome, String descricao, PreparedStatement stm) throws Exception
    {
        stm.setString(1, nome);
        stm.setString(2, descricao);
        
        //boolean result = 
            stm.execute();

        try (ResultSet rst = stm.getGeneratedKeys())
        {
            while(rst.next())
            {
                Integer id = rst.getInt(1);
                System.out.println("O id criado foi: " + id);
            }
        }
    }
}
