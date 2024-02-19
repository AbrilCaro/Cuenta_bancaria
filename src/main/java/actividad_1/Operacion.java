package actividad_1;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;


    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        this.numero1 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero:");
        this.numero2 = scanner.nextDouble();
    }

    //suma
    public double suma() {
        return numero1 + numero2;
    }

    //resta

    public double resta() {
        return numero1 - numero2;
    }

    //multiplicacion

    public double multiplicar() {

        if (numero1 == 0||numero2 == 0) {
        System.out.println("No se puede multiplicar por cero");
        return 0; }
          else {
        return numero1 * numero2;
    }

    }

//division

    public double division () {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0; }
        else {
            return numero1 / numero2;
        }
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Suma: " + operacion.suma());
        System.out.println("Resta: " + operacion.resta());
        System.out.println("Multiplicacion: " + operacion.multiplicar());
        System.out.println("Division: " + operacion.division());
    }
}
