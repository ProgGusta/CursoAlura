import java.sql.Connection;

import com.br.jdbc.ConnectionFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ConnectionFactory conexao = new ConnectionFactory();
        Connection con = conexao.recuperarConexao();

        System.out.println("Fechando conexao");
    
        con.close();
    }
}
