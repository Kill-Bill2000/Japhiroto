/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Toolkit;
import javax.swing.*;
/**
 *
 * @author robin
 */
public class Japhiroto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Setzt den Java L&F ("Nimbus")            
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            throw new IllegalAccessException("");
        } 
        catch (UnsupportedLookAndFeelException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Der gewählte Look & Feel \'" + UIManager.getLookAndFeel().getName() + "\'\nwird nicht unterstützt.", "L&F Fehler", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Die Klasse des ausgewählten Look & Feels \n\'" + UIManager.getLookAndFeel().getName() + "\' wurde nicht gefunden.", "L&F Fehler", JOptionPane.ERROR_MESSAGE);
        }
        catch (InstantiationException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Der Look & Feel \'" + UIManager.getLookAndFeel().getName() + "\' kann nicht \ninstantiiert werden.", "L&F Fehler", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalAccessException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Der Zugriff auf den Look & Feel \n\'" + UIManager.getLookAndFeel().getName() + "\' ist nicht möglich.", "L&F Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        new Login_GUI().setVisible(true); //erzeut und ruft die Login_GUI auf
    }
    
}
