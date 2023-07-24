package banks;

public abstract class Conta 
{
    protected double saldo;
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

    public abstract void deposita(double value);

    public void sacar(double value)
    {
        if (this.saldo < value)
        {
            throw new SaldoInsuficienteException("Saldo: " + this.getSaldo() + ", Valor: " + value);
        }

        this.saldo -= value;
    }

    public void transferir(double value, Conta destino)
    {
        this.sacar(value);
        destino.deposita(value); 
    }
}
