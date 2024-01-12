/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.organizacija;

import controller.ClientController;
import domain.Organizacija;
import domain.Parkiraliste;
import domain.Vozilo;
import forms.MainForm;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import models.TableModelNovaVozila;

/**
 *
 * @author 38160
 */
public class FormNovaOrganizacija extends javax.swing.JDialog {

    public FormNovaOrganizacija(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblVozila.setModel(new TableModelNovaVozila());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAdresa = new javax.swing.JTextField();
        btnOtkazi = new javax.swing.JButton();
        btnDodajOrg = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRegistarskiBroj = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVozila = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova organizacija");
        setResizable(false);

        jLabel2.setText("Naziv:");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 14));

        jLabel3.setText("Adresa:");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 14));

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

        btnOtkazi.setText("Otkazi");
        btnOtkazi.setMaximumSize(new java.awt.Dimension(200, 30));
        btnOtkazi.setMinimumSize(new java.awt.Dimension(100, 30));
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

        btnDodajOrg.setText("Dodaj organizaciju");
        btnDodajOrg.setMaximumSize(new java.awt.Dimension(200, 30));
        btnDodajOrg.setMinimumSize(new java.awt.Dimension(100, 30));
        btnDodajOrg.setPreferredSize(new java.awt.Dimension(140, 30));
        btnDodajOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajOrgActionPerformed(evt);
            }
        });
        btnDodajOrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDodajOrgKeyPressed(evt);
            }
        });

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

        btnDodaj.setText("Dodaj vozilo");
        btnDodaj.setMaximumSize(new java.awt.Dimension(200, 30));
        btnDodaj.setMinimumSize(new java.awt.Dimension(100, 30));
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

        btnObrisi.setText("Obrisi vozilo");
        btnObrisi.setMaximumSize(new java.awt.Dimension(200, 30));
        btnObrisi.setMinimumSize(new java.awt.Dimension(100, 30));
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
        tblVozila.setMinimumSize(new java.awt.Dimension(200, 100));
        tblVozila.setPreferredSize(new java.awt.Dimension(356, 150));
        tblVozila.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblVozilaFocusGained(evt);
            }
        });
        tblVozila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblVozilaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVozila);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Vozila:");
        jLabel10.setMaximumSize(new java.awt.Dimension(400, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(320, 20));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnDodajOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMarka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAdresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnDodajOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajOrgActionPerformed
        dodajOrganizaciju();
        txtNaziv.requestFocusInWindow();
    }//GEN-LAST:event_btnDodajOrgActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        obrisiVozilo();
        tblVozila.requestFocusInWindow();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        dodajVozilo();
        txtRegistarskiBroj.requestFocusInWindow();

    }//GEN-LAST:event_btnDodajActionPerformed

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
            txtRegistarskiBroj.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnDodajKeyPressed

    private void btnObrisiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnObrisiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            obrisiVozilo();
            tblVozila.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnObrisiKeyPressed

    private void btnDodajOrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDodajOrgKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dodajOrganizaciju();
            txtNaziv.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnDodajOrgKeyPressed

    private void btnOtkaziKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOtkaziKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispose();
        }
    }//GEN-LAST:event_btnOtkaziKeyPressed

    private void tblVozilaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVozilaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int selectedRow = tblVozila.getSelectedRow();
            btnObrisi.requestFocusInWindow();
            if (selectedRow > 0) {
                tblVozila.setRowSelectionInterval(selectedRow - 1, selectedRow - 1);

            }
        }
    }//GEN-LAST:event_tblVozilaKeyPressed

    private void txtAdresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdresaFocusGained
        txtAdresa.selectAll();
    }//GEN-LAST:event_txtAdresaFocusGained

    private void txtRegistarskiBrojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegistarskiBrojFocusGained
        txtRegistarskiBroj.selectAll();
    }//GEN-LAST:event_txtRegistarskiBrojFocusGained

    private void txtMarkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarkaFocusGained
        txtMarka.selectAll();
    }//GEN-LAST:event_txtMarkaFocusGained

    private void tblVozilaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblVozilaFocusGained
        if (tblVozila.getRowCount() > 0) {
            tblVozila.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_tblVozilaFocusGained

    private void txtNazivFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNazivFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivFocusGained

    private void txtNazivKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNazivKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajOrg;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVozila;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtRegistarskiBroj;
    // End of variables declaration//GEN-END:variables

    private void dodajVozilo() {
        if (txtRegistarskiBroj.getText().isEmpty() || txtMarka.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Polja registarski broj i marka moraju biti popunjena!");
            return;
        }

        TableModelNovaVozila model = (TableModelNovaVozila) tblVozila.getModel();

        String registarskiBroj = txtRegistarskiBroj.getText();

        if (!Pattern.matches("[A-Z]{2}\\-[0-9]{3,4}\\-[A-Z]{2}", registarskiBroj)) {
            JOptionPane.showMessageDialog(rootPane, "Registarska oznaka mora biti u formatu: \"AB-123-AB\" ili \"AB-1234-AB\"!");
            return;
        }

        String marka = txtMarka.getText();

        Vozilo v = new Vozilo(null, registarskiBroj, marka);

        for (Vozilo vozilo : model.getLista()) {
            if (vozilo.getRegistarskiBroj().equals(v.getRegistarskiBroj())) {
                JOptionPane.showMessageDialog(this, "Vec postoji vozilo sa "
                        + "tim registarskim brojem!");
                return;
            }
        }

        model.dodajVozilo(v);
    }

    private void obrisiVozilo() {
        int selectedRow = tblVozila.getSelectedRow();

        if (selectedRow >= 0) {
            TableModelNovaVozila model = (TableModelNovaVozila) tblVozila.getModel();
            model.obrisiVozilo(selectedRow);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nema vozila u tabeli!");
        }
    }

    private void dodajOrganizaciju() {
        try {
            if (txtNaziv.getText().isEmpty() || txtAdresa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Polja naziv i adresa moraju biti popunjena!");
                return;
            }

            String naziv = txtNaziv.getText();
            String adresa = txtAdresa.getText();

            TableModelNovaVozila model = (TableModelNovaVozila) tblVozila.getModel();

            if (model.getLista().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Organizacija mora imati barem jedno vozilo!");
                return;
            }

            Organizacija o = new Organizacija(null, naziv, adresa, model.getLista());

            ArrayList<Vozilo> svaVozila = ClientController.getInstance().getAllVozilo();

            for (Vozilo voziloIzBaze : svaVozila) {
                for (Vozilo vozilo : model.getLista()) {
                    if (voziloIzBaze.getRegistarskiBroj().equals(vozilo.getRegistarskiBroj())) {
                        JOptionPane.showMessageDialog(this, "Vec postoji vozilo sa tim registarskim brojem!");
                        return;
                    }
                }
            }

            ClientController.getInstance().addOrganizacija(o);
            JOptionPane.showMessageDialog(this, "Uspesno dodata organizacija.");

            MainForm parent = (MainForm) getParent();
            parent.azurirajOrganizacije();

            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
//            Logger.getLogger(FormNovaOrganizacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
