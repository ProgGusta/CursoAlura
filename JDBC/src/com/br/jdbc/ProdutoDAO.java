package com.br.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO 
{
    private Connection connection;

    public ProdutoDAO (Connection connection)
    {
        this.connection = connection;
    }

    public void salvarProduto (Produto produto) throws SQLException, Exception
    {
            String sql = "insert into PRODUTO (NOME, DESCRICAO) values (?, ?)";

            //preparando a statement para inserir o produto
            try (PreparedStatement pstm = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {
                pstm.setString(1, produto.getNome());
                pstm.setString(2, produto.getDescricao());
                pstm.execute();

                //salvando o resultado
                try (ResultSet rst = pstm.getGeneratedKeys())
                {
                    while (rst.next())
                        produto.setId(rst.getInt(1));
                }
            }
        
    }

    public List<Produto> listar () throws SQLException
    {
        List<Produto> produtos = new ArrayList<Produto>();
        String sql = "select * from PRODUTO";

        try (PreparedStatement pstm = this.connection.prepareStatement(sql))
        {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet())
            {
                while (rst.next())
                    produtos.add(
                        new Produto(
                            rst.getInt(1), rst.getString(2), rst.getString(3)
                            )
                        );
            }
        }

        return produtos;
    }

    public List<Produto> buscar (Categoria ct) throws SQLException
    {
        List<Produto> produtos = new ArrayList<Produto>();
        String sql = "select * from PRODUTO where categoria_id = ?";

        try (PreparedStatement pstm = this.connection.prepareStatement(sql))
        {
            pstm.setInt(1, ct.getId());
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet())
            {
                while (rst.next())
                    produtos.add(
                        new Produto(
                            rst.getInt(1), rst.getString(2), rst.getString(3)
                            )
                        );
            }
        }

        return produtos;
    }
}
