package br.com.fiap.fintech.finseven.model;

public class Login {
    private int idLogin;
    private String email;
    private String senha;
    private int tentativasLogin;
    private boolean contaBloqueada;
    private Usuario usuario;


    public Login() {
    }

    public Login(int idLogin) {
        this.idLogin = idLogin;
    }

    public Login(int idLogin, String email, String senha, int tentativasLogin, boolean contaBloqueada, Usuario usuario) {
        this.idLogin = idLogin;
        this.email = email;
        this.senha = senha;
        this.tentativasLogin = tentativasLogin;
        this.contaBloqueada = contaBloqueada;
        this.usuario = usuario;
    }


    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
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

    public int getTentativasLogin() {
        return tentativasLogin;
    }

    public void setTentativasLogin(int tentativasLogin) {
        this.tentativasLogin = tentativasLogin;
    }

    public boolean isContaBloqueada() {
        return contaBloqueada;
    }

    public void setContaBloqueada(boolean contaBloqueada) {
        this.contaBloqueada = contaBloqueada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    //Método realizarLogin
    public void realizarLogin() {
        System.out.println("Validando acesso do usuário");
    }

    //Método validarCredenciais executado
    public void validarCredenciais() {
        System.out.println("Verificando email e senha");
    }

    //Método recuperarSenha executado
    public void recuperarSenha() {
        System.out.println("Processo de recuperação iniciado");
    }

    //Método bloquearConta executado
    public void bloquearConta() {
        System.out.println("Conta bloqueada por tentativas inválidas");
    }

    //Método contatarSuporte executado
    public void contatarSuporte() {
        System.out.println("Direcionando usuário ao suporte");
    }

}