package herdaBanks;

//classe não pode ser instanciada
public abstract class Funcionario 
{
    private String nome;
    private String cpf;
    private double salario;

    //métodos especiais
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getCpf()
    { 
        return this.cpf;
    }

    public double getSalario()
    {
        return this.salario;
    }

    //métodos personalizados
    public abstract double getBonificacao();

}