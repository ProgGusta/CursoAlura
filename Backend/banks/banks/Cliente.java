package banks;

public class Cliente 
{
    private String nome;
    private String cpf;
    private String profissao;

    //métodos especiais
    public String getNome()
    {
        return this.nome;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public String getProfissao()
    {
        return this.profissao;
    }

    public void setNome(String name)
    {
        this.nome = name;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao)
    {
        this.profissao = profissao;
    }
}
