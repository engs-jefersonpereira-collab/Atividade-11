class Usuario implements Autenticavel {
    private String senha;

    Usuario(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
