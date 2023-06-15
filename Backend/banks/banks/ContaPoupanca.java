package banks;

public class ContaPoupanca extends Conta
{
    public ContaPoupanca(int agencia, int numero)
    {
        super(agencia, numero);
    }

    @Override
    public void deposita(double value)
    {
        if (value >= 0)
            super.saldo += value;   
    }
}
