package teste;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoFuncionario extends ConexaoBD{
    
    public void inserirFuncionario(Funcionario f) {
        String sql = "insert into funcionario values (?,?,?,?,?);";
        conectar();
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, f.getCpf());
            estado.setString(2, f.getNome());
            estado.setString(3, f.getEndereco());
            estado.setString(4, f.getCargo());
            estado.setDouble(5, f.getSalario());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario...");
        }
        
    }
    
    public void atualizarFuncionario(Funcionario f) {
        String sql = "update funcionario set nome = ?, endereco = ?, cargo = ?, salario = ? where cpf = ?";
        conectar();
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, f.getNome());
            estado.setString(2, f.getEndereco());
            estado.setString(3, f.getCargo());
            estado.setDouble(4, f.getSalario());
            estado.setString(5, f.getCpf());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionario...");
        }
        
    }
    
    public void removerFuncionario(Funcionario f) {
        String sql = "delete from funcionario where cpf = ?";
        conectar();
        
        try {
            
            estado = con.prepareStatement(sql);
            
            estado.setString(1, f.getCpf());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover funcionario...");
        }
        
    }
    
}
