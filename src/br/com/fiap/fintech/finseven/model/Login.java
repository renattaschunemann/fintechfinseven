package br.com.fiap.fintech.finseven.model;

public class Login {
    private int idLogin;
    private String email;
    private String senha;
    private int tentativasLogin;
    private boolean contaBloqueada;



    public Login(){};


    public Login(int idLogin){
        System.out.println(idLogin);
    }

    public Login(int idLogin, String email, String senha, int tentativasLogin, boolean contaBloqueada) {
        this.idLogin = idLogin;
        this.email = email;
        this.senha = senha;
        this.tentativasLogin = tentativasLogin;
        this.contaBloqueada = contaBloqueada;
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

    public void realizarLogin() {
        System.out.println("Método realizarLogin executado - Validando acesso do usuário");
    }

    public void validarCredenciais() {
        System.out.println("Método validarCredenciais executado - Verificando email e senha");
    }

    public void recuperarSenha() {
        System.out.println("Método recuperarSenha executado - Processo de recuperação iniciado");
    }

    public void bloquearConta() {
        System.out.println("Método bloquearConta executado - Conta bloqueada por tentativas inválidas");
    }

    public void contatarSuporte() {
        System.out.println("Método contatarSuporte executado - Direcionando usuário ao suporte");
    }

}