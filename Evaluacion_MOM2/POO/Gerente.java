package Evaluacion_MOM2.POO;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, String puesto, double salario, String departamento) {
        super(nombre, puesto, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double calcularBonoAnual() {
        return this.getSalario() * 0.15;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
            "====================== GERENTE ======================" + "\n" +
            "Nombre: " + this.getNombre() + "\n" +
            "Puesto: " + this.getPuesto() + "\n" +
            "Salario: $" + this.getSalario() + "\n" +
            "Departamento: " + this.getDepartamento() + "\n" +
            "Bono anual: $" + this.calcularBonoAnual()
        );
    }

    public void trabajando() {
        System.out.println("El gerente está trabajando en el departamento " + this.getDepartamento());
    }
}
