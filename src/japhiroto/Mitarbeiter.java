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
public class Mitarbeiter {
    
    private int mitarbeiterId;
    private String anrede;
    private String vorname;
    private String nachname;
    private String strasse;
    private int hausNr;
    private int plz;
    private int ort;
    private int stundenLohn;

    public Mitarbeiter(String anrede, String vorname, String nachname, String strasse, int hausNr, int plz, int ort, int stundenLohn) {
        //initialisiert die Variablen mit den übergebenen Werten
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.plz = plz;
        this.ort = ort;
        this.stundenLohn = stundenLohn;
    }

    public Mitarbeiter() {
        //Standardkonstruktor
    }

    public int getMitarbeiterId() {
        //gibt die gespeicherte Mitarbeiter-ID aus
        return mitarbeiterId;
    }

    public String getAnrede() {
        //gibt die gespeicherte Anrede aus
        return anrede;
    }

    public void setAnrede(String anrede) {
        //speichert die übergebene Anrede in die Variable
        this.anrede = anrede;
    }

    public String getVorname() {
        //gibt den gespeicherten Vornamen aus
        return vorname;
    }

    public void setVorname(String vorname) {
        //speichert den übergebenen Vornamen in die Variable
        this.vorname = vorname;
    }

    public String getNachname() {
        //gibt den gespeicherten Nachnamen aus
        return nachname;
    }

    public void setNachname(String nachname) {
        //speichert den übergebenen Nachnamen in die Variable
        this.nachname = nachname;
    }

    public String getStrasse() {
        //gibt die gespeicherte Straße aus
        return strasse;
    }

    public void setStrasse(String strasse) {
        //speichert die übergebene Strasse in die Variable
        this.strasse = strasse;
    }

    public int getHausNr() {
        //gibt die gespeicherte Hausnummer aus
        return hausNr;
    }

    public void setHausNr(int hausNr) {
        //speichert die übergebene Hausnummer in die Variable
        this.hausNr = hausNr;
    }

    public int getPlz() {
        //gibt die gespeicherte PLZ aus
        return plz;
    }

    public void setPlz(int plz) {
        //speichert die übergebene <plz in die Variable
        this.plz = plz;
    }

    public int getOrt() {
        //gibt den gespeicherten Ort aus
        return ort;
    }

    public void setOrt(int ort) {
        //speichert den übergebenen Ort in die Variable
        this.ort = ort;
    }

    public int getStundenLohn() {
        //gibt den gespeicherten Stundenlohn aus
        return stundenLohn;
    }

    public void setStundenLohn(int stundenLohn) {
        //speichert den übergebenen Stundenlohn in die Variable
        this.stundenLohn = stundenLohn;
    }
    
    
    
    
    
    
}
