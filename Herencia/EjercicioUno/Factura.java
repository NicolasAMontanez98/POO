package Herencia.EjercicioUno;

public class Factura {
    private static double trm = 3943.50;
    private static int contador_facturas = 0;
    int numero_de_factura;
    double valor_total;


    public Factura(int numero_de_factura, double valor_total) {
        this.numero_de_factura = numero_de_factura;
        this.valor_total = valor_total;
        this.contador_facturas = this.contador_facturas + 1;
    }

    public static double calcularCambio(double monto) {
        return monto / trm;
    }

    public static int getNumeroFacturas() {
        return contador_facturas;
    }

    public double getValor_total() {
        return this.getValor_total();
    }

    

    public void mostrarFactura() {
        System.out.println(
            "================================= FACTURA GENÉRICA ===============================" + "\n" +
            "Numero de factura: " + this.numero_de_factura + "\n" +
            "Valor total: " + this.valor_total + "\n" +
            "Cambio a moneda extranjera: " + calcularCambio(this.valor_total) + "USD"
        );
    }
}
