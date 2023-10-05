package Herencia.EjercicioUno;

public class Main {
    public static void main(String[] args) {
        Factura factura_generica = new Factura(1, 100000);
        FacturaIVA facturaIVA = new FacturaIVA(2, 200000, 19);
        Factura factura_generica1 = new Factura(5, 150000);

        factura_generica.mostrarFactura();
        facturaIVA.mostrarFactura();

        System.out.println("Número de facturas creadas: " + Factura.getNumeroFacturas());
    }
}
