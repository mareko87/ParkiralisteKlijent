/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import forms.organizacija.FormPretragaOrganizacije;
import controller.ClientController;
import domain.Administrator;
import domain.Organizacija;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marek
 */
public class TableModelOrganizacije extends AbstractTableModel implements Runnable {
    
    private boolean parLengthChanged;
    
    private List<Organizacija> lista;
    private String[] kolone = {"ID", "Naziv", "Adresa"};
    private String parametar = "";

    public TableModelOrganizacije(FormPretragaOrganizacije fpo) {
        try {
            lista = ClientController.getInstance().getAllOrganizacija();
            parLengthChanged = false;
        } catch (Exception ex) {
            Logger.getLogger(TableModelOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Organizacija o = lista.get(row);

        switch (column) {
            case 0:
                return o.getOrganizacijaID();
            case 1:
                return o.getNaziv();
            case 2:
                return o.getAdresa();

            default:
                return null;
        }
    }

    public Organizacija getSelectedOrganizacija(int row) {
        return lista.get(row);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(5000);
                if (parLengthChanged) {
                    osveziTabelu();
                    parLengthChanged = false;
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TableModelOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setParametar(String parametar) {
        this.parametar = parametar;
        parLengthChanged = true;
        osveziTabelu();
    }

    private void osveziTabelu() {
        try {
            lista = ClientController.getInstance().getAllOrganizacija();
            if (!parametar.equals("")) {
                ArrayList<Organizacija> novaLista = new ArrayList<>();
                for (Organizacija o : lista) {
                    if (o.getNaziv().toLowerCase().contains(parametar.toLowerCase())) {
                        novaLista.add(o);
                    }
                }
                lista = novaLista;
            } 
            fireTableDataChanged();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void refreshTable() {
        try {
            lista = ClientController.getInstance().getAllOrganizacija();
        } catch (Exception ex) {
            Logger.getLogger(TableModelOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
        fireTableDataChanged();
    }

    public boolean isParLengthChanged() {
        return parLengthChanged;
    }

    public void setParLengthChanged(boolean parLengthChanged) {
        this.parLengthChanged = parLengthChanged;
    }


}
