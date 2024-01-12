/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.organizacija;

import controller.ClientController;
import domain.Organizacija;
import domain.Vozilo;
import forms.MainForm;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import models.TableModelVozila;

/**
 *
 * @author Marko Milosevic
 */
public class FormDetaljiOrganizacije extends javax.swing.JDialog {

    private Organizacija o;
    MainForm grandparent;

    public FormDetaljiOrganizacije(JDialog parent, boolean modal, Organizacija o) {
        super(parent, modal);
        initComponents();
        this.o = o;
        lblOrganizacija.setText("OrganizacijaID: " + String.valueOf(o.getOrganizacijaID()));
        txtNaziv.setText(o.getNaziv());
        txtAdresa.setText(o.getAdresa());
        TableModelVozila model = new TableModelVozila(o);
        Thread th = new Thread(model);
        th.start();
        tblVozila.setModel(model);
        grandparent = (MainForm)((FormPretragaOrganizacije)getParent()).getParent();
        
        txtRegistarskiBroj.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnOtkazi = new javax.swing.JButton();
        lblOrganizacija = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        txtAdresa = new javax.swing.JTextField();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRegistarskiBroj = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVozila = new javax.swing.JTable();
        btnObrisi1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalji - organizacija");
        setMinimumSize(new java.awt.Dimension(200, 350));
        setResizable(false);

        btnOtkazi.setText("Otkazi");
        btnOtkazi.setMaximumSize(new java.awt.Dimension(150, 30));
        btnOtkazi.setMinimumSize(new java.awt.Dimension(50, 30));
        btnOtkazi.setPreferredSize(new java.awt.Dimension(140, 30));
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });
        btnOtkazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOtkaziKeyPressed(evt);
            }
        });

        lblOrganizacija.setText("OrganizacijaID");
        lblOrganizacija.setMaximumSize(new java.awt.Dimension(400, 14));
        lblOrganizacija.setMinimumSize(new java.awt.Dimension(100, 14));
        lblOrganizacija.setPreferredSize(new java.awt.Dimension(356, 14));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Naziv:");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 14));

        jLabel3.setText("Adresa:");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 14));

        txtNaziv.setMaximumSize(new java.awt.Dimension(300, 25));
        txtNaziv.setMinimumSize(new java.awt.Dimension(100, 25));
        txtNaziv.setPreferredSize(new java.awt.Dimension(200, 25));
        txtNaziv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNazivFocusGained(evt);
            }
        });
        txtNaziv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNazivKeyPressed(evt);
            }
        });

        txtAdresa.setMaximumSize(new java.awt.Dimension(300, 25));
        txtAdresa.setMinimumSize(new java.awt.Dimension(100, 25));
        txtAdresa.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAdresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdresaFocusGained(evt);
            }
        });
        txtAdresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdresaKeyPressed(evt);
            }
        });

        btnIzmeni.setText("Izmeni");
        btnIzmeni.setMaximumSize(new java.awt.Dimension(200, 50));
        btnIzmeni.setMinimumSize(new java.awt.Dimension(100, 25));
        btnIzmeni.setPreferredSize(new java.awt.Dimension(140, 30));
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });
        btnIzmeni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIzmeniKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        btnObrisi.setText("Obrisi organizaciju");
        btnObrisi.setMaximumSize(new java.awt.Dimension(200, 50));
        btnObrisi.setMinimumSize(new java.awt.Dimension(100, 25));
        btnObrisi.setPreferredSize(new java.awt.Dimension(140, 30));
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });
        btnObrisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnObrisiKeyPressed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Registarski broj:");
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 14));

        jLabel9.setText("Marka:");
        jLabel9.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 14));

        txtRegistarskiBroj.setMaximumSize(new java.awt.Dimension(300, 25));
        txtRegistarskiBroj.setMinimumSize(new java.awt.Dimension(100, 25));
        txtRegistarskiBroj.setPreferredSize(new java.awt.Dimension(200, 25));
        txtRegistarskiBroj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegistarskiBrojFocusGained(evt);
            }
        });
        txtRegistarskiBroj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistarskiBrojActionPerformed(evt);
            }
        });
        txtRegistarskiBroj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegistarskiBrojKeyPressed(evt);
            }
        });

        txtMarka.setMaximumSize(new java.awt.Dimension(300, 25));
        txtMarka.setMinimumSize(new java.awt.Dimension(100, 25));
        txtMarka.setPreferredSize(new java.awt.Dimension(200, 25));
        txtMarka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarkaFocusGained(evt);
            }
        });
        txtMarka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarkaKeyPressed(evt);
            }
        });

        btnDodaj.setText("Dodaj novo vozilo");
        btnDodaj.setMaximumSize(new java.awt.Dimension(300, 30));
        btnDodaj.setMinimumSize(new java.awt.Dimension(50, 30));
        btnDodaj.setPreferredSize(new java.awt.Dimension(140, 30));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });
        btnDodaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDodajKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Vozila organizacije:");
        jLabel10.setMaximumSize(new java.awt.Dimension(400, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(356, 20));

        tblVozila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVozila.setMaximumSize(new java.awt.Dimension(400, 200));
        tblVozila.setMinimumSize(new java.awt.Dimension(100, 50));
        tblVozila.setPreferredSize(new java.awt.Dimension(356, 150));
        tblVozila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblVozilaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVozila);

        btnObrisi1.setText("Obrisi postojece vozilo");
        btnObrisi1.setMaximumSize(new java.awt.Dimension(200, 30));
        btnObrisi1.setMinimumSize(new java.awt.Dimension(50, 30));
        btnObrisi1.setPreferredSize(new java.awt.Dimension(140, 30));
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });
        btnObrisi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnObrisi1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnObrisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOrganizacija, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblOrganizacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        izmeniOrganizaciju();

    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        obrisiOrganizaciju();

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
        obrisiVozilo();
        tblVozila.requestFocusInWindow();
    }//GEN-LAST:event_btnObrisi1ActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        dodajVozilo();
        txtRegistarskiBroj.requestFocusInWindow();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtNazivKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNazivKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAdresa.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtNazivKeyPressed

    private void txtAdresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdresaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRegistarskiBroj.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtAdresaKeyPressed

    private void txtRegistarskiBrojKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistarskiBrojKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarka.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtRegistarskiBrojKeyPressed

    private void txtMarkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarkaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDodaj.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtMarkaKeyPressed

    private void btnDodajKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDodajKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dodajVozilo();
        }
    }//GEN-LAST:event_btnDodajKeyPressed

    private void btnObrisi1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnObrisi1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            obrisiVozilo();
            tblVozila.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnObrisi1KeyPressed

    private void btnOtkaziKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOtkaziKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispose();
        }
    }//GEN-LAST:event_btnOtkaziKeyPressed

    private void btnObrisiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnObrisiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            obrisiOrganizaciju();
        }
    }//GEN-LAST:event_btnObrisiKeyPressed

    private void btnIzmeniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIzmeniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            izmeniOrganizaciju();
        }
    }//GEN-LAST:event_btnIzmeniKeyPressed

    private void txtNazivFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNazivFocusGained
        txtNaziv.selectAll();
    }//GEN-LAST:event_txtNazivFocusGained

    private void txtAdresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdresaFocusGained
        txtAdresa.selectAll();
    }//GEN-LAST:event_txtAdresaFocusGained

    private void txtRegistarskiBrojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegistarskiBrojFocusGained
        txtRegistarskiBroj.selectAll();
    }//GEN-LAST:event_txtRegistarskiBrojFocusGained

    private void txtMarkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarkaFocusGained
        txtMarka.selectAll();
    }//GEN-LAST:event_txtMarkaFocusGained

    private void tblVozilaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVozilaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int selectedRow = tblVozila.getSelectedRow();
            btnObrisi1.requestFocusInWindow();
            if (selectedRow > 0) {
                tblVozila.setRowSelectionInterval(selectedRow - 1, selectedRow - 1);
            }
        }
    }//GEN-LAST:event_tblVozilaKeyPressed

    private void txtRegistarskiBrojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistarskiBrojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistarskiBrojActionPerformed

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
            java.util.logging.Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrganizacija;
    private javax.swing.JTable tblVozila;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRegistarskiBroj;
    // End of variables declaration//GEN-END:variables

    private void dodajVozilo() {
        try {
            if (txtRegistarskiBroj.getText().isEmpty() || txtMarka.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Polja registarski broj i marka moraju biti popunjena!");
                if (txtMarka.getText().isEmpty()) {
                    txtMarka.requestFocusInWindow();
                    txtMarka.selectAll();
                }
                if (txtRegistarskiBroj.getText().isEmpty()) {
                    txtRegistarskiBroj.requestFocusInWindow();
                    txtRegistarskiBroj.selectAll();
                }
                return;
            }

            String registarskiBroj = txtRegistarskiBroj.getText();
            
            if (!Pattern.matches("[A-Z]{2}\\-[0-9]{3,4}\\-[A-Z]{2}", registarskiBroj)) {
                JOptionPane.showMessageDialog(rootPane, "Registarska oznaka mora biti u formatu: \"AB-123-AB\" ili \"AB-1234-AB\"!");
                return;
            }
            
            String marka = txtMarka.getText();

            Vozilo v = new Vozilo(o, registarskiBroj, marka);

            ArrayList<Vozilo> svaVozila = ClientController.getInstance().getAllVozilo();

            for (Vozilo vozilo : svaVozila) {
                if (vozilo.getRegistarskiBroj().equals(registarskiBroj)) {
                    JOptionPane.showMessageDialog(this, "Vec postoji vozilo sa tim registarskim brojem!");
                    return;
                }
            }

            ClientController.getInstance().addVozilo(v);
            TableModelVozila model = (TableModelVozila) tblVozila.getModel();
            model.refreshTable();
            JOptionPane.showMessageDialog(this, "Uspesno dodato vozilo za organizaciju!");

        } catch (Exception ex) {
            Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void obrisiVozilo() {
        int selectedRow = tblVozila.getSelectedRow();
        TableModelVozila model = (TableModelVozila) tblVozila.getModel();

        if (model.getRowCount() == 1) {
            JOptionPane.showMessageDialog(rootPane, "Organizacija mora imati bar jedno vozilo!");
            txtNaziv.requestFocusInWindow();
            txtNaziv.selectAll();
            return;
        }
        
        if (selectedRow >= 0) {

            try {

                Vozilo v = model.getSelectedVozilo(selectedRow);
                ClientController.getInstance().deleteVozilo(v);
                model.refreshTable();
                JOptionPane.showMessageDialog(this, "Uspesno obrisano vozilo za organizaciju!");

            } catch (Exception ex) {
                Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else{
            JOptionPane.showMessageDialog(rootPane, "Organizacija nema vozila u bazi! Izbrisati organizaciju.");
            txtRegistarskiBroj.requestFocusInWindow();
            txtRegistarskiBroj.selectAll();
        }
    }

    private void obrisiOrganizaciju() {
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da "
                + "obrisete ovu organizaciju?", "Konfirmacija", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.NO_OPTION) {
            return;
        }

        if (result == JOptionPane.YES_OPTION) {
            try {
                TableModelVozila model = (TableModelVozila) tblVozila.getModel();
                o.setVozila(model.getLista());
                ClientController.getInstance().deleteOrganizacija(o);
                FormPretragaOrganizacije form = (FormPretragaOrganizacije) getParent();
                form.refreshTable();
                JOptionPane.showMessageDialog(this, "Uspesno obrisana organizacija!");
                
                grandparent.azurirajOrganizacije();
                
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ne mozete da obrisete ovu organizaciju!");
//                Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void izmeniOrganizaciju() {
        if (txtNaziv.getText().isEmpty() || txtAdresa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Polja naziv i adresa moraju biti popunjena!");
            return;
        }

        String naziv = txtNaziv.getText();
        String adresa = txtAdresa.getText();

        o.setNaziv(naziv);
        o.setAdresa(adresa);

        try {
            ClientController.getInstance().editOrganizacija(o);
            FormPretragaOrganizacije form = (FormPretragaOrganizacije) getParent();
            form.refreshTable();
            JOptionPane.showMessageDialog(this, "Uspesno izmenjena organizacija.");
            
            grandparent.azurirajOrganizacije();
            
        } catch (Exception ex) {
            Logger.getLogger(FormDetaljiOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
