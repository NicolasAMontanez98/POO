package Evaluacion_MOM2.POO;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, String puesto, double salario, String lenguaje) {
        super(nombre, puesto, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public double calcularBonoAnual() {
        return this.getSalario() * 0.15;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
            "=================== DESARROLLADOR ===================" + "\n" +
            "Nombre: " + this.getNombre() + "\n" +
            "Puesto: " + this.getPuesto() + "\n" +
            "Salario: $" + this.getSalario() + "\n" +
            "Lenguaje: " + this.getLenguaje() + "\n" +
            "Bono anual: $" + this.calcularBonoAnual()
        );
    }

    public void trabajando() {
        System.out.println("El desarrollador trabaja con " + this.getLenguaje());
    }
}
