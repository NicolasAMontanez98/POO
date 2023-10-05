package Herencia.EjercicioUno;

public class FacturaIVA extends Factura {
    int porcentaje_IVA;

    public FacturaIVA(int numero_de_factura, double valor_total, int porcentaje_IVA) {
        super(numero_de_factura, valor_total);
        this.porcentaje_IVA = porcentaje_IVA;
    }

    public double calculateValueWithIVA () {
        return (this.valor_total + ((this.valor_total * this.porcentaje_IVA)/100));
    }

    public void mostrarFactura() {
        System.out.println(
            "========================== FACTURA CON IVA ========================= " + "\n" +
            "Numero de factura: " + this.numero_de_factura + "\n" +
            "Valor total: " + this.valor_total + "\n" +
            "Valor total con IVA: " + this.calculateValueWithIVA() + "\n" +
            "Cambio a moneda extranjera: " + calcularCambio(calculateValueWithIVA()) + "USD"
        );
    }
}