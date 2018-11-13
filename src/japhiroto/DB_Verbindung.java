/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.*;
import java.sql.*;

/**
 *
 * @author robin
 */
public class DB_Verbindung {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private String url, dbHost, dbPort, dbName, dbUser, dbPass;
    
    public DB_Verbindung() throws FileNotFoundException, IOException{
        //liest die Zugangsdaten aus der Datei 'zugangsdaten_db'
        einlesen("zugangsdaten_db");
    }
    
    public DB_Verbindung(String host, String port, String name, String user, String pass) throws IOException{
        this.dbHost = host;
        this.dbPort = port;
        this.dbName = name;
        this.dbUser = user;
        this.dbPass = pass;
        speichern();
    }
    
    public boolean verbindungAufbauen() throws SQLException{
        //baut eine Verbindung zur Datenbank mit Host-Adresse, Benutzername und Passwort der DB auf
        //liefert 'true' zurück, wenn die Verbindung nach 5 Sekunden noch nicht geschlossen und valide ist
        url = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        con = DriverManager.getConnection(url, dbUser, dbPass);
        return con.isValid(5);
    }

    private void einlesen(String dateipfad) throws FileNotFoundException, IOException{
        //liest die Zugangsdaten der übergebenen Datei ein und speichert diese in der Variablen
        //Aufbau der 'zugangsdaten_db'-Datei:
        //1 [host](Host-Adresse der DB)(default: 127.0.0.1)
        //2 [port](Zugriffsport für DBs)(default: 3306)
        //3 [name](Name der DB)
        //4 [user](Username der DB)
        //5 [pass](Passwort der DB)
        
        BufferedReader br;
        FileReader fr;
        
        fr = new FileReader(dateipfad);
        br = new BufferedReader(fr);
        
        this.dbHost = br.readLine();
        this.dbPort = br.readLine();
        this.dbName = br.readLine();
        this.dbUser = br.readLine();
        this.dbPass = br.readLine();
        
        br.close();
        fr.close();
    }
    
    private void speichern() throws IOException{
        //schreibt die Zugangsdaten aus den globalen Variablen in die 'zugangsdaten_db'-Datei und speichert diese
        //Aufbau der 'zugangsdaten_db'-Datei:
        //1 [host](Host-Adresse der DB)(default: 127.0.0.1)
        //2 [port](Zugriffsport für DBs)(default: 3306)
        //3 [name](Name der DB)
        //4 [user](Username der DB)
        //5 [pass](Passwort der DB)
        
        BufferedWriter br;
        FileWriter fr;
        
        fr = new FileWriter("zugangsdaten_db");
        br = new BufferedWriter(fr);
        
        br.write(this.dbHost + "\r\n");
        br.write(this.dbPort + "\r\n");
        br.write(this.dbName + "\r\n");
        br.write(this.dbUser + "\r\n");
        br.write(this.dbPass + "\r\n");
        
        br.close();
        fr.close();
    }
    
    public boolean isVerbindungValid() throws SQLException{
        //liefert 'true' zurück, wenn Verbindung zur DB nach 5 Sekunden noch nicht geschlossen und valide ist
        return con.isValid(5);
    }
    
    
}
