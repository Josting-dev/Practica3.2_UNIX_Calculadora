/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_unix.suma;

import java.net.InetAddress;
import java.rmi.Remote;
import javax.swing.JOptionPane;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jost-ale
 */
public class Servidor {
    public static void main(String[] args)
    {
        try{
            String IPad = (InetAddress.getLocalHost()).toString();
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099); //retorna lo que va a tener el registro
            r.rebind("Calculadora", (Remote) new rmi());
            JOptionPane.showMessageDialog(null, "El servidor esta escuchando en la IP: " + IPad);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "El servidor no se conecto: " + e);
        }
    }
    
    
}
