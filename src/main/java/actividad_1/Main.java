package actividad_1;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());


        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}