/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author philip
 */
public class LagerArtikelSuchen extends javax.swing.JFrame {

    private ArtikelVerwaltung artikel;
    private NoDatabase noDB;
    public LagerArtikelSuchen() {
        initComponents();
        noDB = new NoDatabase();
        diaArtNrEingeben.setSize(450, 150);
        artikel = noDB.getVerwaltung();
        DefaultTableModel model = (DefaultTableModel) tblArtikel.getModel();    //Alle Artikel in der Tabelle anzeigen
        for (int i = 0; i < artikel.anzahlArtikel(); i++) {
            model.addRow(new Object[]{artikel.getArtikelListenNummer(i).getArtikelNummer(), artikel.getArtikelListenNummer(i).getName(), artikel.getArtikelListenNummer(i).getPreis(), artikel.getBestandArtikel(i)});
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

        diaArtNrEingeben = new javax.swing.JDialog();
        lblSucheArtSuche = new javax.swing.JLabel();
        txfSucheArtNr = new javax.swing.JTextField();
        lblSucheArtNr = new javax.swing.JLabel();
        btnSucheSuchen = new javax.swing.JButton();
        lblArtikel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArtikel = new javax.swing.JTable();
        btnNeueSuche = new javax.swing.JButton();
        btnZuruck = new javax.swing.JToggleButton();

        lblSucheArtSuche.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblSucheArtSuche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSucheArtSuche.setText("Artikel suchen");

        lblSucheArtNr.setText("Artikel-Nummer");

        btnSucheSuchen.setText("Artikel suchen");
        btnSucheSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucheSuchenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diaArtNrEingebenLayout = new javax.swing.GroupLayout(diaArtNrEingeben.getContentPane());
        diaArtNrEingeben.getContentPane().setLayout(diaArtNrEingebenLayout);
        diaArtNrEingebenLayout.setHorizontalGroup(
            diaArtNrEingebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaArtNrEingebenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaArtNrEingebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSucheSuchen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaArtNrEingebenLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSucheArtNr)
                        .addGap(18, 18, 18)
                        .addComponent(txfSucheArtNr, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addComponent(lblSucheArtSuche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        diaArtNrEingebenLayout.setVerticalGroup(
            diaArtNrEingebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaArtNrEingebenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSucheArtSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diaArtNrEingebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSucheArtNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSucheArtNr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSucheSuchen)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblArtikel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblArtikel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArtikel.setText("Artikel");

        tblArtikel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Art.-Nr.", "Artikel", "Preis", "Bestand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblArtikel);
        if (tblArtikel.getColumnModel().getColumnCount() > 0) {
            tblArtikel.getColumnModel().getColumn(0).setResizable(false);
        }

        btnNeueSuche.setText("neuen Artikel suchen");
        btnNeueSuche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeueSucheActionPerformed(evt);
            }
        });

        btnZuruck.setText("zurück");
        btnZuruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZuruckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArtikel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNeueSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnZuruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblArtikel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNeueSuche)
                    .addComponent(btnZuruck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSucheSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucheSuchenActionPerformed
        this.setVisible(true);
        diaArtNrEingeben.setVisible(false);         //Fenster werden geöffnet und geschlossen
        
        String gesuchteArtNr = txfSucheArtNr.getText();     //String mit der gesuchenten Artikel Nummer
        
        ArrayList<Artikel> gesuchte = new ArrayList<Artikel>(); //ArrayList zum speichern der gefundenen Artikel
        try {
            gesuchte = artikel.getArtikelListeFromNummer(gesuchteArtNr);    //Suche
        }
        catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Keine Artikel gefunden!");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblArtikel.getModel();
        for (int i = 0; i < gesuchte.size(); i++) {
            model.addRow(new Object[]{gesuchte.get(i).getArtikelNummer(), gesuchte.get(i).getName(), gesuchte.get(i).getPreis()});
        }
    }//GEN-LAST:event_btnSucheSuchenActionPerformed

    private void btnNeueSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeueSucheActionPerformed
        diaArtNrEingeben.setVisible(true);
    }//GEN-LAST:event_btnNeueSucheActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        diaArtNrEingeben.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        diaArtNrEingeben.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    private void btnZuruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZuruckActionPerformed
        this.setVisible(false);
        diaArtNrEingeben.setVisible(false);
    }//GEN-LAST:event_btnZuruckActionPerformed

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
            java.util.logging.Logger.getLogger(LagerArtikelSuchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerArtikelSuchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerArtikelSuchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerArtikelSuchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerArtikelSuchen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNeueSuche;
    private javax.swing.JButton btnSucheSuchen;
    private javax.swing.JToggleButton btnZuruck;
    private javax.swing.JDialog diaArtNrEingeben;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArtikel;
    private javax.swing.JLabel lblSucheArtNr;
    private javax.swing.JLabel lblSucheArtSuche;
    private javax.swing.JTable tblArtikel;
    private javax.swing.JTextField txfSucheArtNr;
    // End of variables declaration//GEN-END:variables
}
