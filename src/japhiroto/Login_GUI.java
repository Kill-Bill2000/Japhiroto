/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Dimension;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author robin
 */
public class Login_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_GUI() {
        initComponents();
        initGUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNormal = new javax.swing.JPanel();
        jpbLogo = new japhiroto.JPictureBox();
        lblBenutzername = new javax.swing.JLabel();
        txfBenutzername = new javax.swing.JTextField();
        lblPasswort = new javax.swing.JLabel();
        txpPasswort = new javax.swing.JPasswordField();
        sep1 = new javax.swing.JSeparator();
        pnlErweitert = new javax.swing.JPanel();
        lblHost = new javax.swing.JLabel();
        txfIP1 = new javax.swing.JTextField();
        lblPunkt1 = new javax.swing.JLabel();
        txfIP2 = new javax.swing.JTextField();
        txfPunkt2 = new javax.swing.JLabel();
        txfIP3 = new javax.swing.JTextField();
        txfPunkt3 = new javax.swing.JLabel();
        txfIP4 = new javax.swing.JTextField();
        lblDPunkt = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        txfPort = new javax.swing.JTextField();
        lblDBName = new javax.swing.JLabel();
        txfDBName = new javax.swing.JTextField();
        lblDBUser = new javax.swing.JLabel();
        txfDBUser = new javax.swing.JTextField();
        lblDBPass = new javax.swing.JLabel();
        txpDBPass = new javax.swing.JPasswordField();
        pnlButtons = new javax.swing.JPanel();
        lblErweitert = new javax.swing.JLabel();
        btnAnmelden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Japhiroto - Login");
        setResizable(false);

        jpbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japhiroto/Japhiroto_lang_schwarz.png"))); // NOI18N
        jpbLogo.setSizeMode(japhiroto.JPictureBox.SizeMode.ZOOM);

        lblBenutzername.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblBenutzername.setText("Benutzername:");

        txfBenutzername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblPasswort.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblPasswort.setText("Passwort:");

        txpPasswort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txpPasswort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txpPasswortFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pnlNormalLayout = new javax.swing.GroupLayout(pnlNormal);
        pnlNormal.setLayout(pnlNormalLayout);
        pnlNormalLayout.setHorizontalGroup(
            pnlNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNormalLayout.createSequentialGroup()
                        .addGroup(pnlNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txpPasswort, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfBenutzername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBenutzername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswort, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpbLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNormalLayout.setVerticalGroup(
            pnlNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNormalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBenutzername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfBenutzername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPasswort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txpPasswort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblHost.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblHost.setText("Host-Adresse:");

        txfIP1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfIP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIP1.setText("127");
        txfIP1.setPreferredSize(new java.awt.Dimension(40, 27));
        txfIP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIP1FocusGained(evt);
            }
        });

        lblPunkt1.setText(".");

