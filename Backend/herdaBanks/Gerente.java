package herdaBanks;

public class Gerente extends Funcionario implements Autenticavel
{
    private Autenticador autentication;

    public Gerente()
    {
        this.autentication = new Autenticador();
    }

    @Override
    public double getBonificacao()
    {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha)
    {
        this.autentication.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha)
    {
        return this.autentication.autentica(senha);
    }
}
