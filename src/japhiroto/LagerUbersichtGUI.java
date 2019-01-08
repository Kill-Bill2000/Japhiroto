/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class LagerUbersichtGUI extends javax.swing.JFrame {

    /**
     * Creates new form LagerGUI
     */
    public LagerUbersichtGUI() {
        initComponents();
        setProperties();
    }
    private void setProperties(){
        //Position in der Mitte des Bildschirms
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(screenSize.getWidth() - this.getWidth()) / 2, (int)(screenSize.getHeight() - this.getHeight()) / 2);
        
        //IconImage setzen
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Japhiroto_kurz_schwarz_16.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLagerLager = new javax.swing.JLabel();
        lblLagerUbersicht = new javax.swing.JLabel();
        btnLagerArtikelSuchen = new javax.swing.JButton();
        lblLagerBestellungen = new javax.swing.JButton();
        btnArtikelHinzufuegen = new javax.swing.JButton();
        btnBestellung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lager");

        lblLagerLager.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblLagerLager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLagerLager.setText("Lager");

        lblLagerUbersicht.setText("Übersicht");

        btnLagerArtikelSuchen.setText("Lager");
        btnLagerArtikelSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagerArtikelSuchenActionPerformed(evt);
            }
        });

        lblLagerBestellungen.setText("Bestellungen");
        lblLagerBestellungen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLagerBestellungenActionPerformed(evt);
            }
        });

        btnArtikelHinzufuegen.setText("Artikel hinzufügen");
        btnArtikelHinzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtikelHinzufuegenActionPerformed(evt);
            }
        });

        btnBestellung.setText("Bestellung hinzufügen");
        btnBestellung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestellungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLagerLager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLagerUbersicht)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLagerArtikelSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnArtikelHinzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblLagerBestellungen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBestellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLagerLager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLagerUbersicht)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLagerBestellungen)
                    .addComponent(btnLagerArtikelSuchen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArtikelHinzufuegen)
                    .addComponent(btnBestellung))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLagerBestellungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLagerBestellungenActionPerformed
        new LagerBestellungenGUI().setVisible(true);
    }//GEN-LAST:event_lblLagerBestellungenActionPerformed

    private void btnLagerArtikelSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagerArtikelSuchenActionPerformed
        new LagerArtikelSuchen().setVisible(true);
    }//GEN-LAST:event_btnLagerArtikelSuchenActionPerformed

    private void btnArtikelHinzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtikelHinzufuegenActionPerformed
        new LagerHinzufuegenGUI().setVisible(true);
    }//GEN-LAST:event_btnArtikelHinzufuegenActionPerformed

    private void btnBestellungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestellungActionPerformed
        new LagerBestellungHinzufugenGUI().setVisible(true);
    }//GEN-LAST:event_btnBestellungActionPerformed

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
            java.util.logging.Logger.getLogger(LagerUbersichtGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerUbersichtGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerUbersichtGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerUbersichtGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerUbersichtGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtikelHinzufuegen;
    private javax.swing.JButton btnBestellung;
    private javax.swing.JButton btnLagerArtikelSuchen;
    private javax.swing.JButton lblLagerBestellungen;
    private javax.swing.JLabel lblLagerLager;
    private javax.swing.JLabel lblLagerUbersicht;
    // End of variables declaration//GEN-END:variables
}
