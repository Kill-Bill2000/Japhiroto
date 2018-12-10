/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author robin
 */
public class DataManager {
    
    public String passwortToString(char[] password) {
        //konvertiert das als Character-Array übergebene Passwort zu einem String und liefert diesen zurück
        String out = "";
        
        for (int i = 0; i < password.length; i++) {
            out += password[i];
        }
        
        return out;
    }
    
    public String[] datenEinlesen(String dateipfad) throws FileNotFoundException, IOException, NullPointerException{
        //liest die in Daten der Datei des übergebenen Dateipfades ein und liefert die in einem Array zurück
        //Array Index:  [          0          ] [    1    ] [    2    ] [    3    ] [    4    ] [ 5  ] [   6   ] [     7     ] [     8     ]
        //Array Aufbau: [ip-adresse vorhanden?] [host_ip_1] [host_ip_2] [host_ip_3] [host_ip_4] [port] [db_name] [db_username] [db_passwort]
        //IP-Adresse Aufbau: [host_ip_1].[host_ip_2].[host_ip_3].[host_ip_4]
        //Wenn eine IP-Adresse in der Datei erkannt wird, ist der erste Wert des Arrays "true", sonst "false"
        //Wenn eine URL vorhanden ist (also keine IP-Adresse), dann wird diese an Stelle [1] geschrieben 
        
        String hostIP, ip1 = "", ip2 = "", ip3 = "", ip4 = "";
        int ind = 0;
        String[] daten = new String[9];
        BufferedReader br;
        
        br = new BufferedReader(new FileReader(dateipfad));
        
                
        if (ipAdresseVorhanden(dateipfad)) {     //Eine IP-Adresse ist vorhanden
            daten[0] = "true";

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

            daten[1] = ip1;
            daten[2] = ip2;
            daten[3] = ip3;
            daten[4] = ip4;
        } else {        //Eine URL ist vorhanden
            daten[0] = "false";
            daten[1] = br.readLine();
        }
        
        //restliche Zeilen der Datei auslesen und in Array speichern
        for (int i = 5; i < daten.length; i++) {
            daten[i] = br.readLine();
        }
        
        br.close();
        
        return daten;
    }
    
    public void zugangsdatenSpeichern(String host, String port, String name, String user, String pass, String dateipfad) throws IOException{
        //schreibt die Zugangsdaten aus den globalen Variablen in die übergebeneDatei und speichert diese
        //Aufbau der 'zugangsdaten_db'-Datei:
        //1 [host](Host-Adresse der DB)(default: 127.0.0.1)
        //2 [port](Zugriffsport für DBs)(default: 3306)
        //3 [name](Name der DB)
        //4 [user](Username der DB)
        //5 [pass](Passwort der DB)
        
        BufferedWriter br;
        FileWriter fr;
        
        fr = new FileWriter(dateipfad);
        br = new BufferedWriter(fr);
        
        br.write(host + "\r\n");
        br.write(port + "\r\n");
        br.write(name + "\r\n");
        br.write(user + "\r\n");
        br.write(pass);
        
        br.close();
        fr.close();
    }

    public boolean ipAdresseVorhanden(String dateipfad) throws FileNotFoundException, IOException {
        //liefert 'true' zurück, wenn in der Datei eine IP-Adresse gefunden wurde
        //Prüfung erfolgt, indem die Punkte in der ersten Zeile der Datei gezählt werden.
        //Wenn punkte < 3, dann wurde keine IP-Adresse gefunden
        boolean out = true;
        BufferedReader br;
        String host;
        int punkte = 0;
        
        br = new BufferedReader(new FileReader(dateipfad));
        host = br.readLine();
        
        for (int i = 0; i < host.length(); i++) {
            if (host.charAt(i) == '.') {
                punkte++;
            }
        }
        
        if (punkte < 3) {
            out = false;
        }
        
        return out;
    }


}
