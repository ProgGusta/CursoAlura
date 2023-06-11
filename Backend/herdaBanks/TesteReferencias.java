package herdaBanks;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.register(g1);
        controle.register(ev);

        System.out.println(controle.getSoma());
    }
}
