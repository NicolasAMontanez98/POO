package EJERCICIOS.EJERCICIO_EVALUACION;

public class Pelicula extends Producto{
    private static int cantidadTotalPeliculasVendidas = 0;
    private String director;
    
    public Pelicula(String nombre, String descripcion, double precio, String director) {
        super(nombre, descripcion, precio);
        this.director = director;
        this.cantidadTotalPeliculasVendidas++;
    }

    public static int getCantidadTotalPeliculasVendidas() {
        return cantidadTotalPeliculasVendidas;
    }

    public void getInfo() {
        System.out.println(
            "=============== PELICULA ===============" + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Descripcion: " + getDescripcion() + "\n" +
            "Director: " + this.director + "\n" +
            "Precio: " + getPrecio() + "\n" +
            "Precio en dolares: " + getPriceInUSD(getPrecio()) + " USD" + "\n" +
            "Cantidad total de libros vendida: " + getCantidadTotalPeliculasVendidas()
        );
    }
}
