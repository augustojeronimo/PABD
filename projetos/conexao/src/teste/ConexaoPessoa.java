package teste;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoPessoa extends ConexaoBD {
    
    public void inserir(Pessoa p) {
        /* Montagem da String sql */
        String sql = "INSERT INTO pessoa VALUES (?, ?, ?);";
        conectar();
        
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, p.getCpf());
            estado.setString(2, p.getNome());
            estado.setInt(3, p.getIdade());

            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! (" + p.getNome() + ")" );
            
        } catch (SQLException ex) {
            if (ex.getMessage().startsWith("Duplicate")) {
                JOptionPane.showMessageDialog(null, "Erro, chave primária repetida...");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir dados...");
            }
        } finally {
            fecharConexao();
        }
        
    }
    
    
    public void atualizar(Pessoa p) {
        /* Montagem da String sql */
        String sql = "UPDATE pessoa SET cpf = ?, nome = ?, idade = ? WHERE CPF = ?;";
        conectar();
        
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, p.getCpf());
            estado.setString(2, p.getNome());
            estado.setInt(3, p.getIdade());
            estado.setString(4, p.getCpf());

            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso! (" + p.getNome() + ")" );
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados...");
        } finally {
            fecharConexao();
        }
        
    }
    
    
    public void remover(Pessoa p) {
        /* Montagem da String sql */
        String sql = "DELETE FROM pessoa WHERE cpf = ?;";
        conectar();
        
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, p.getCpf());

            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Removido com sucesso! (" + p.getNome() + ")" );
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados...");
        } finally {
            fecharConexao();
        }
        
    }
    
}