        txfIP2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfIP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIP2.setText("0");
        txfIP2.setPreferredSize(new java.awt.Dimension(40, 27));
        txfIP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIP2FocusGained(evt);
            }
        });

        txfPunkt2.setText(".");

        txfIP3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfIP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIP3.setText("0");
        txfIP3.setPreferredSize(new java.awt.Dimension(40, 27));
        txfIP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIP3FocusGained(evt);
            }
        });

        txfPunkt3.setText(".");

        txfIP4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfIP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIP4.setText("1");
        txfIP4.setPreferredSize(new java.awt.Dimension(40, 27));
        txfIP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIP4FocusGained(evt);
            }
        });

        lblDPunkt.setText(":");

        lblPort.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblPort.setText("Port:");

        txfPort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfPort.setText("3306");
        txfPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfPortFocusGained(evt);
            }
        });

        lblDBName.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblDBName.setText("DB-Name:");

        txfDBName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDBUser.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblDBUser.setText("DB-Username:");

        txfDBUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDBPass.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblDBPass.setText("DB-Passwort:");

        txpDBPass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txpDBPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txpDBPassFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pnlErweitertLayout = new javax.swing.GroupLayout(pnlErweitert);
        pnlErweitert.setLayout(pnlErweitertLayout);
        pnlErweitertLayout.setHorizontalGroup(
            pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlErweitertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfDBName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfDBUser)
                    .addComponent(txpDBPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlErweitertLayout.createSequentialGroup()
                        .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDBName)
                            .addComponent(lblDBUser)
                            .addComponent(lblDBPass)
                            .addGroup(pnlErweitertLayout.createSequentialGroup()
                                .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHost)
                                    .addGroup(pnlErweitertLayout.createSequentialGroup()
                                        .addComponent(txfIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPunkt1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfPunkt2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfPunkt3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDPunkt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPort))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlErweitertLayout.setVerticalGroup(
            pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlErweitertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHost)
                    .addComponent(lblPort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlErweitertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPunkt1)
                    .addComponent(txfIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPunkt2)
                    .addComponent(txfIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPunkt3)
                    .addComponent(txfIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDPunkt))
                .addGap(18, 18, 18)
                .addComponent(lblDBName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfDBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDBUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfDBUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDBPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txpDBPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblErweitert.setForeground(new java.awt.Color(0, 0, 255));
        lblErweitert.setText("Erweitert ▼");
        lblErweitert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblErweitert.setMaximumSize(new java.awt.Dimension(70, 16));
        lblErweitert.setPreferredSize(new java.awt.Dimension(70, 16));
        lblErweitert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblErweitertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblErweitertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblErweitertMouseExited(evt);
            }
        });

        btnAnmelden.setText("Anmelden");
        btnAnmelden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnmeldenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErweitert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnmelden)
                    .addComponent(lblErweitert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlErweitert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlErweitert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean ausgeklappt;
    private int height;
    private String user, pass, host, port, dbName, dbUser, dbPass;
    
    private void initGUI(){
        //"ausgelagerter" Konstruktor: ausgelagerte Befehle, die im Konstruktor ausgeführt werden sollen
        this.height = 256;
        pnlErweitert.setVisible(false);     //'Erweitert' ist nicht sichtbar, die Größe des Fensters wird entsprechend verkleinert
        this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - height));
        this.pack();
        btnAnmelden.requestFocus();     //der Button 'Anmelden' erhält den Fokus
        
        //globale Variablen werden initialisiert
        this.ausgeklappt = false;
        this.user = "";
        this.host = "";
        this.port = "";
        this.dbName = "";
        this.dbUser = "";
        this.pass = "";
        this.dbPass = "";
    }
    
    private ResultSet rs;
    
    private void btnAnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnmeldenActionPerformed
        
        DB_Verbindung verb;
        
        try {
            if (erweitertAusgefuellt()) {
                verb = new DB_Verbindung(this.host, this.port, this.dbName, this.dbUser, this.dbPass);
            } else {
                verb = new DB_Verbindung();
            }
                       
            verb.verbindungAufbauen();
            
            
            /*
                TEST    DB-Verbindung
             */
//            System.out.format("Verbindung gültig: %s", verb.isVerbindungValid());
//            String abfrage = "SELECT rolle FROM Mitarbeiter WHERE (username = '" + this.user + "' AND passwort = '" + this.pass + "')";
//            //String abfrage = "SELECT rolle FROM Mitarbeiter WHERE (username = 'h.finke' AND passwort = 'flinkerFink')";
//            
//            
//            rs = verb.abfragen(abfrage);
//            rs.next();
//            System.out.format("\nRolle: %d", rs.getInt(1));
//            rs.close();
//            rs = null;
//            
//            verb.verbindungSchliessen();
//            verb = null;
            
            /*
                TEST ENDE
             */
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ein Fehler ist aufgetreten!\nDie Verbindung zur Datenbank \nkonnte nicht hergestellt werden."
                    + "\n\n Bitte überprüfen Sie Ihre Eingaben \noder Ihre Internetverbindung", "Verbindungsfehler", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Ein unbekannter Fehler ist aufgetreten!", "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ein Fehler ist aufgetreten!\nEs dürfen nur Zahlen bei \n'Host-Adresse' bzw. 'Port' \n"
                    + "verwendet werden", "Eingabefehler", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAnmeldenActionPerformed

    private void lblErweitertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErweitertMouseEntered
        //fügt einen Unterstrich hinzu, wenn die Maus das Label berührt
        
        if (ausgeklappt) {
           lblErweitert.setText("<HTML><U>Erweitert ▲</U></HTML>"); 
        } else {
           lblErweitert.setText("<HTML><U>Erweitert ▼</U></HTML>"); 
        }
        
    }//GEN-LAST:event_lblErweitertMouseEntered

    private void lblErweitertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErweitertMouseExited
        //entfernt den Unterstrich, wenn die Maus das Label verlässt
        
        if (ausgeklappt) {
            lblErweitert.setText("Erweitert ▲");
        } else {
            lblErweitert.setText("Erweitert ▼");
        }
 
    }//GEN-LAST:event_lblErweitertMouseExited

    private void lblErweitertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErweitertMouseClicked
        //ändert die Größe des Fensters, wenn auf 'Erweitert' eklickt wird
                
        if (!ausgeklappt) {     //'Erweitert' ist nicht sichtbar
            //'Erweitert' ist wird sichtbar, Fenster wird größer, Pfeil des Labels zeigt nach oben
            pnlErweitert.setVisible(true);
            lblErweitert.setText("<HTML><U>Erweitert ▲</U></HTML>"); 
            this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() + height));
        } else {                //'Erweitert' ist sichtbar
            //'Erweitert' ist wird unsichtbar, Fenster wird kleiner, Pfeil des Labels zeigt nach unten
            pnlErweitert.setVisible(false);
            lblErweitert.setText("<HTML><U>Erweitert ▼</U></HTML>"); 
            this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - height));
        }
        ausgeklappt = !ausgeklappt;
        this.pack();
        
    }//GEN-LAST:event_lblErweitertMouseClicked

    private void txpPasswortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpPasswortFocusGained
        //löscht den Text, wenn das Passwort-Feld den Fokus erhält
        txpPasswort.setText("");
    }//GEN-LAST:event_txpPasswortFocusGained

    private void txpDBPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpDBPassFocusGained
        //löscht den Text, wenn das Passwort-Feld den Fokus erhält
        txpDBPass.setText("");
    }//GEN-LAST:event_txpDBPassFocusGained

    private void txfIP1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIP1FocusGained
        //löscht den Text, wenn das IP-Feld den Fokus erhält
        txfIP1.setText("");
    }//GEN-LAST:event_txfIP1FocusGained

    private void txfIP2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIP2FocusGained
        //löscht den Text, wenn das IP-Feld den Fokus erhält
        txfIP2.setText("");
    }//GEN-LAST:event_txfIP2FocusGained

    private void txfIP3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIP3FocusGained
        //löscht den Text, wenn das IP-Feld den Fokus erhält
        txfIP3.setText("");
    }//GEN-LAST:event_txfIP3FocusGained

    private void txfIP4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIP4FocusGained
        //löscht den Text, wenn das IP-Feld den Fokus erhält
        txfIP4.setText("");
    }//GEN-LAST:event_txfIP4FocusGained

    private void txfPortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfPortFocusGained
        //löscht den Text, wenn das Port-Feld den Fokus erhält
        txfPort.setText("");
    }//GEN-LAST:event_txfPortFocusGained

    private void datenSpeichern() throws NumberFormatException{
        //liest die eingegebenen Daten der Oberfläche ein und speichert diese in den globalen Variablen
        //Konvertierung zu int und dann zu Sttring bewirkt das einfache Abfangen von NumberFormatExceptions
        
        int ip1 = Integer.parseInt(txfIP1.getText());
        int ip2 = Integer.parseInt(txfIP2.getText());
        int ip3 = Integer.parseInt(txfIP3.getText());
        int ip4 = Integer.parseInt(txfIP4.getText());
        this.user = txfBenutzername.getText();
        this.host = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
        this.port = Integer.toString(Integer.parseInt(txfPort.getText()));
        this.dbName = txfDBName.getText();
        this.dbUser = txfDBUser.getText();
        
        for (int i = 0; i < txpPasswort.getPassword().length; i++) {
            pass += txpPasswort.getPassword()[i];
        }
        
        for (int i = 0; i < txpDBPass.getPassword().length; i++) {
            dbPass += txpDBPass.getPassword()[i];
        }
        
    }
    
    private boolean erweitertAusgefuellt() throws NumberFormatException{
        //liefert true zurück, wenn alle Felder der erweiterten Oberfläche ausgefüllt sind
        
        datenSpeichern();

        return (!this.user.equals("") && !this.host.equals("") && !this.port.equals("") && !this.dbName.equals("") && 
                !this.dbUser.equals("") && !this.pass.equals("") && !this.dbPass.equals(""));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnmelden;
    private japhiroto.JPictureBox jpbLogo;
    private javax.swing.JLabel lblBenutzername;
    private javax.swing.JLabel lblDBName;
    private javax.swing.JLabel lblDBPass;
    private javax.swing.JLabel lblDBUser;
    private javax.swing.JLabel lblDPunkt;
    private javax.swing.JLabel lblErweitert;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPasswort;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblPunkt1;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlErweitert;
    private javax.swing.JPanel pnlNormal;
    private javax.swing.JSeparator sep1;
    private javax.swing.JTextField txfBenutzername;
    private javax.swing.JTextField txfDBName;
    private javax.swing.JTextField txfDBUser;
    private javax.swing.JTextField txfIP1;
    private javax.swing.JTextField txfIP2;
    private javax.swing.JTextField txfIP3;
    private javax.swing.JTextField txfIP4;
    private javax.swing.JTextField txfPort;
    private javax.swing.JLabel txfPunkt2;
    private javax.swing.JLabel txfPunkt3;
    private javax.swing.JPasswordField txpDBPass;
    private javax.swing.JPasswordField txpPasswort;
    // End of variables declaration//GEN-END:variables
}
