package EJERCICIOS.EJERCICIO_EVALUACION;

public class Libro extends Producto {
    private static int cantidadTotalLibrosVendidos = 0;
    private String autor;

    public Libro(String nombre, String descripcion, double precio, String autor) {
        super(nombre, descripcion, precio);
        this.autor = autor;
        this.cantidadTotalLibrosVendidos++;
    }

    public static int getCantidadTotalLibrosVendidos() {
        return cantidadTotalLibrosVendidos;
    }

    public void getInfo() {
        System.out.println(
            "=============== LIBRO ===============" + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Descripcion: " + getDescripcion() + "\n" +
            "Autor: " + this.autor + "\n" +
            "Precio: " + getPrecio() + "\n" +
            "Precio en dolares: " + getPriceInUSD(getPrecio()) + " USD" + "\n" +
            "Cantidad total de libros vendida: " + getCantidadTotalLibrosVendidos()
        );
    }
}
