/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author robin
 */
public class Umsatz {
    
    private int umsatzNr;
//    private String zeitstempel;
    private LocalDateTime zeitstempel;
    private double umsatz;

    public Umsatz(int umsatzNr, Timestamp zeitstempel, double umsatz) {
        //initialisiert die Variablen mit den übergebenen Werten
        this.umsatzNr = umsatzNr;
        this.zeitstempel = zeitstempel.toLocalDateTime();
        this.umsatz = umsatz;
    }

    public Umsatz() {
        //Standardkonstruktor
    }

    public int getUmsatzNr() {
        return umsatzNr;
    }

    public void setUmsatzNr(int umsatzNr) {
        this.umsatzNr = umsatzNr;
    }

    public LocalDateTime getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(LocalDateTime zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }
    
    
    
    
    
    
}
