package Herencia.ClaseUno;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        String data = "Nombre: " + this.getNombre() + "\n" +
                "Apellido: " + this.getApellido() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Codigo Estudiante: " + this.codigoEstudiante + "\n" +
                "Nota Final: " + this.notaFinal;
        JOptionPane.showMessageDialog(null, data);
    }
}
