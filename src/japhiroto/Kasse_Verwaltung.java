/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

    

/**
 *
 * @author Jan
 */
public class Kasse_Verwaltung {
    
    private DB_Verbindung dieDB_Verbindung;

    public Kasse_Verwaltung(DB_Verbindung dieDB_Verbindung) throws SQLException{
        this.dieDB_Verbindung = dieDB_Verbindung;
        dieDB_Verbindung.verbindungAufbauen();
    }
    
    
    
    
    
    
    
    
    
    
    public Artikel artikelSuchen(String artikelNr) throws SQLException{
        
        Artikel rArtikel;
        rArtikel = dieDB_Verbindung.getArtikel(artikelNr);
        return rArtikel;
    }
    public Artikel artikelSuchenMitAnzahl(String artikelNr,int anz) throws SQLException{
        
        Artikel rArtikel;
        rArtikel = dieDB_Verbindung.getArtikelMitAnzahl(artikelNr,anz);
        return rArtikel;
    }
    public double gesamtbetragBerechnen(ArrayList<Artikel> artikelliste){
        double gesamtBetrag=0;
        for (int i = 0; i <= artikelliste.size(); i++) {
            
            gesamtBetrag = gesamtBetrag + (artikelliste.get(i).getPreis()*artikelliste.get(i).getAnzahl());
        }
        gesamtBetrag = (Math.round(gesamtBetrag)*10)/10;
        return gesamtBetrag;
    }
    public String ausgabeHeader(){
        String text;
        text = "Artikel:"+"\n"+"\n"; //Header noch schön gestalten
        return text;
    }
    
    public String kassenzettelErstellen(ArrayList<Artikel> artikelliste){
        String ausgabe="";
        for (int i = 0; i <= artikelliste.size(); i++) {
            String name,leerzeichen="";
            int anzahlBuchstaben;
            int anzahlLeerzeichen;
            name = artikelliste.get(i).getName();
            anzahlBuchstaben = name.length();
            if(anzahlBuchstaben>16){
                String teil1 = name.substring(0, 14);
                String teil2 = name.substring(15);
                anzahlLeerzeichen = 26 - teil2.length();
                for (i=0; i<anzahlLeerzeichen; i++){
                    leerzeichen = leerzeichen +" ";
                }
                ausgabe = ausgabe + teil1+"-"+"\n"+
                teil2+leerzeichen+artikelliste.get(i).getPreis()+"€"+"\n"+
                        "Anzahl: "+artikelliste.get(i).getAnzahl()+"\n"+"\n";
            }
            else{
                anzahlLeerzeichen = 26 - anzahlBuchstaben;
                for (i=0; i<anzahlLeerzeichen; i++){
                    leerzeichen = leerzeichen +" ";
                }
                ausgabe= ausgabe +name+leerzeichen+artikelliste.get(i).getPreis()+"€"+"\n"+
                        "Anzahl: "+artikelliste.get(i).getAnzahl()+"\n"+"\n";
            }
        }
        return ausgabe;
    }
    
    private void kassenzettelErzeugen(ArrayList<Artikel> artikelliste) throws IOException{
        FileWriter f1;
        String ausgabe;
        
        ausgabe = ausgabeHeader() + kassenzettelErstellen(artikelliste);

            f1 = new FileWriter("kassenzettel.txt");
            f1.write(ausgabe);
            f1.close();
        
    } 
    
    
}