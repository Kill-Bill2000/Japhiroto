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
import javax.swing.JOptionPane;

/**
 *
 * @author robin
 */
public class LagerHinzufuegenGUI extends javax.swing.JFrame {

    private LagerVerwaltung verwaltung;
    
    /**
     * Creates new form LagerHinzufuegenGUI
     */
    public LagerHinzufuegenGUI() {
        try {
            initComponents();
            setProperties();
            verwaltung = new LagerVerwaltung();
        } catch (IOException ex) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Ein Fehler ist aufgetreten.", "Fehler", JOptionPane.ERROR_MESSAGE);
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
        btnZurueck = new javax.swing.JButton();
        txfNummer = new javax.swing.JTextField();
        lblNummer = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txfPreisEuro = new javax.swing.JTextField();
        lblPreis = new javax.swing.JLabel();
        txfBestand = new javax.swing.JTextField();
        lblBestand = new javax.swing.JLabel();
        lblEuro = new javax.swing.JLabel();
        btnHinzufuegen = new javax.swing.JButton();
        txfPreisCent = new javax.swing.JTextField();
        lblEuro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artikel hinzufügen");
        setResizable(false);

        lblUeberschrift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUeberschrift.setText("Artikel hinzufügen");

        btnZurueck.setText("zurück");
        btnZurueck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZurueckActionPerformed(evt);
            }
        });

        lblNummer.setText("Artikelnummer:");

        lblName.setText("Artikelname:");

        txfPreisEuro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblPreis.setText("Preis:");

        lblBestand.setText("Bestand:");

        lblEuro.setText("€");

        btnHinzufuegen.setText("Artikel hinzufügen");
        btnHinzufuegen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHinzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHinzufuegenActionPerformed(evt);
            }
        });

        txfPreisCent.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblEuro1.setText(",");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNummer)
                                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txfNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblUeberschrift)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txfPreisEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEuro1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfPreisCent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEuro))
                                    .addComponent(lblPreis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBestand)
                                        .addGap(31, 31, 31))
                                    .addComponent(txfBestand)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHinzufuegen)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUeberschrift)
                .addGap(27, 27, 27)
                .addComponent(lblNummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreis)
                    .addComponent(lblBestand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPreisEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEuro)
                    .addComponent(txfBestand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEuro1)
                    .addComponent(txfPreisCent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHinzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnZurueck)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZurueckActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnZurueckActionPerformed

    private void btnHinzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHinzufuegenActionPerformed
        Artikel art;
        Double preis;
        
        try {
            
            preis = Double.parseDouble(txfPreisEuro.getText()) + Double.parseDouble(txfPreisCent.getText()) / 100.0;
            
            art = new Artikel(txfName.getText(), preis, txfNummer.getText(), Integer.parseInt(txfBestand.getText()));
            
            verwaltung.verbindungAufbauen();
            
            verwaltung.artikelHinzufuegen(art);

            verwaltung.verbindungSchliessen();
            
            JOptionPane.showMessageDialog(this, "Der Artikel wurde hinzugefügt.", "Artikel hinzugefügt", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Fehler bei der kommunikation mit der Datenbank.", "DB-Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Keinen gültigen Wert eingegeben", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        
        txfName.setText("");
        txfNummer.setText("");
        txfPreisEuro.setText("");
        txfPreisCent.setText("");
        txfBestand.setText("");
        
    }//GEN-LAST:event_btnHinzufuegenActionPerformed

    private void setProperties(){
        //Position in der Mitte des Bildschirms
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(screenSize.getWidth() - this.getWidth()) / 2, (int)(screenSize.getHeight() - this.getHeight()) / 2);
        
        //IconImage setzen
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Japhiroto_kurz_schwarz_16.png")));
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
            java.util.logging.Logger.getLogger(LagerHinzufuegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerHinzufuegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerHinzufuegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerHinzufuegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerHinzufuegenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHinzufuegen;
    private javax.swing.JButton btnZurueck;
    private javax.swing.JLabel lblBestand;
    private javax.swing.JLabel lblEuro;
    private javax.swing.JLabel lblEuro1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNummer;
    private javax.swing.JLabel lblPreis;
    private javax.swing.JLabel lblUeberschrift;
    private javax.swing.JTextField txfBestand;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfNummer;
    private javax.swing.JTextField txfPreisCent;
    private javax.swing.JTextField txfPreisEuro;
    // End of variables declaration//GEN-END:variables
}
