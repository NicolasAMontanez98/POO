package Evaluacion_MOM1.POO;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        EmpresaTransporte empresaUno = new EmpresaTransporte("Transportes Uno", 3, 3);
        EmpresaTransporte empresaDos = new EmpresaTransporte("Transportes Dos", 6, 3);

        System.out.println("Nombre de la empresa: "+empresaUno.getNombre());
        System.out.println("Número de vehículos: "+empresaUno.getNumVehiculos());
        System.out.println("Número de conductore: "+empresaUno.getNumConductores());
        System.out.println("Nombre de la empresa: "+empresaDos.getNombre());
        System.out.println("Número de vehículos: "+empresaDos.getNumVehiculos());
        System.out.println("Número de conductore: "+empresaDos.getNumConductores());

        System.out.println("Costo del envío: "+empresaUno.calculateTravelCost(100, 100));
        System.out.println("Costo del envío con pasajeros: "+empresaUno.calculateTravelCost(100, 100, 100));

        System.out.println("Costo del envío: "+empresaDos.calculateTravelCost(100, 100));
        System.out.println("Costo del envío con pasajeros: "+empresaDos.calculateTravelCost(100, 100, 100));

        empresaUno.setNumVehiculos(4);
        empresaDos.setNumConductores(5);

        System.out.println("Nombre de la empresa: "+empresaUno.getNombre());
        System.out.println("Número de vehículos: "+empresaUno.getNumVehiculos());
        System.out.println("Número de conductore: "+empresaUno.getNumConductores());
        System.out.println("Nombre de la empresa: "+empresaDos.getNombre());
        System.out.println("Número de vehículos: "+empresaDos.getNumVehiculos());
        System.out.println("Número de conductore: "+empresaDos.getNumConductores());
    }    
}
