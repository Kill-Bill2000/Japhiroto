/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;


import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author robin
 */
public class Login {
    private DB_Verbindung verb;
    
    public Login() throws IOException{
        //initialisiert verb
        verb = new DB_Verbindung();
    }
    
    public Login(String host, String port, String name, String user, String pass) throws IOException{
        //initialisiert verb
        verb = new DB_Verbindung(host, port, name, user, pass);
    }

    public boolean verbindungAufbauen() throws SQLException{
        //ruft die verbindungAufbauen-Methode der Klasse DB_Verbindung auf
        return verb.verbindungAufbauen();
    }
    
    public boolean verbindungSchliessen() throws SQLException{
        //ruft die verbindungSchliessen-Methode der Klasse DB_Verbindung auf
        return verb.verbindungSchliessen();
    }
    
    public boolean accountUeberpruefen(String user, String pass) throws SQLException{
        //ruft die accountUeberpruefen-Methode der Klasse DB_Verbindung mit den übergebenen Parametern auf
        return verb.accountUeberpruefen(user, pass);
    }
    
    public boolean accountUeberpruefen(Account acc) throws SQLException{
        //ruft die accountUeberpruefen-Methode der Klasse DB_Verbindung mit dem übergebenen Account auf
        return verb.accountUeberpruefen(acc);
    }
    
    public int rolleAbfragen(String user, String pass) throws SQLException{
        //ruft die rolleAbfragen-Methode der Klasse DB_Verbindung mit den übergebenen Parametern auf
        return verb.rolleAbfragen(user, pass);
    }
    
    public Account rolleAbfragen(Account acc) throws SQLException{
        //ruft die rolleAbfragen-Methode der Klasse DB_Verbindung mit dem übergebenen Account auf
        return verb.rolleAbfragen(acc);
    }
    
    
    
    
}
