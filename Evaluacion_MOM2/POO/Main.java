package Evaluacion_MOM2.POO;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alejandro Ortiz", "Gerente general", 10000, "Tecnología");
        Desarrollador desarrollador = new Desarrollador("Nicolás Montañez", "Desarrollador fullstack", 5000, "Typescript");

        gerente.mostrarInformacion();
        desarrollador.mostrarInformacion();
        
        System.out.println("\n" + "=========> Número total de empleados: " + Empleado.getContadorEmpleados() + "\n");

        gerente.trabajando();
        desarrollador.trabajando();

        System.out.println("\n");
    }
}
