/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class BestellungVerwalten {
    private DB_Verbindung db;
    
    public BestellungVerwalten() throws IOException, SQLException {
        db = new DB_Verbindung();
        db.verbindungAufbauen();
    }
    
    public ArrayList<Bestellung> getBestellungen() throws SQLException {
        return db.getBestellungen();
    }

    public void verbindungSchliessen() throws SQLException {
        db.verbindungSchliessen();
    }

    public void wareAngekommen(String bestNr, String artNr, int intEingang) throws SQLException, IOException {
        db.wareAngekommen(bestNr, artNr, intEingang);
    }
}
