/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author robin
 */
public class MitarbeiterAnlegen_GUI extends javax.swing.JFrame {

    private MitarbeiterAnlegen mitarbAnlegen;
    
    /**
     * Creates new form MitarbeiterAnlegen_GUI
     */
    public MitarbeiterAnlegen_GUI() {
        initComponents();
        setProperties();
        
        try {
            mitarbAnlegen = new MitarbeiterAnlegen();
        } catch (IOException ex) {
            getToolkit().beep();    //Fehler-Ton
            JOptionPane.showMessageDialog(this, "Ein unbekannter Fehler ist aufgetreten.", "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            getToolkit().beep();    //Fehler-Ton
            JOptionPane.showMessageDialog(this, "Die Verbindung zur Datenbank \nkonnte nicht hergestellt werden.", "Verbindungsfehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUeberschrift = new javax.swing.JLabel();
        lblAnrede = new javax.swing.JLabel();
        lblVorname = new javax.swing.JLabel();
        lblNachname = new javax.swing.JLabel();
        lblKomma = new javax.swing.JLabel();
        lblEuro = new javax.swing.JLabel();
        lblStrasse = new javax.swing.JLabel();
        lblHnr = new javax.swing.JLabel();
        lblPlz = new javax.swing.JLabel();
        lblOrt = new javax.swing.JLabel();
        lblLohn = new javax.swing.JLabel();
        cbbAnrede = new javax.swing.JComboBox<>();
        txfVorname = new javax.swing.JTextField();
        txfNachname = new javax.swing.JTextField();
        txfStrasse = new javax.swing.JTextField();
        txfHausnr = new javax.swing.JTextField();
        txfPLZ = new javax.swing.JTextField();
        txfOrt = new javax.swing.JTextField();
        txfLohnEuro = new javax.swing.JTextField();
        txfLohnCent = new javax.swing.JTextField();
        btnAnlegen = new javax.swing.JButton();
        btnZurueck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mitarbeiter anlegen");
        setResizable(false);

        lblUeberschrift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUeberschrift.setText("Mitarbeiter anlegen");

        lblAnrede.setText("Anrede:");

        lblVorname.setText("Vorname:");

        lblNachname.setText("Nachname:");

        lblKomma.setText(",");

        lblEuro.setText("€");

        lblStrasse.setText("Straße:");

        lblHnr.setText("Hausnummer:");

        lblPlz.setText("PLZ:");

        lblOrt.setText("Ort:");

        lblLohn.setText("Stundenlohn:");

        cbbAnrede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herr", "Frau", "Divers" }));

        txfLohnEuro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAnlegen.setText("Mitarbeiter anlegen");
        btnAnlegen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnlegenActionPerformed(evt);
            }
        });

        btnZurueck.setText("zurück");
        btnZurueck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZurueckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblUeberschrift))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVorname)
                                    .addComponent(lblNachname)
                                    .addComponent(lblAnrede)
                                    .addComponent(lblStrasse)
                                    .addComponent(lblHnr)
                                    .addComponent(lblPlz)
                                    .addComponent(lblOrt)
                                    .addComponent(lblLohn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbbAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfNachname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txfVorname)
                                        .addComponent(txfStrasse, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txfOrt)
                                        .addComponent(txfHausnr, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(txfPLZ))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txfLohnEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblKomma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfLohnCent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEuro))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAnlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUeberschrift)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnrede)
                    .addComponent(cbbAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVorname)
                    .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNachname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfStrasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStrasse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfHausnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHnr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfLohnEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKomma)
                    .addComponent(txfLohnCent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEuro)
                    .addComponent(lblLohn))
                .addGap(18, 18, 18)
                .addComponent(btnAnlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnZurueck)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZurueckActionPerformed
        try {
            mitarbAnlegen.verbindungSchliessen();
        } catch (SQLException ex) {
            Logger.getLogger(MitarbeiterAnlegen_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnZurueckActionPerformed

    private void btnAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnlegenActionPerformed
        Mitarbeiter marb;
        double lohn;
        
        try {
            marb = new Mitarbeiter();
            
            lohn = Double.parseDouble(txfLohnEuro.getText()) + Double.parseDouble(txfLohnCent.getText()) / 100.0;
            System.out.println(cbbAnrede.getSelectedIndex());
            switch (cbbAnrede.getSelectedIndex()) {
                case 1:
                    marb.setAnrede("Frau");
                    break;
                case 2:
                    marb.setAnrede("Dive");
                    break;
                default:
                    marb.setAnrede("Herr");
                    break;
            }
            marb.setVorname(txfVorname.getText());
            marb.setNachname(txfNachname.getText());
            marb.setStrasse(txfStrasse.getText());
            marb.setHausNr(Integer.parseInt(txfHausnr.getText()));
            marb.setPlz(Integer.parseInt(txfPLZ.getText()));
            marb.setOrt(txfOrt.getText());
            marb.setStundenLohn(lohn);
            
            mitarbAnlegen.mitarbeiterAnlegen(marb);
            
            JOptionPane.showMessageDialog(this, "Mitarbeiter erfolgreich hinzugefügt.", "Erfolg", JOptionPane.INFORMATION_MESSAGE);
            
            txfVorname.setText("");
            txfNachname.setText("");
            txfStrasse.setText("");
            txfHausnr.setText("");
            txfPLZ.setText("");
            txfOrt.setText("");
            txfLohnEuro.setText("");
            txfLohnCent.setText("");
            
        } catch (SQLException ex) {
            getToolkit().beep();    //Fehler-Ton
            JOptionPane.showMessageDialog(this, "Die Verbindung zur Datenbank \nkonnte nicht hergestellt werden.", "Verbindungsfehler", JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException ex){
            getToolkit().beep();    //Fehler-Ton
            JOptionPane.showMessageDialog(this, "Falscher Wert für 'Hausnummer', 'PLZ' oder 'Lohn' eingegeben", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnAnlegenActionPerformed

    private void setProperties(){
        //Position in der Mitte des Bildschirms
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(screenSize.getWidth() - this.getWidth()) / 2, (int)(screenSize.getHeight() - this.getHeight()) / 2);
        
        //IconImage setzen
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Japhiroto_kurz_schwarz_16.png")));
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
            java.util.logging.Logger.getLogger(MitarbeiterAnlegen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterAnlegen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterAnlegen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterAnlegen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MitarbeiterAnlegen_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnlegen;
    private javax.swing.JButton btnZurueck;
    private javax.swing.JComboBox<String> cbbAnrede;
    private javax.swing.JLabel lblAnrede;
    private javax.swing.JLabel lblEuro;
    private javax.swing.JLabel lblHnr;
    private javax.swing.JLabel lblKomma;
    private javax.swing.JLabel lblLohn;
    private javax.swing.JLabel lblNachname;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPlz;
    private javax.swing.JLabel lblStrasse;
    private javax.swing.JLabel lblUeberschrift;
    private javax.swing.JLabel lblVorname;
    private javax.swing.JTextField txfHausnr;
    private javax.swing.JTextField txfLohnCent;
    private javax.swing.JTextField txfLohnEuro;
    private javax.swing.JTextField txfNachname;
    private javax.swing.JTextField txfOrt;
    private javax.swing.JTextField txfPLZ;
    private javax.swing.JTextField txfStrasse;
    private javax.swing.JTextField txfVorname;
    // End of variables declaration//GEN-END:variables
}
