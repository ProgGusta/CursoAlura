package com.br.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.br.jdbc.ConnectionFactory;
import com.br.jdbc.ProdutoDAO;
import com.br.jdbc.Produto;

public class TestaInsercaoEListagemComProduto 
{
    public static void main(String[] args) throws SQLException, Exception 
    {
        Produto comoda = new Produto("Cômoda", "Cômoda vertical");    

        // tentando a conexao
        try (Connection connection = new ConnectionFactory().recuperarConexao())
        {
            ProdutoDAO produtoDAO = new ProdutoDAO(connection); 
            produtoDAO.salvarProduto(comoda);
            List<Produto> produtos = produtoDAO.listar();

            produtos.stream().forEach(lp -> System.out.println(lp));
        }

        System.out.println(comoda);
    }    
}
