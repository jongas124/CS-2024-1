package tarefa07;
import java.sql.Date;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Endereco[] endereco;

    public PessoaFisica(String nome, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }
    
}
