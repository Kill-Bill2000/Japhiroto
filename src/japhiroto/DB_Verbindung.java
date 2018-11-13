/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.sql.*;

/**
 *
 * @author robin
 */
public class DB_Verbindung {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private String url, dbHost, dbName, dbUser, dbPass;
    private String uri = "jdbc:mysql://sql7.freemysqlhosting.net/sql7265228";
    
    
    public DB_Verbindung(String host, String name, String user, String pass){
        this.dbHost = host;
        this.dbName = name;
        this.dbUser = user;
        this.dbPass = pass;
    }
    
    public boolean verbindungAufbauen() throws SQLException{
        //baut eine Verbindung zur Datenbank mit Host-Adresse, Benutzername und Passwort der DB auf
        //gibt 'true' zurück, wenn die Verbindung nach 5 Sekunden noch nicht geschlossen und valide ist
        
        con = DriverManager.getConnection("jdbc:mysql://" + dbHost + "/" + dbName, dbUser, dbPass);
        return con.isValid(5);
    }

    
}
