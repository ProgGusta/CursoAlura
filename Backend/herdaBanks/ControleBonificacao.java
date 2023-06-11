package herdaBanks;

public class ControleBonificacao {
    private double soma;

    public void register (Funcionario funcionario)
    {
        this.soma += funcionario.getBonificacao();
    }

    public double getSoma()
    {
        return this.soma;
    }
}
