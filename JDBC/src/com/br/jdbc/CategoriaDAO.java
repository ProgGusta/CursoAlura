package com.br.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO 
{
    private Connection connection;

    public CategoriaDAO (Connection connection)
    {
        this.connection = connection;
    }    

    public List<Categoria> listar () throws Exception, SQLException
    {
        List<Categoria> categorias = new ArrayList<Categoria>();

        String sql = "select * from CATEGORIA";

        try (PreparedStatement pstm = this.connection.prepareStatement(sql))
        {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet())
            {
                while (rst.next())
                {
                    categorias.add(new Categoria(rst.getInt(1), rst.getString(2)));
                }
            }
        }

        return categorias;
    }

    public List<Categoria> listarComProdutos() throws Exception, SQLException
    {
        Categoria ultima = null;
        List<Categoria> categorias = new ArrayList<Categoria>();

        String sql = "select C.id, C.nome, P.id, P.nome, P.descricao from CATEGORIA C inner join" + 
                    " PRODUTO P on C.id = P.categoria_id";

        try (PreparedStatement pstm = this.connection.prepareStatement(sql))
        {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet())
            {
                while (rst.next())
                {
                    if (ultima == null || ultima.getNome().equals(rst.getString(2)))
                    {
                        Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));
                        ultima = categoria;
                        categorias.add(categoria);
                    }

                    Produto produto = new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
                    ultima.adicionar(produto);
                }
            }
        }

        return categorias;
    }   
}
