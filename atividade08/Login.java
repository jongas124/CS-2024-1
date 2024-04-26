
public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {

        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException();
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

}
