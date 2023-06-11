package herdaBanks;

public class Gerente extends Funcionario
{
    private int senha;

    @Override
    public double getBonificacao()
    {
        return super.getSalario() + super.getBonificacao();
    }

    public boolean autentica(int senha)
    {
        if (this.senha == senha)
            return true;
        else
            return false;
    }
}
