package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoBD {
    
    /* - - - - - - - - - - IMPORTANTE - - - - - - - - - - */
    String driver   = "com.mysql.jdbc.Driver";    
    String banco    = "teste";
    String host     = "localhost";
    String str_con  = "jdbc:mysql://"+host+":3306/"+banco;
    String usuario  = "root";
    String senha    = "";
    /* - - - - - - - - - - IMPORTANTE - - - - - - - - - - */
    
    
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
            
        }
        
        
        
    }
    
    public void fecharConexao(){
        
        try {
            estado.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão...");
        }
        
        
    }
}
