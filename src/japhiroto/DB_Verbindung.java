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
    private String url, dbHost, dbPort, dbName, dbUser, dbPass;
    private DataManager dManager;
    
    public DB_Verbindung() throws FileNotFoundException, IOException{
        dManager = new DataManager();
        einlesen("zugangsdaten_db");
        
    }
    
    public DB_Verbindung(String host, String port, String name, String user, String pass) throws IOException{
        dManager = new DataManager();
        this.dbHost = host;
        this.dbPort = port;
        this.dbName = name;
        this.dbUser = user;
        this.dbPass = pass;
        speichern("zugangsdaten_db");
    }
    
    public boolean verbindungAufbauen() throws SQLException{
        //baut eine Verbindung zur Datenbank mit Host-Adresse, Benutzername und Passwort der DB auf
        //liefert 'true' zurück, wenn die Verbindung nach 5 Sekunden noch nicht geschlossen und valide ist
        url = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        con = DriverManager.getConnection(url, dbUser, dbPass);
        return con.isValid(5);
    }

    private void einlesen(String dateipfad) throws FileNotFoundException, IOException{
        //verwendet die datenEinlesen-Methode der DataManager-Klasse, um die Daten aus der 
        //übergebenen-Datei in den Variablen zu speichern
        String[] daten = dManager.datenEinlesen(dateipfad);
        
        this.dbHost = daten[0];
        this.dbPort = daten[1];
        this.dbName = daten[2];
        this.dbUser = daten[3];
        this.dbPass = daten[4];

    }
    
    private void speichern(String dateipfad) throws IOException{
        //verwendet die zugangsdatenSpeichern-Methode der DataManager-Klasse, um die Parameter 
        // in der übergebenen-Datei zu speichern
        dManager.zugangsdatenSpeichern(dbHost, dbPort, dbName, dbUser, dbPass, dateipfad);
    }
    
    public boolean isVerbindungValid() throws SQLException{
        //liefert 'true' zurück, wenn Verbindung zur DB nach 5 Sekunden noch nicht geschlossen und valide ist
        return con.isValid(5);
    }
    
    public boolean verbindungSchliessen() throws SQLException{
        //schliesst die DB
        //liefert 'true' zurück, wenn die Verbindung nach 5 Sekunden geschlossen oder nicht mehr valide ist
        con.close();
        
        return !con.isValid(5);
    }
    
    private ResultSet abfragen(String sqlBefehl) throws SQLException{
        //erstellt ein Statement mit dem übergebenen SQL-Befehl und 
        //liefert das abgefragte ResultSet zurück.
        //ResultSet und Statement werden dann wieder geschlossen
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery(sqlBefehl);
        
        //rs.close();   //Fehler bei .close(): 'SQLException: Operation not allowed after ResultSet closed'
        //stmt.close();
        
        return rs;
    }
    
    private void updaten(String sqlBefehl) throws SQLException{
        //erstellt ein Statement mit dem übergebenen SQL-Befehl und 
        //sendet ein Update (ISERT, UPDATE, DELETE) an die DB
        //Statement wird dann wieder geschlossen
        Statement stmt;
        
        stmt = con.createStatement();
        stmt.executeUpdate(sqlBefehl);
        
        stmt.close();
    }
        
    public void mitarbeiterAnlegen(Mitarbeiter marb) throws SQLException{
        //der übergebene Mitabeiter wird der DB hinzugefügt
        
        String befehl = String.format("INSERT INTO Mitarbeiter VALUES ('%1$s', '%2$s', '%3$s', '%4$s', '%5$d', '%6$d', '%7$s', '%8$f)",
                marb.getAnrede(), marb.getVorname(), marb.getNachname(), marb.getStrasse(), marb.getHausNr(), marb.getPlz(), marb.getOrt(), marb.getStundenLohn());
        
        updaten(befehl);
    }
        
    public void mitarbeiterBearbeiten(Mitarbeiter mitarb) throws SQLException{
        
        String befehl = String.format("UPDATE Mitarbeiter SET (anrede = '%1$s', vorname = '%2$s', nachname = '%3$s', strasse = '%4$s'"
                 + "hausNr = '%5$d', plz = '%6$d', ort = '%7$s', stundenLohn = '%8$f) WHERE mitarbeiterId = %9$d", 
                mitarb.getAnrede(), mitarb.getVorname(), mitarb.getNachname(), mitarb.getStrasse(), mitarb.getHausNr(), mitarb.getPlz(), mitarb.getOrt(), mitarb.getStundenLohn(), mitarb.getMitarbeiterId());
        
        updaten(befehl);
    }
    
    public int mitarbeiterIdAbfragen(String vorname, String nachname) throws SQLException{
        //liefert die Mitarbeiter-ID der DB zurück
        
        int id;
        String befehl = String.format("SELECT mitarbeiterId FROM Mitarbeiter WHERE (vorname = '%1$s' AND nachname = '%2$s')", vorname, nachname);
        ResultSet rs = abfragen(befehl);
        rs.next();
        id = rs.getInt(1);
        
        return id;
        
    }
    
    public Mitarbeiter mitarbeiterAbfragen(int mitarbeiterId) throws SQLException{
        //liefert den Mitarbeiter der DB zurück, der sie übergebene Mitarbeiter-ID enthält
        
        Mitarbeiter mitarb;
        String befehl = String.format("SELECT * FROM Mitarbeiter WHERE mitarbeiterId = %1$d", mitarbeiterId);
        ResultSet rs = abfragen(befehl);
        
        rs.next();
        mitarb = new Mitarbeiter(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getDouble(9));
        
        return mitarb;
    }
        
    public void accountAnlegen(Account acc) throws SQLException{
        //der übergebene Account wird der DB hinzugefügt
        
        String befehl = String.format("INSERT INTO Accounts (benutzername, passwort, rolle, mitarbeiterId) VALUES ('%1$s', '%2$s', %3$d, %4$d)", acc.getBenutzername(), acc.getPasswort(), acc.getRolle(), acc.getMitarbeiterId());
        
        updaten(befehl);
    }
    
    public int rolleAbfragen(String username, String passwort) throws SQLException{
        //die Rolle des Benutzerkontos mit den übergebenen Anmeldedaten wird von der DB angefragt und ausgegeben
        //Rollen: 
        // 0 = Supermarktleiter
        // 1 = Kassierer
        // 2 = Lagerist
        
        int rolle;
        
        String befehl = String.format("SELECT rolle FROM Accounts WHERE (benutzername = '%1$s' AND passwort = '%2$s')", username, passwort);
        ResultSet rs = abfragen(befehl);
        rs.next();
        rolle = rs.getInt(1);
        
        return rolle;
    }
    
    public Account rolleAbfragen(Account acc) throws SQLException{
        //die Rolle des Benutzerkontos mit den übergebenen Anmeldedaten wird von der DB angefragt und als kombinierter Account ausgegeben
        
        String befehl = String.format("SELECT * FROM Accounts WHERE (benutzername = '%1$s' AND passwort = '%2$s')", acc.getBenutzername(), acc.getPasswort());
        ResultSet rs = abfragen(befehl);
        rs.next();   
        acc.setRolle(rs.getInt("rolle"));
        acc.setMitarbeiterId(rs.getInt("mitarbeiterId"));
        
        return acc;
    }
    
    public boolean accountUeberpruefen(String username, String passwort) throws SQLException{
        //prueft, ob der User mit den übergebenen Anmeldedaten existiert bzw. valide ist
        
        boolean valid = true;
        String befehl = String.format("SELECT COUNT(rolle) FROM Accounts WHERE (benutzername = '%1$s' AND passwort = '%2$s')", username, passwort);
        ResultSet rs = abfragen(befehl);
        rs.next();

        if (rs.getInt(1) == 0 ) {
            valid = false;
        }
        
        return valid;
    }
    
    public boolean accountUeberpruefen(Account acc) throws SQLException{
        //prueft, ob der User mit den Anmeldedaten des übergebenen Accounts existiert bzw. valide ist
        
        boolean valid = true;
        String befehl = String.format("SELECT COUNT(rolle) FROM Accounts WHERE (benutzername = '%1$s' AND passwort = '%2$s')", acc.getBenutzername(), acc.getPasswort());
        ResultSet rs = abfragen(befehl);
        rs.next();

        if (rs.getInt(1) == 0 ) {
            valid = false;
        }
        
        return valid;
    }
    
}
