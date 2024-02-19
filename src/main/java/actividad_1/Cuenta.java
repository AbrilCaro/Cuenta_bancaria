package actividad_1;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldo;

    //constructor

    public Cuenta () {
        this.numeroCuenta = 0;
        this.dni = 0;
        this.saldo = 0.0;
    }

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    //get and set

    public int getNumeroCuenta () {
        return numeroCuenta;
    }

    public void setNumeroCuenta (int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni () {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static Cuenta crearCuenta () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de cuenta");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Introduce tu DNI");
        long dni = scanner.nextLong();
        System.out.println("Introduce tu saldo actual");
        double saldo = scanner.nextDouble();

        return new Cuenta(numeroCuenta, dni, saldo);
    }

    public void ingresar(double ingreso) {
        saldo += ingreso;
        System.out.println("Haz ingresado " + ingreso + " en tu cuenta.");
    }

    public void retirar(double retiro) {
        if (saldo >= retiro) {
            saldo -= retiro;
            System.out.println("Haz retirado " + retiro + " de tu cuenta.");
        } else {
            saldo = 0;
            System.out.println("Saldo insuficiente.");
        }
    }


    public static void main(String[] args) {
        Cuenta cuenta = Cuenta.crearCuenta();
        System.out.println("Su cuenta ha sido creada con exito");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Numero de DNI: " + cuenta.getDni());
        System.out.println("Su saldo actual: " + cuenta.getSaldo());

        cuenta.ingresar(500);
        System.out.println("saldo despues del ingreso: $ " + cuenta.getSaldo());

        cuenta.retirar(200);
        System.out.println("Su saldo despues de retirar: $" + cuenta.getSaldo());


    }
}
