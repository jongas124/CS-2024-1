package tarefa07;

public class Endereco {
    private int numero;
    private String complemento;
    private int CEP;
    private TipoEndereco tipoEndereco;
    private Bairro bairro;
    private Logradouro logradouro;

    public Endereco(int numero, String complemento, int CEP, TipoEndereco tipoEndereco, Bairro bairro, Logradouro logradouro) {
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.tipoEndereco = tipoEndereco;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCEP() {
        return CEP;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCEP(int cEP) {
        CEP = cEP;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

}