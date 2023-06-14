package banks;

public class ContaCorrente extends Conta
{
    public ContaCorrente(int agencia, int numero)
    {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double value)
    {
        return super.sacar(value += 0.20);
    }

}