/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author robin
 */
public class Login {
    private DB_Verbindung verb;
    private DataManager dMan;
    
    public Login(){
        //initialisiert dMan
        dMan = new DataManager();
    }
    
    public boolean verbindungAufbauen() throws SQLException, IOException{
        //ruft die verbindungAufbauen-Methode der Klasse DB_Verbindung auf
        verb = new DB_Verbindung();
        return verb.verbindungAufbauen();
    }
    
    public boolean verbindungAufbauen(String host, String port, String name, String user, String pass) throws SQLException, IOException{
        //ruft die verbindungAufbauen-Methode der Klasse DB_Verbindung auf
        verb = new DB_Verbindung(host, port, name, user, pass);
        return verb.verbindungAufbauen();
    }
    
    public boolean verbindungAufgebaut() throws SQLException{
        return verb.isVerbindungValid();
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
    
    public String[] datenEinlesen(String dateipfad) throws IOException{
        //ruft die datenEinlesen-Methode der Klasse DataManager auf
        return dMan.datenEinlesen(dateipfad);
    }
    
    public boolean ipAdresseVorhanden(String dateipfad) throws FileNotFoundException, IOException{
        //ruft die ipAdresseVorhanden-Mathode der Klasse DataManager auf
        return dMan.ipAdresseVorhanden(dateipfad);
    }
    
    public String passwortToString(char[] password){
        //ruft die PasswortToString Methode der Klasse DataManager auf
        return dMan.passwortToString(password);
    }
    
    public boolean fileErstellen(String dateipfad) throws IOException{
        return dMan.fileErstellen(dateipfad);
    }
    
}
