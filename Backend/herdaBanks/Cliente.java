package herdaBanks;

public class Cliente implements Autenticavel
{
    private Autenticador autentication;

    public Cliente()
    {
        this.autentication = new Autenticador();
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
