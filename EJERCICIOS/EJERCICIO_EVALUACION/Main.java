package EJERCICIOS.EJERCICIO_EVALUACION;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "Huerfano mago con traumas", 100000, "JK Rowling");
        Libro libro2 = new Libro("Test", "Test", 10000, "Jon Doe");
        Libro libro3 = new Libro("Test", "Test", 10000, "Jon Doe");
        Libro libro4 = new Libro("Test", "Test", 10000, "Jon Doe");
        Pelicula pelicula1 = new Pelicula("Iron Man", "Playboy, filantropo, multimillonario", 20000, "Jon Favreu");
        Pelicula pelicula2 = new Pelicula("Test", "Test", 10000, "Jon Doe");
        Pelicula pelicula3 = new Pelicula("Test", "Test", 10000, "Jon Doe");
        Pelicula pelicula4 = new Pelicula("Test", "Test", 10000, "Jon Doe");
        Pelicula pelicula5 = new Pelicula("Test", "Test", 10000, "Jon Doe");

        libro1.getInfo();
        pelicula1.getInfo();
    }
}
