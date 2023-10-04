package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    private String host = "localhost";
    private String banco = "mercado";
    private String str_con = "jdbc:mysql://"+host+":3306/"+banco;
    private String driver = "com.mysql.jdbc.Driver";
    private String usuario = "root";
    private String senha = "";
    
    Connection con;
    PreparedStatement estado;
    
    public void conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(str_con, usuario, senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o driver...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar...");
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void fecharConexao(){
        try {
            estado.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão...");
        }
    }
    
}
