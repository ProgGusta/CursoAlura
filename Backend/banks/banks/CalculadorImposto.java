package banks;

public class CalculadorImposto 
{
    private double totalImposto;

    public void registro(Tributavel t)
    {
        totalImposto += t.getValorImposto();
    }

    public double getTotalImposto()
    {
        return this.totalImposto;
    }
}
