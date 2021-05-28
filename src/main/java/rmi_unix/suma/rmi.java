/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_unix.suma;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author jost-ale
 */
public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi() throws RemoteException {
        int a, b;
    }

    @Override
    public int sum(int a, int b) throws RemoteException{
        return a + b;
    }
    
    @Override
    public int res(int a, int b) throws RemoteException{
        return a - b;
    }
    
    @Override
    public int mul(int a, int b) throws RemoteException{
        return a * b;
    }
    
    @Override
    public int div(int a, int b) throws RemoteException{
        return a / b;
    }
}
