/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author robin
 */
public class Login {
    private DB_Verbindung verb;
    
    public Login() throws IOException{
        verb = new DB_Verbindung();
    }
    
    public Login(String host, String port, String name, String user, String pass) throws IOException{
        verb = new DB_Verbindung(host, port, name, user, pass);
    }

    public boolean verbindungAufbauen() throws SQLException{
        return verb.verbindungAufbauen();
    }
    
    public boolean verbindungSchliessen() throws SQLException{
        return verb.verbindungSchliessen();
    }
    
    public boolean accountUeberpruefen(String user, String pass) throws SQLException{
        return verb.accountUeberpruefen(user, pass);
    }
    
    public boolean accountUeberpruefen(Account acc) throws SQLException{
        return verb.accountUeberpruefen(acc);
    }
    
    public int rolleAbfragen(String user, String pass) throws SQLException{
        return verb.rolleAbfragen(user, pass);
    }
    
    public Account rolleAbfragen(Account acc) throws SQLException{
        return verb.rolleAbfragen(acc);
    }
    
    public String passwortToString(char[] password) {
        //konvertiert das übergebene Passwort (als Character-Array) zu einem String und liefert diesen zurück
        String out = "";
        
        for (int i = 0; i < password.length; i++) {
            out += password[i];
        }
        
        return out;
    }
    
    
}
