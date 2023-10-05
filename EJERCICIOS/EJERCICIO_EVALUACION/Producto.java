package EJERCICIOS.EJERCICIO_EVALUACION;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private static int cantidadTotalProductosVendidos = 0;
    private static double trm = 4073;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadTotalProductosVendidos++;
    }

    public static int getCantidadTotalProductosVendidos() {
        return cantidadTotalProductosVendidos;
    }

    public static double getPriceInUSD(double precio) {
        return precio / trm;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void getInfo() {
        System.out.println(
            "Nombre: " + nombre + "\n" +
            "Descripcion: " + descripcion + "\n" +
            "Precio: " + precio + "\n" +
            "Cantidad total vendida: " + getCantidadTotalProductosVendidos()
        );
    }
}