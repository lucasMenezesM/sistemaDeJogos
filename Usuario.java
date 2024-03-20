package trabalhop2.SistemaDeJogos;
public abstract class Usuario{
    protected String nome, cpf, email, senha, endereco;

    public Usuario(String nome, String cpf, String email, String senha, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String imprimirDados(){
        return "Nome: "+this.getNome()+" | Email da conta: "+this.getEmail()+" | CPF: "+ this.getCpf()+ " | Endereço: "+this.getEndereco();
    }
}