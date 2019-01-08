/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package japhiroto;

/**
 *
 * @author philip
 */
public class Artikel {
    private String artikelNummer;
    private double verkauftsPreis; //noch mehr kommentar
    private String artikelName;
    private int anzahl = 1;//nur für die Kasse relevant
    private int bestand;
    
    public Artikel(String name, double preis, String nummer,int bestand) {
        this.artikelName = name;
        this.verkauftsPreis = preis;
        this.artikelNummer = nummer;
        this.bestand = bestand;
    }

    public Artikel(String name, double preis, String nummer,int bestand ,int anzahl) {
        this.artikelName = name;
        this.verkauftsPreis = preis;
        this.artikelNummer = nummer;
        this.anzahl = anzahl;
        this.bestand = bestand;
    }
    
    public double getPreis() {
        return verkauftsPreis;
    }
    public void setPreis(double neu) {
        this.verkauftsPreis = neu;
    }
    
    public String getName() {
        return artikelName;
    }
    public void setName(String name) {
        artikelName = name;
    }
    
    public String getArtikelNummer() {
        return artikelNummer;
    }
    public int getAnzahl(){
        return anzahl;
    }
    public void setArtikelNummer(String artNr) {
        artikelNummer = artNr;
    }

    public int getBestand() {
        return bestand;
    }
    public void setAnzahl(int anz) {
        anzahl = anz;
    }
    
}
