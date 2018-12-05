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
    
    public void accountUeberpruefen(String user, String pass) throws SQLException{
        verb.accountUeberpruefen(user, pass);
    }
    
    public String passwortToString(char[] password) {
        //konvertiert das übergebene Passwort (als Character-Array) zu einem String und liefert diesen zurück
        String out = "";
        
        for (int i = 0; i < password.length; i++) {
            out += password[i];
        }
        
        return out;
    }
    
    public String[] datenEinlesen(String dateipfad) throws FileNotFoundException, IOException, NullPointerException{
        //liest die in 'zugangsdaten_db' vorhandenen Date nein und liefert die in einem Array zurück
        //Array Aufbau: [host_ip_1] [host_ip_2] [host_ip_3] [host_ip_4] [port]  [db_name]   [db_username]   [db_passwort]
        //IP-Adresse Aufbau: [host_ip_1].[host_ip_2].[host_ip_3].[host_ip_4]
        
        String hostIP, ip1 = "", ip2 = "", ip3 = "", ip4 = "";
        int ind = 0;
        String[] daten = new String[8];
        BufferedReader br;
        
        br = new BufferedReader(new FileReader(dateipfad));
        
        hostIP = br.readLine();

        //erste Zeile der Datei (-> Host-IP-Adresse) auslesen und einzelne Teile in Array speichern
        while(hostIP.length() > ind && hostIP.charAt(ind) != '.'){
            ip1 += hostIP.charAt(ind);
            ind++;
        }
        ind++;
        while(hostIP.length() > ind && hostIP.charAt(ind) != '.'){
            ip2 += hostIP.charAt(ind);
            ind++;
        }
        ind++;
        while(hostIP.length() > ind && hostIP.charAt(ind) != '.'){
            ip3 += hostIP.charAt(ind);
            ind++;
        }
        ind++;
        while(hostIP.length() > ind && hostIP.charAt(ind) != '.'){
            ip4 += hostIP.charAt(ind);
            ind++;
        }
               
        daten[0] = ip1;
        daten[1] = ip2;
        daten[2] = ip3;
        daten[3] = ip4;
        
        //restliche Zeilen der Datei auslesen und in Array speichern
        for (int i = 4; i < daten.length; i++) {
            daten[i] = br.readLine();
        }
        
        br.close();
        
        return daten;
    }
}
