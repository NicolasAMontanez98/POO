package Accesores.paquete1;

public class Persona {
    private String firstname;
    private int age;

    public Persona(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
