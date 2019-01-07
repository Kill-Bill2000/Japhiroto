/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.JobAttributes;
import java.awt.PageAttributes;
import java.awt.PrintJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
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
    private double umsatz=0;

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
        text = "  IT-Schule Stuttgart Testladen24\n"+
                "      Breitwießenstraße 20-22\n"+
                "          70565 Stuttgart\n"+
                "   Tel.: +49 (0) 711 216 89 –053\n\n\n"; 
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
                anzahlLeerzeichen = 28 - anzahlBuchstaben;
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
        druckeSeite(artikelliste);
        
    }
    public void umsatzAktualisieren(ArrayList<Artikel> artikelliste){
        umsatz = umsatz + gesamtbetragBerechnen(artikelliste);
    }
    public void umsatzAnDBsenden()throws SQLException{
        String sUmsatz;
        sUmsatz = Double.toString(umsatz);
        dieDB_Verbindung.setUmsatz(sUmsatz);
    }
    
    void druckeSeite( ArrayList<Artikel> artikelliste) {

        JFrame f;
        f = new JFrame();
        PageAttributes page = new PageAttributes();

       
            page.setOrientationRequested(PageAttributes.OrientationRequestedType.LANDSCAPE);
       

        PrintJob prjob = f.getToolkit().getPrintJob(f, "kassenzettel", new JobAttributes(), page);

        if (null != prjob) {
            final int iScreenResol = f.getToolkit().getScreenResolution();
            final int iPageResol = prjob.getPageResolution();
            final Dimension dimScreenSize = f.getToolkit().getScreenSize();
            final Dimension dimPageDimension = prjob.getPageDimension();
            Graphics pg = prjob.getGraphics();

           
                //merkt sich die Größe
                int iAddY = 1200;
                int iRand = (int) Math.round(iPageResol * 2. / 2.54); // 2 cm Rand
                int iPosX = 20; // Textposition
                int iPosY = 20 / 2;
                int iWdth = 369; // innere Breite
                int iMidY = 1200 / 2;
                pg.setColor(Color.black);
                Font font = new Font("Monospaced",Font.PLAIN, 13);
                pg.setFont(font);
                
                //setzt die Schrift und die Schriftgröße
                    String data = ausgabeHeader()+kassenzettelErstellen(artikelliste)+kassenzettelFuss(artikelliste, umsatz);
                    
                        
                    pg.drawString(data , iPosX, iPosY);

                    //Buffer wird geleert
                 

                 //wenn man noch gar nix hineingeschrieben hat, wird der Fehlertext gedruckt,
                //variable abendbar, ob überhaupt gedruckt werden soll
                    
                

                //wenn rand true ist, wird ein Rand gezeichnet
                
                pg.dispose();
            }
            prjob.end();
        
    }

    
}