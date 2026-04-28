class Administrador implements Autenticavel {
    private String senha;

    Administrador(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
