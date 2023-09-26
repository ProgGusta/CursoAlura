package com.br.testes;

import com.br.jdbc.ConnectionFactory;

public class TestaPoolConexoes 
{
    public static void main(String[] args) throws Exception 
    {
        ConnectionFactory connection = new ConnectionFactory();
        
        for (int i = 0; i < 20; i++)
        {
            connection.recuperarConexao();
            System.out.println("Conexao de numero: " + i);
        }
    }    
}
