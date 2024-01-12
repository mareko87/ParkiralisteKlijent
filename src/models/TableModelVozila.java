/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ClientController;
import domain.Organizacija;
import domain.Vozilo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableModelVozila extends AbstractTableModel implements Runnable {

    private ArrayList<Vozilo> lista;
    private String[] kolone = {"Registarski broj", "Marka"};
    private Organizacija o;

    public TableModelVozila(Organizacija o) {
        try {
            this.o = o;
            
            ArrayList<Vozilo> svaVozila = ClientController.getInstance().getAllVozilo();
            ArrayList<Vozilo> vozilaOrganizacije = new ArrayList<>();
            
            for (Vozilo vozilo : svaVozila) {
                if(vozilo.getOrganizacija().getOrganizacijaID().equals(o.getOrganizacijaID()))
                    vozilaOrganizacije.add(vozilo);
            }
            
            lista = vozilaOrganizacije;
        } catch (Exception ex) {
            Logger.getLogger(TableModelVozila.class.getName()).log(Level.SEVERE, null, ex);
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
        Vozilo v = lista.get(row);

        switch (column) {
            case 0:
                return v.getRegistarskiBroj();
            case 1:
                return v.getMarka();

            default:
                return null;
        }
    }

    public Vozilo getSelectedVozilo(int row) {
        return lista.get(row);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(5000);
                osveziTabelu();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TableModelVozila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void osveziTabelu() {
        try {
            ArrayList<Vozilo> svaVozila = ClientController.getInstance().getAllVozilo();
            ArrayList<Vozilo> vozilaOrganizacije = new ArrayList<>();
            
            for (Vozilo vozilo : svaVozila) {
                if(vozilo.getOrganizacija().getOrganizacijaID().equals(o.getOrganizacijaID()))
                    vozilaOrganizacije.add(vozilo);
            }
            
            lista = vozilaOrganizacije;
            fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(TableModelVozila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void refreshTable() {
        try {
            ArrayList<Vozilo> svaVozila = ClientController.getInstance().getAllVozilo();
            ArrayList<Vozilo> vozilaOrganizacije = new ArrayList<>();
            
            for (Vozilo vozilo : svaVozila) {
                if(vozilo.getOrganizacija().getOrganizacijaID().equals(o.getOrganizacijaID()))
                    vozilaOrganizacije.add(vozilo);
            }
            
            lista = vozilaOrganizacije;
            fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(TableModelVozila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Vozilo> getLista() {
        return lista;
    }

}
