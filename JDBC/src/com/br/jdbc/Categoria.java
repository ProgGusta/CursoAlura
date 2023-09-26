package com.br.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Categoria 
{
    private Integer id;
    private String nome;
    private List<Produto> produtos;

    public Categoria (Integer id, String nome)
    {
        this.id = id;
        this.nome = nome;
        this.produtos = new ArrayList<Produto>();
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getId()
    {
        return this.id;
    }

    public void adicionar(Produto produto) 
    {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() 
    {
        return this.produtos;
    }
}
