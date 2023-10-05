package EJER1.POO;

public class main {
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado("Jane Doe", "Desarrollador web", 100000);
        Empleado empleadoDos = new Empleado("Joe Doe", "Desarrollador full stack");

        System.out.println(empleadoUno.obtenerInformacion());
        System.out.println(empleadoUno.obtenerInformacion(true));
        System.out.println(empleadoDos.obtenerInformacion());
        System.out.println(empleadoDos.obtenerInformacion(true));
    }
}
