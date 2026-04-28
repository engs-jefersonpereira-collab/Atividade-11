public class MainForma {
    public static void main(String[] args) {

        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}
