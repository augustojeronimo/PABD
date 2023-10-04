package teste;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoProduto extends ConexaoBD {
    
    public void inserirProduto(Produto p){
        String sql = "insert into produto values (?,?,?,?);";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            
            estado.setInt(1, p.getCodigo());
            estado.setString(2, p.getNome());
            estado.setString(3, p.getDescricao());
            estado.setDouble(4, p.getValor());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto...");
        }
    }
    
    public void atualizarProduto(Produto p){
        String sql = "update produto set nome = ?, descricao = ?, valor = ? where codigo = ?;";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            
            estado.setString(1, p.getNome());
            estado.setString(2, p.getDescricao());
            estado.setDouble(3, p.getValor());
            estado.setInt(4, p.getCodigo());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto");
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void removerProduto(Produto p){
        String sql = "delete from produto where codigo = ?;";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            
            estado.setInt(1, p.getCodigo());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover produto...");
        }
    }
    
}
