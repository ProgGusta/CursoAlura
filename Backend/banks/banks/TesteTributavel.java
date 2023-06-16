package banks;

public class TesteTributavel {
    public static void main(String[] args) 
    {
        ContaCorrente cc =new ContaCorrente(222, 442);
        cc.deposita(232.53);

        SeguroVida sv = new SeguroVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registro(sv);
        ci.registro(cc);

        System.out.println(ci.getTotalImposto());
    }
}
