public class MainAuth {
    public static void main(String[] args) {

        Usuario user = new Usuario("123");
        Administrador admin = new Administrador("admin");

        System.out.println(user.autenticar("123"));
        System.out.println(admin.autenticar("admin"));
    }
}
