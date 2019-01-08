/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

/**
 *
 * @author robin
 */
public class Account {
    
    private int accountId;
    private int mitarbeiterId;
    private String benutzername;
    private String passwort;
    private int rolle;
        //Rollen: 
        // 0 = Supermarktleiter
        // 1 = Kassierer
        // 2 = Lagerist

    public Account(){}
    
    public Account(int accountId, int mitarbeiterId, String benutzername, String passwort, int rolle) {
        //initialisiert die Variablen mit den übergebenen Werten
        this.accountId = accountId;
        this.mitarbeiterId = mitarbeiterId;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.rolle = rolle;
    }

    public Account(String benutzername, String passwort){
        this.benutzername = benutzername;
        this.passwort = passwort;
    }
    
    public int getAccountId() {
        //gibt die gespeicherte Account-ID aus
        return accountId;
    }

    public void setAccountId(int accountId) {
        //speichert die übergebene Account-ID in die Variable
        this.accountId = accountId;
    }

    public int getMitarbeiterId() {
        //gibt die gespeicherte Mitarbeiter-ID aus
        return mitarbeiterId;
    }

    public void setMitarbeiterId(int mitarbeiterId) {
        //speichert die übergebene Mitarbeiter-ID in die Variable
        this.mitarbeiterId = mitarbeiterId;
    }

    public String getBenutzername() {
        //gibt den gespeicherten Benutzernamen aus
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        //speichert den übergebenen Benutzernamen in die Variable
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        //gibt das gespeicherte Passwort aus
        return passwort;
    }

    public void setPasswort(String passwort) {
        //speichert das übergebene Passwort in die Variable
        this.passwort = passwort;
    }

    public int getRolle() {
        //gibt die gespeicherte Rolle aus
        return rolle;
    }

    public void setRolle(int rolle) {
        //speichert die übergebene Rolle in die Variable
        this.rolle = rolle;
    }
    
    
    
}
