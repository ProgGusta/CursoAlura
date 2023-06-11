package banks;

public class Conta 
{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //construtor
    public Conta(int agencia, int numero)
    {
        Conta.total++;
        this.setNumero(numero);
        this.setAgencia(agencia);
    }

    //métodos especiais
    public double getSaldo()
    {
        return this.saldo; 
    }

    public static int getTotal()
    {
        return Conta.total;
    }

    public void setAgencia(int agencia)
    {
        if (agencia > 0)
            this.agencia = agencia;
        else 
            this.agencia = 0;
    }

    public int getAgencia()
    {
        return this.agencia;
    }

    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int number)
    {
        if (number > 0)
            this.numero = number;
        else 
            this.numero = 0;
    }

    public void setTitular(Cliente usuario)
    {
        this.titular = usuario;
    }

    public Cliente getTitular()
    {
        return this.titular;
    }

    public void deposita(double value)
    {
        if (value >= 0)
            this.saldo += value;   
    }

    public boolean sacar(double value)
    {
        if (this.saldo >= value)
        {
            this.saldo -= value;
            return true;
        }

        else   
            return false;
    }

    public boolean transferir(double value, Conta destino)
    {
        if (this.sacar(value))
        {  
            destino.deposita(value);
            return true;
        }

        else
            return false;
    }
}
