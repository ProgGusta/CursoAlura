package banks;

public class CriaConta {
    public static void main(String[] args)
    {
        Cliente jorel = new Cliente();
        jorel.setNome("jorel do irmao");
        jorel.setCpf("000000000-00");
        jorel.setProfissao("Barmen");

        Conta ex1 = new Conta(151, 242310);
        ex1.setTitular(jorel); 
        ex1.deposita(250.43);

        System.out.println(ex1.getTitular().getNome());

        Conta ex2 = new Conta(432, 865745);
        ex2.deposita(50.64);

        System.out.println("Primeira conta: " + ex1.getSaldo());
        System.out.println("Segunda conta: " + ex2.getSaldo());

        ex1.deposita(55.43);

        boolean transferi = ex1.transferir(100.43, ex2);
        if (transferi)
            System.out.println("Transferencia concluida");
        else
            System.out.println("Não foi possivel transferir");
    }
}
