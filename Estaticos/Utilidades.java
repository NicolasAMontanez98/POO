package Estaticos;

public class Utilidades {
    public static double convertCelsiusToFahrenheit(double grades) {
        return (1.8 * grades) + 32;
    }

    public static double convertFahrenheitToCelsius(double grades) {
        return (grades - 32) / 1.8;
    }

    public static double calculateCircleArea(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double calculateCirclePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calculateHypotenuse(double catOpu, double catAdy) {
        return Math.pow(catOpu, 2) + Math.pow(catAdy, 2);
    }
}
