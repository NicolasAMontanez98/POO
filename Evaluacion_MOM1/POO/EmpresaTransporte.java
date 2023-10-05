package Evaluacion_MOM1.POO;

public class EmpresaTransporte {
    String nombre;
    int numVehiculos;
    int numConductores;

    public EmpresaTransporte(String nombre, int numVehiculos, int numConductores) {
        this.nombre = nombre;
        this.numVehiculos = numVehiculos;
        this.numConductores = numConductores;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public int getNumConductores() {
        return numConductores;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public void setNumConductores(int numConductores) {
        this.numConductores = numConductores;
    }

    // Metodo que calcula el costo del envío
    public double calculateTravelCost (double distance, double weight) {
        double base_fee = 100000;
        double aditional_traveled_kilometer = 1000;
        double aditional_kilogram_weight = 1000;


        return base_fee + (aditional_traveled_kilometer * distance) + (aditional_kilogram_weight * weight);
    }
    
    // Metodo que calcula el costo del envío con cargo adicional de pasajeros
    public double calculateTravelCost (double distance, double weight, int numPassengers) {
        double base_fee = 100000;
        double aditional_traveled_kilometer = 1000;
        double aditional_kilogram_weight = 1000;
        double aditional_each_passenger = 1000;


        return base_fee + (aditional_traveled_kilometer * distance) + (aditional_kilogram_weight * weight) + (aditional_each_passenger * numPassengers);
    }
}
