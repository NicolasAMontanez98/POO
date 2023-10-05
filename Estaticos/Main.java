package Estaticos;

public class Main {
    public static void main(String[] args) {
        double gradesCelcius = 373;
        double gradesFarenheit = 777;
        System.out.println("===> " + gradesCelcius + " °C === " + Utilidades.convertCelsiusToFahrenheit(gradesCelcius) + " °F");
        System.out.println("===> " + gradesFarenheit + " °F === " + Utilidades.convertFahrenheitToCelsius(gradesFarenheit) + " °C");
        double radio = 3.3;
        System.out.println("===> " + "Area de un círculo con radio (" + radio + "): " + Utilidades.calculateCircleArea(radio));
        System.out.println("===> " + "Perímetro de un círculo con radio (" + radio + "): " + Utilidades.calculateCirclePerimeter(radio));
        double catOpu = 3;
        double catAdy = 7;
        System.out.println("===> " + "Hipotenusa de un triangulos con catetos (" + catOpu + ") y (" + catAdy + "): " + Utilidades.calculateHypotenuse(catOpu, catAdy));
    }
}
