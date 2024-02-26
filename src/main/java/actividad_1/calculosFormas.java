package actividad_1;

public interface calculosFormas {
    double PI = 3.1416;
    double calcularArea ();
    double calcularPerimetro ();
}

//Circulo

class Circulo implements calculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;

    }

     @Override

    public double calcularArea () {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro () {
        return 2 * PI * radio;
    }
}

// Rectangulo

class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea () {
        return base * altura;
    }

    @Override
    public double calcularPerimetro () {
        return 2 * (base + altura);
    }
}

