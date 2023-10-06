package Evaluacion_MOM2.POO;

public abstract class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private static int contadorEmpleados = 0;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.contadorEmpleados++;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonoAnual();

    public void mostrarInformacion() {
        System.out.println(
            "Nombre: " + this.getNombre() + "\n" +
            "Puesto: " + this.getPuesto() + "\n" +
            "Salario: $" + this.getSalario() + "\n"
        );
    }

    public void trabajando() {
        System.out.println("El empleado está trabajando");
    }
}