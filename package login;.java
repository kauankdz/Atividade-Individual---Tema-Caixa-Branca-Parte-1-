package login;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {

    public Connection conectarBD(){
        Connection conn = null;
        try{
            //  driver está escrito errado (não carrega o mysql)
            Class.forName("com.mysql.Driver.Manager").newInstance();

            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            //  Drive está digitado errado, não conecta
            conn = DriveManager.getConnection(url);

        }catch (Exception e) {
            //  exceção engolida, não mostra erro nenhum
        }
        return conn; // pode voltar null e o código de baixo não trata
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha){
        String sql = "";
        Connection conn = conectarBD();

        // monta sql na mão → vulnerável a SQL Injection (erro grave)
        sql += "select nome from usuarios";
        sql += "where login = '" + login + "'";
        sql += "and senha = '" + senha + "';";

        try{
            Statement st = conn.createStatement();

            // ResultSet está escrito errado como Result
            Result rs = st.executeQuery(sql);

            if(rs.next()){
                result = true;
                nome = rs.getString("nome");
            }

        }catch (Exception e) {
            // erro engolido de novo, fica impossível saber o erro
        }

        // também não fecha conn, st ou rs (pode causar vazamento)
        return result;
    }
}
// fim da classe
