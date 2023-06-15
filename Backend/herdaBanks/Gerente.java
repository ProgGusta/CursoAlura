package herdaBanks;

public class Gerente extends Funcionario
{
    @Override
    public double getBonificacao()
    {
        return super.getSalario();
    }

}
