package banks;

public class ContaCorrente extends Conta implements Tributavel
{
    public ContaCorrente(int agencia, int numero)
    {
        super(agencia, numero);
    }

    @Override
    public void sacar(double value)
    {
        super.sacar(value += 0.20);
    }

    @Override
    public void deposita(double value)
    {
        if (value >= 0)
            super.saldo += value;   
    }

    @Override
    public double getValorImposto()
    {
        return super.saldo * 0.01;
    }
}