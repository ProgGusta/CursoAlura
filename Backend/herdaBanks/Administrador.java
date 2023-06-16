package herdaBanks;

public class Administrador extends Funcionario implements Autenticavel
{
    private Autenticador autentication;

    public Administrador()
    {
        this.autentication = new Autenticador();
    }

    @Override
    public double getBonificacao()
    {
        return 50.32;
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
