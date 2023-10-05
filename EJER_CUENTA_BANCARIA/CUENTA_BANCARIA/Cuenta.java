package EJER_CUENTA_BANCARIA.CUENTA_BANCARIA;

public class Cuenta {
    private String nombre_titular;
    private String numero_cuenta;
    private double saldo;

    public Cuenta(String nombre_titular, String numero_cuenta, double saldo) {
        this.nombre_titular = nombre_titular;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    
    public void setSaldo(double saldo, boolean retirar) {
        if (retirar) {
            this.saldo -= saldo;
        } else {
            this.setSaldo(saldo);
        }
    }

    public String getNombreTitular() {
        return nombre_titular;
    }

    public String getNumeroCuenta() {
        return numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getGeneralState() {
        String message = "";
        message += "Nombre del titular: " + this.nombre_titular;
        message += "\nNúmero de cuenta: " + this.numero_cuenta;
        message += "\nSaldo: " + this.saldo;
        return message;
    }
}
