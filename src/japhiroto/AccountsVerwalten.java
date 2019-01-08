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
 * @author robin
 */
public class AccountsVerwalten {
    
    private DB_Verbindung verb;
    
    public AccountsVerwalten() throws IOException, SQLException{
        verb = new DB_Verbindung();
        verb.verbindungAufbauen();
    }
    
    public boolean verbindungSchliessen() throws SQLException{
        return verb.verbindungSchliessen();
    }

    public ArrayList<Mitarbeiter> getAllEmployeesArrayList() throws SQLException {
        return verb.getAllEmployeesArrayList();
    }

    public ArrayList<Account> getAllAccountsArrayList() throws SQLException {
        return verb.getAllAccountsArrayList();
    }

    public void accountAnlegen(Account acc) throws SQLException {
        verb.accountAnlegen(acc);
    }

    public Mitarbeiter mitarbeiterAbfragen(int mitarbeiterId) throws SQLException {
       return verb.mitarbeiterAbfragen(mitarbeiterId);
    }
    
    
}
