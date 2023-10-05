package EJER_CUENTA_BANCARIA.CUENTA_BANCARIA;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) throws Exception {
        ImageIcon icono = new ImageIcon(new URL("https://media.tenor.com/lHaSX49JtGwAAAAC/ta-bien-esta-bien.gif"));
        ImageIcon icono_question = new ImageIcon(new URL("https://media.tenor.com/opHM6via0jMAAAAC/goku-hmm.gif"));

        String nombre = "";
        do {
            nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        } while (nombre.equals(""));
        String cuenta = "";
        do {
            cuenta = JOptionPane.showInputDialog("Introduce tu cuenta:");
        } while (cuenta.equals(""));
        double saldo = 0;
        do {
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu saldo:"));
        } while (saldo >= 0);
        Cuenta cuenta_uno = new Cuenta(nombre, cuenta, saldo);        
        JOptionPane.showMessageDialog(null, cuenta_uno.getGeneralState(), "Cuenta bancario", JOptionPane.PLAIN_MESSAGE, icono);
        int continuar = 0;
        do {
            String action = "";
            String message_action = "Solo son validas las opciones:\nOpción 1 => Consignación";
            do {
                if (cuenta_uno.getSaldo() > 0) message_action += "\nOpción 2 => Retiro";
                action = JOptionPane.showInputDialog(message_action);
            } while (!action.equals("1") && (cuenta_uno.getSaldo() <= 0 || !action.equals("2")));
            double money = 0;
            do {
                money = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto: "));
            } while (!action.equals("1") && !action.equals("2"));
            cuenta_uno.setSaldo(money, action.equals("2") || action.equalsIgnoreCase("Opción 2"));
            JOptionPane.showMessageDialog(null, cuenta_uno.getGeneralState(), "Cuenta bancario", JOptionPane.PLAIN_MESSAGE, icono);
            continuar = JOptionPane.showConfirmDialog(
                null,
                "¿Realizar otra operación?",
                "Cuenta bancaria",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icono_question
            );
        } while (continuar == 0);
    }
}
