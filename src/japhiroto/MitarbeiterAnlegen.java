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
public class MitarbeiterAnlegen {
    
    private DB_Verbindung verb;
    
    public MitarbeiterAnlegen() throws IOException, SQLException{
        verb = new DB_Verbindung();
        verb.verbindungAufbauen();
    }
    
    public boolean verbindungSchliessen() throws SQLException{
       return verb.verbindungSchliessen();
    }
    
    public void mitarbeiterAnlegen(Mitarbeiter marb) throws SQLException{
        verb.mitarbeiterAnlegen(marb);
    }
    
}
