/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Graphics2D;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas.hrubec
 */
public class Marktleiter_GUI extends javax.swing.JFrame {
    
    private Graphics2D diagram;
    private int sizeX; // =500
    private int sizeY; // =400
    private int zeroX = sizeX;
    private int zeroY = sizeY;
    
    private DB_Verbindung database;
          
    /**
     * Creates new form Marktleiter_GUI
     * @throws java.io.IOException
     */
    public Marktleiter_GUI() throws IOException {
        initComponents();
        
        diagram = (Graphics2D)cvDrawField.getGraphics();
        sizeX = cvDrawField.getWidth();
        sizeY = cvDrawField.getHeight();
                        
        //set zero
        // sizeX = 500, sizeY = 400
        // zeroX = 25;
        // zeroY = 370;
               
        zeroX = sizeX - 475;
        zeroY = sizeY - 30;
        
        
        try {
            database = new DB_Verbindung();
            database.verbindungAufbauen();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Could not establish connection to the database", "Error", JOptionPane.INFORMATION_MESSAGE);
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

        jSeparator1 = new javax.swing.JSeparator();
        lblUmsatz = new javax.swing.JLabel();
        lblMitarbeiter = new javax.swing.JLabel();
        lblAuswahl = new javax.swing.JLabel();
        scrlPanAuswahl = new javax.swing.JScrollPane();
        jListEmployees = new javax.swing.JList<>();
        txfMitarbeiterID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblVorname = new javax.swing.JLabel();
        txfVorname = new javax.swing.JTextField();
        txfNachname = new javax.swing.JTextField();
        lblNachname = new javax.swing.JLabel();
        ComBoxDateUntil = new javax.swing.JComboBox<>();
        lblDatumauswahl = new javax.swing.JLabel();
        lblDatumVon = new javax.swing.JLabel();
        lblDatumBis = new javax.swing.JLabel();
        ComBoxDateFrom = new javax.swing.JComboBox<>();
        btnShowSales = new javax.swing.JButton();
        btnWarehouseList = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        lblStatusBestellungen = new javax.swing.JLabel();
        txfBestellt = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        lblBestellt = new javax.swing.JLabel();
        txfVerschickt = new javax.swing.JTextField();
        lblVerschickt = new javax.swing.JLabel();
        txfInBearb = new javax.swing.JTextField();
        lblInBearb = new javax.swing.JLabel();
        lblAnrede = new javax.swing.JLabel();
        txfAnrede = new javax.swing.JTextField();
        txfStrasse = new javax.swing.JTextField();
        lblStarsse = new javax.swing.JLabel();
        txfHausNr = new javax.swing.JTextField();
        lblHausNr = new javax.swing.JLabel();
        txfPLZ = new javax.swing.JTextField();
        lblPLZ = new javax.swing.JLabel();
        txfOrt = new javax.swing.JTextField();
        lblOrt = new javax.swing.JLabel();
        txfStundenlohn = new javax.swing.JTextField();
        lblStundenlohn = new javax.swing.JLabel();
        cvDrawField = new java.awt.Canvas();
        btnLoadList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblUmsatz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUmsatz.setText("Umsatz- und Warenverwaltung");

        lblMitarbeiter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMitarbeiter.setText("Mitarbeiterverwaltung");

        lblAuswahl.setText("Auswahl");

        jListEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListEmployeesMouseClicked(evt);
            }
        });
        scrlPanAuswahl.setViewportView(jListEmployees);

        txfMitarbeiterID.setEditable(false);

        lblID.setText("Mitarbeiter ID");

        lblVorname.setText("Vorname");

        txfVorname.setEditable(false);

        txfNachname.setEditable(false);

        lblNachname.setText("Nachname");

        ComBoxDateUntil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDatumauswahl.setText("Datumauswahl");

        lblDatumVon.setText("Von:");

        lblDatumBis.setText("Bis:");

        ComBoxDateFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComBoxDateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxDateFromActionPerformed(evt);
            }
        });

        btnShowSales.setText("Umsatz Anzeigen");
        btnShowSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSalesActionPerformed(evt);
            }
        });

        btnWarehouseList.setText("Lager Anzeigen");
        btnWarehouseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseListActionPerformed(evt);
            }
        });

        btnOrders.setText("Bestellungen Anzeigen");
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        lblStatusBestellungen.setText("Status offener Bestellungen:");

        txfBestellt.setEditable(false);
        txfBestellt.setText("Anzahl");

        btnPrint.setText("<html>  Aktuelle<br />Darstellung<br />  Drucken</html>");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblBestellt.setText("Bestellt:");

        txfVerschickt.setEditable(false);
        txfVerschickt.setText("Anzahl");
        txfVerschickt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfVerschicktActionPerformed(evt);
            }
        });

        lblVerschickt.setText("Verschickt:");

        txfInBearb.setEditable(false);
        txfInBearb.setText("Anzahl");
        txfInBearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfInBearbActionPerformed(evt);
            }
        });

        lblInBearb.setText("In Bearbeitung:");

        lblAnrede.setText("Anrede");

        txfAnrede.setEditable(false);

        txfStrasse.setEditable(false);

        lblStarsse.setText("Strasse");

        txfHausNr.setEditable(false);

        lblHausNr.setText("Haus Nr.");

        txfPLZ.setEditable(false);

        lblPLZ.setText("PLZ");

        txfOrt.setEditable(false);

        lblOrt.setText("Ort");

        txfStundenlohn.setEditable(false);

        lblStundenlohn.setText("Stundenlohn");

        cvDrawField.setBackground(new java.awt.Color(255, 255, 255));

        btnLoadList.setText("Liste Laden");
        btnLoadList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMitarbeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrlPanAuswahl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAuswahl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoadList, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txfMitarbeiterID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(lblAnrede))
                            .addComponent(lblStarsse)
                            .addComponent(txfStrasse))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHausNr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfHausNr, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPLZ)
                                    .addComponent(txfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblVorname)
                            .addComponent(txfVorname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNachname)
                                    .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStundenlohn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfStundenlohn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblOrt)
                            .addComponent(txfOrt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblStatusBestellungen)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblBestellt)
                                                    .addComponent(lblVerschickt)
                                                    .addComponent(lblInBearb))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txfBestellt)
                                                    .addComponent(txfVerschickt)
                                                    .addComponent(txfInBearb)))))
                                    .addComponent(btnOrders, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWarehouseList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShowSales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComBoxDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDatumauswahl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblDatumVon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDatumBis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComBoxDateUntil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lblUmsatz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvDrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUmsatz)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShowSales)
                                    .addComponent(lblDatumauswahl))
                                .addGap(20, 20, 20)
                                .addComponent(btnWarehouseList)
                                .addGap(20, 20, 20)
                                .addComponent(btnOrders))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDatumVon)
                                    .addGap(73, 73, 73))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ComBoxDateUntil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(ComBoxDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(lblDatumBis))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblStatusBestellungen)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBestellt)
                            .addComponent(txfBestellt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfVerschickt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVerschickt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfInBearb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInBearb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cvDrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMitarbeiter)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoadList)
                            .addComponent(lblAuswahl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrlPanAuswahl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVorname)
                                    .addComponent(lblAnrede)
                                    .addComponent(lblID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfMitarbeiterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNachname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStundenlohn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txfStundenlohn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStarsse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfStrasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHausNr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfHausNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPLZ))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfPLZ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComBoxDateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxDateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBoxDateFromActionPerformed

    private void btnWarehouseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseListActionPerformed
        // TODO add your handling code here:
        new LagerArtikelSuchen().setVisible(true);
    }//GEN-LAST:event_btnWarehouseListActionPerformed

    private void txfVerschicktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfVerschicktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfVerschicktActionPerformed

    private void txfInBearbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfInBearbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfInBearbActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        new LagerBestellungenGUI().setVisible(true);     
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnShowSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSalesActionPerformed
        // TODO add your handling code here:
        drawSales();
    }//GEN-LAST:event_btnShowSalesActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnLoadListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadListActionPerformed
        // TODO add your handling code here:             
        DefaultListModel list = new DefaultListModel();
        jListEmployees.setModel(list);    
        
