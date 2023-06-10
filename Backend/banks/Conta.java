package banks;

public class Conta 
{
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    //métodos especiais
    public double getSaldo()
    {
        return this.saldo; 
    }

    public void deposita(double value)
    {
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
