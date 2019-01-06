/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

    

/**
 *
 * @author Jan
 */
public class Kasse_Verwaltung {
    
    private DB_Verbindung dieDB_Verbindung;
    private DecimalFormat df = new DecimalFormat("0.00");

    public Kasse_Verwaltung() throws SQLException, IOException{
        dieDB_Verbindung = new DB_Verbindung();
        dieDB_Verbindung.verbindungAufbauen();
    }
    
    public void ansageOeffnen() throws JavaLayerException, FileNotFoundException{
        String oeffnen = "oeffnenKasse1.mp3";
        FileInputStream in = new FileInputStream(oeffnen);
        Player player = new Player(in);
        player.play();
    }
    public void soundKasse() throws JavaLayerException, FileNotFoundException{
        String soundKasse = "Cash Register Sound Effect.mp3";
        FileInputStream in = new FileInputStream(soundKasse);
        Player player = new Player(in);
        player.play();
    }
    
    public void ansageSchliessen() throws FileNotFoundException, JavaLayerException{
        String schliessen = "schliessenKasse1.mp3";
        FileInputStream in = new FileInputStream(schliessen);
        Player player = new Player(in);
        player.play();
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
    public void artikelAbziehen(ArrayList<Artikel> artikelliste) throws SQLException, IOException{
        for (int i = 0; i < artikelliste.size(); i++) {
            dieDB_Verbindung.verkaufeArtikel(artikelliste.get(i).getArtikelNummer(), artikelliste.get(i).getAnzahl());
        }
    }
    public double gesamtbetragBerechnen(ArrayList<Artikel> artikelliste){
        double gesamtBetrag=0;
        for (int i = 0; i < artikelliste.size();i++) {
            
            gesamtBetrag = gesamtBetrag + (artikelliste.get(i).getPreis()*artikelliste.get(i).getAnzahl());
        }   
        return gesamtBetrag;
    }
    public String ausgabeHeader(){
        String text;
        text = "Artikel:"+"\n"+"\n"; //Header noch schön gestalten
        return text;
    }
    
    public String kassenzettelErstellen(ArrayList<Artikel> artikelliste){
        String ausgabe="Artikel:"+"\n"+"\n";
        for (int i = 0; i < artikelliste.size();i++) {
            String name,leerzeichen="";
            int anzahlBuchstaben;
            int anzahlLeerzeichen;
            name = artikelliste.get(i).getName();
            anzahlBuchstaben = name.length();
            if(anzahlBuchstaben>16){
                String teil1 = name.substring(0, 14);
                String teil2 = name.substring(14);
                anzahlLeerzeichen = 27 - teil2.length();
                for (int j=0; j<=anzahlLeerzeichen; j++){
                    leerzeichen = leerzeichen +" ";
                }
                ausgabe = ausgabe + teil1+"-"+"\n"+
                teil2+leerzeichen+artikelliste.get(i).getPreis()+"€"+"\n"+
                        "Anzahl: "+artikelliste.get(i).getAnzahl()+"\n"+"\n";
            }
            else{
                anzahlLeerzeichen = 26 - anzahlBuchstaben;
                for (int j=0; j<anzahlLeerzeichen; j++){
                    leerzeichen = leerzeichen +" ";
                }
                ausgabe= ausgabe +name+leerzeichen+artikelliste.get(i).getPreis()+"€"+"\n"+
                        "Anzahl: "+artikelliste.get(i).getAnzahl()+"\n"+"\n";
            }
        }
        return ausgabe;
    }
    
    public String kassenzettelFuss(ArrayList<Artikel> artikelliste, Double gegeben){
        Double gesamt,rueck;
        String ausgabe, sGegeben,sRueck,sGesamt;
        
        gesamt = gesamtbetragBerechnen(artikelliste);
        rueck = gegeben - gesamt;
        sGegeben = df.format(gegeben);
        sRueck = df.format(rueck);
        sGesamt = df.format(gesamt);
        ausgabe = "=============================="+"\n"+"Gesamt:                  "+sGesamt+"€"+"\n"+"Gegeben:                 "+sGegeben+"€"+"\n"+
                "Zurück:                  "+sRueck+"€"+"\n"+"\n"+"Vielen Dank für"+"\n"+"Ihren Einkauf!";
        
        return ausgabe;
    }
    
    public void kassenzettelErzeugen(ArrayList<Artikel> artikelliste,Double gegeben) throws IOException{
        FileWriter f1;
        String ausgabe;
        
        ausgabe = ausgabeHeader() + kassenzettelErstellen(artikelliste)+kassenzettelFuss(artikelliste, gegeben);

            f1 = new FileWriter("kassenzettel.txt");
            f1.write(ausgabe);
            f1.close();
        
    } 
    
    
}