package trabalhop2.SistemaDeJogos;

public class Funcionario extends Usuario{
    private double salario;
    private String idFuncionario;

    public Funcionario(String nome, String cpf, String email, String senha, String endereco, double Salario, String idFuncionario) {
        super(nome, cpf, email, senha, endereco);

        setSalario(Salario);
        setIdFuncionario(idFuncionario);
        }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + " | Salário: R$" +this.getSalario()+" | ID de Funcionário: "+this.getIdFuncionario();
    }

    
}