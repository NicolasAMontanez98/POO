package Polimorfismo.poo;

public class Pentagono extends Figura {
    private double lado;
    private final int grade = 36;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (5*(lado*lado))/(4*Math.tan(Math.PI/5));
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
