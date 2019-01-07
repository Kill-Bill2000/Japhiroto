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
public class LagerVerwaltung {

    private DB_Verbindung verbindung;
    
    public LagerVerwaltung() throws IOException {
        verbindung = new DB_Verbindung();
    }
    
    public boolean verbindungAufbauen() throws SQLException{
        return verbindung.verbindungAufbauen();
    }
    
    public boolean verbindungSchliessen() throws SQLException{
        return verbindung.verbindungSchliessen();
    }
    
    public void artikelHinzufuegen(Artikel art){
        verbindung.artikelHinzufuegen(art);
    }
    
}
