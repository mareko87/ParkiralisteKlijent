/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.administrator;

import controller.ClientController;
import domain.Administrator;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.TableModelAdministratori;

/**
 *
 * @author marek
 */
public class FormPretragaAdministratora extends javax.swing.JDialog {

    /**
     * Creates new form FormPretragaClanova
     */
    public FormPretragaAdministratora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TableModelAdministratori model = new TableModelAdministratori();
        Thread th = new Thread(model);
        th.start();
        tblAdministrator.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPretraga = new javax.swing.JTextField();
        btnDetalji = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdministrator = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administratori");
        setMinimumSize(new java.awt.Dimension(250, 150));
        setResizable(false);

        jLabel1.setText("Pretraga:");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 14));

        txtPretraga.setMaximumSize(new java.awt.Dimension(300, 25));
        txtPretraga.setMinimumSize(new java.awt.Dimension(100, 25));
        txtPretraga.setPreferredSize(new java.awt.Dimension(200, 25));
        txtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPretragaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretragaKeyReleased(evt);
            }
        });

        btnDetalji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDetalji.setText("Detalji administratora");
        btnDetalji.setMaximumSize(new java.awt.Dimension(300, 35));
        btnDetalji.setMinimumSize(new java.awt.Dimension(100, 35));
        btnDetalji.setPreferredSize(new java.awt.Dimension(140, 35));
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        tblAdministrator.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblAdministrator);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyReleased
        String param = txtPretraga.getText();
        TableModelAdministratori tma = (TableModelAdministratori) tblAdministrator.getModel();
        tma.setParametar(param);
        if (tma.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nema administratora za zadati kriterijum!");
            txtPretraga.setText("");
            tma.setParametar("");
            txtPretraga.requestFocusInWindow();
            txtPretraga.selectAll();
        }
    }//GEN-LAST:event_txtPretragaKeyReleased

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
        detalji();
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void txtPretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tblAdministrator.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtPretragaKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAdministrator;
    private javax.swing.JTextField txtPretraga;
    // End of variables declaration//GEN-END:variables

    void refreshTable() {
        TableModelAdministratori model = (TableModelAdministratori) tblAdministrator.getModel();
        model.refreshTable();
    }

    private void detalji() {
        int row = tblAdministrator.getSelectedRow();
        if (row >= 0) {
            try {
                Administrator a
                        = ((TableModelAdministratori) tblAdministrator.getModel()).getSelectedAdministrator(row);
                
                Administrator administrator = ClientController.getInstance().getAdministrator(a);
                
                FormDetaljiAdministratora fda 
                        = new FormDetaljiAdministratora(this, true, administrator);
                fda.setLocationRelativeTo(null);
                fda.setVisible(true);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Greska prilikom ucitavanja administratora: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nije oznacen nijedan administrator u tabeli!");
        }
    }
}