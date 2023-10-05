package EJER1.POO;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado (String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = 0;
    }

    public Empleado (String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String obtenerInformacion() {
        return this.nombre + " | " + this.cargo;
    }
    public String obtenerInformacion(boolean incluirSalario) {
        String info = this.nombre + " | " + this.cargo;
        if (incluirSalario) info += " | " + this.salario; 
        return info;
    }
}