//      TEST:        
//        list.addElement("Liste Aller Mitarbeiter: ");

        ArrayList<Mitarbeiter> employeesArrList= new ArrayList<>();
               
        try {
            employeesArrList = database.getAllEmployeesArrayList();
        } catch (SQLException ex) {
            Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at: database.getAllEmployeesArray() " 
                    + "\n LocalizedMessage:  " + ex.getLocalizedMessage() + "\n Message: " + ex.getMessage() 
                    + "\n String: " + ex.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        for (int i = 0; i < employeesArrList.size(); i++) {
            list.addElement( employeesArrList.get(i).getAnrede() + " " +  employeesArrList.get(i).getVorname() + " " +  employeesArrList.get(i).getNachname());
        }         
    }//GEN-LAST:event_btnLoadListActionPerformed

    private void jListEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListEmployeesMouseClicked
        // fills the selected employee data in corresponding fields
        
        String selected = jListEmployees.getSelectedValue();
                        
        String[] parts = selected.split(" ");
        String name = parts[1];
        String surname = parts[2];
        
//// TEST:
//        System.out.println(selected);
//        System.out.println(name);
//        System.out.println(surname);        
        
        try {        
            txfMitarbeiterID.setText(Integer.toString(database.getEmployeeData(name, surname).getMitarbeiterId()));
            txfAnrede.setText(database.getEmployeeData(name, surname).getAnrede());
            txfVorname.setText(database.getEmployeeData(name, surname).getVorname());
            txfNachname.setText(database.getEmployeeData(name, surname).getNachname());
            txfStrasse.setText(database.getEmployeeData(name, surname).getStrasse());
            txfHausNr.setText(Integer.toString(database.getEmployeeData(name, surname).getHausNr()));
            txfPLZ.setText(Integer.toString(database.getEmployeeData(name, surname).getPlz()));
            txfOrt.setText(database.getEmployeeData(name, surname).getOrt());
            txfStundenlohn.setText(Double.toString(database.getEmployeeData(name, surname).getStundenLohn()));
        } catch (SQLException ex) {
            Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at: database.getEmployeeData() " 
                    + "\n LocalizedMessage:  " + ex.getLocalizedMessage() + "\n Message: " + ex.getMessage() 
                    + "\n String: " + ex.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }       
        


    }//GEN-LAST:event_jListEmployeesMouseClicked

    
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
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Marktleiter_GUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void drawBasicGraph(){  
        //testline
//        diagram.drawLine(zeroX, zeroY, sizeX, 0);    
                
        // draw axes        
        diagram.drawLine(zeroX - 10, zeroY, sizeX - 15, zeroY);
        diagram.drawLine(zeroX, sizeY - 385, zeroX, sizeY - 15);
        
        
        // draw scale 
        // X-axis
        for (int i = 1; i < sizeX/20 - 2; i++) {
            diagram.drawLine(zeroX + i*20, zeroY - 5, zeroX + i*20, zeroY + 5);
            diagram.drawString(""+i, zeroX + i*20 - 3, zeroY + 20);            
        }
        
        // Y-axis
        for (int i = 1; i < sizeY/20 - 2; i++) {
            diagram.drawLine(zeroX - 5, zeroY - i*20, zeroX + 5, zeroY - i*20);
            diagram.drawString(""+i, zeroX - 20, zeroY - i*20 + 5);
        }

    }
    
        private void drawSales(){  
        //testline
//        diagram.drawLine(zeroX, zeroY, sizeX, 0);

        // draw axes  
        diagram.drawLine(zeroX - 10, zeroY, sizeX - 15, zeroY);
        diagram.drawLine(zeroX, sizeY - 385, zeroX, sizeY - 15);
        
//        String selectedFrom = ComBoxDateFrom.getSelectedItem().toString();
//        String selectedUntil = ComBoxDateUntil.getSelectedItem().toString();            
        String selectedFrom = "15.09.2018";
        String selectedUntil = "20.09.2018"; 
        
        String[] parts1 = selectedFrom.split("\\.");
        String dayFrom = parts1[0];
        String monthFrom = parts1[1];
        String yearFrom = parts1[2];
        
        String[] parts2 = selectedUntil.split("\\.");
        String dayUntil = parts2[0];
        String monthUntil = parts2[1];
        String yearUntil = parts2[2];        
        
        //TEST:
//        System.out.println(dayFrom);
//        System.out.println(monthFrom);
//        System.out.println(yearFrom);
//
//        System.out.println(dayUntil);
//        System.out.println(monthUntil);
//        System.out.println(yearUntil);       
              
        int differenceDay = Integer.valueOf(dayUntil) - Integer.valueOf(dayFrom);
        int differenceMonth = Integer.valueOf(monthUntil) - Integer.valueOf(monthFrom);
                
        //TEST:
        System.out.println(differenceDay);
        System.out.println(differenceMonth);

        
        // draw scale 
        // X-axis
        for (int i = 1; i < sizeX/20 - 2; i++) {
            diagram.drawLine(zeroX + i*20, zeroY - 5, zeroX + i*20, zeroY + 5);
            diagram.drawString(""+i, zeroX + i*20 - 3, zeroY + 20);            
        }
        
        // Y-axis
        for (int i = 1; i < sizeY/20 - 2; i++) {
            diagram.drawLine(zeroX - 5, zeroY - i*20, zeroX + 5, zeroY - i*20);
            diagram.drawString(""+i, zeroX - 20, zeroY - i*20 + 5);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBoxDateFrom;
    private javax.swing.JComboBox<String> ComBoxDateUntil;
    private javax.swing.JButton btnLoadList;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnShowSales;
    private javax.swing.JButton btnWarehouseList;
    private java.awt.Canvas cvDrawField;
    private javax.swing.JList<String> jListEmployees;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnrede;
    private javax.swing.JLabel lblAuswahl;
    private javax.swing.JLabel lblBestellt;
    private javax.swing.JLabel lblDatumBis;
    private javax.swing.JLabel lblDatumVon;
    private javax.swing.JLabel lblDatumauswahl;
    private javax.swing.JLabel lblHausNr;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInBearb;
    private javax.swing.JLabel lblMitarbeiter;
    private javax.swing.JLabel lblNachname;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPLZ;
    private javax.swing.JLabel lblStarsse;
    private javax.swing.JLabel lblStatusBestellungen;
    private javax.swing.JLabel lblStundenlohn;
    private javax.swing.JLabel lblUmsatz;
    private javax.swing.JLabel lblVerschickt;
    private javax.swing.JLabel lblVorname;
    private javax.swing.JScrollPane scrlPanAuswahl;
    private javax.swing.JTextField txfAnrede;
    private javax.swing.JTextField txfBestellt;
    private javax.swing.JTextField txfHausNr;
    private javax.swing.JTextField txfInBearb;
    private javax.swing.JTextField txfMitarbeiterID;
    private javax.swing.JTextField txfNachname;
    private javax.swing.JTextField txfOrt;
    private javax.swing.JTextField txfPLZ;
    private javax.swing.JTextField txfStrasse;
    private javax.swing.JTextField txfStundenlohn;
    private javax.swing.JTextField txfVerschickt;
    private javax.swing.JTextField txfVorname;
    // End of variables declaration//GEN-END:variables
}
