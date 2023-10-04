package teste;

public class Funcionario {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String cargo;
    private double salario;

    public Funcionario(String cpf) {
        this.cpf = cpf;
    }

    public Funcionario(String cpf, String nome, String endereco, String cargo, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
