/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_unix.suma;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 * |
 *
 * @author jost-ale
 */
public class cliente {

    public static void main(String[] args) {
        int x, y, op = 0;

        try {
            Registry MiRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora) Naming.lookup("//localhost/Calculadora");

            while (op != 5) {
                op = Integer.parseInt(JOptionPane.showInputDialog("CALCULADORA\n"
                        + "1. Sumar\n"
                        + "2 .Restar\n"
                        + "3. Multiplicar\n"
                        + "4. Dividir\n"
                        + "5. Salir\n")
                    );
                
                switch (op) {
                    case 1:
                        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));

                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + c.sum(x, y));
                        break;

                    case 2:
                        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));

                        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + c.res(x, y));
                        break;

                    case 3:
                        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));

                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + c.mul(x, y));
                        break;

                    case 4:
                        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));

                        while (y == 0) {
                            JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIDIR POR 0");
                            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
                        }

                        JOptionPane.showMessageDialog(null, "El resultado de la divicion es: " + c.div(x, y));
                        break;

                    default:
                        break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El servidor no se conecto " + e);
        }
    }
}
