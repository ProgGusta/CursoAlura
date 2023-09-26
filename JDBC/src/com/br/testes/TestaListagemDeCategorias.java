package com.br.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.br.jdbc.Categoria;
import com.br.jdbc.CategoriaDAO;
import com.br.jdbc.ConnectionFactory;
import com.br.jdbc.Produto;

public class TestaListagemDeCategorias 
{
    public static void main(String[] args) throws SQLException, Exception 
    {
        try (Connection connection = new ConnectionFactory().recuperarConexao())
        {
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> categorias = categoriaDAO.listarComProdutos();

            categorias.stream().forEach(ct -> 
            {
                System.out.println(ct.getNome());
                for (Produto produto : ct.getProdutos())
                    System.out.println(ct.getNome() + " - " + produto.getNome());
            });
        }
    }    
}
