/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ClientController;
import domain.Organizacija;
import domain.Racun;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marek
 */
public class TableModelRacuni extends AbstractTableModel implements Runnable {

    private boolean parLengthChanged;
    
    private List<Racun> lista;
    private String[] kolone = {"ID", "Datum", "Broj rezervisanih mesta", "Iznos bez popusta", 
                                "Popust", "Iznos sa popustom", "Administrator", "Organizacija"};
    private String parametar = "";

    public TableModelRacuni() {
        try {
            lista = ClientController.getInstance().getAllRacun();
            parLengthChanged = false;
        } catch (Exception ex) {
            Logger.getLogger(TableModelRacuni.class.getName()).log(Level.SEVERE, null, ex);
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
        Racun r = lista.get(row);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        switch (column) {
            case 0:
                return r.getRacunID();
            case 1:
                return sdf.format(r.getDatum());
            case 2:
                return r.getBrojRezervsisanihMesta();
            case 3:
                return r.getIznosBezPopusta();
            case 4: 
                return r.getPopust();
            case 5: 
                return r.getIznosSaPopustom();
            case 6: 
                return r.getAdministrator();
            case 7: 
                return r.getOrganizacija();

            default:
                return null;
        }
    }

    public Racun getSelectedRacun(int row) {
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
            Logger.getLogger(TableModelRacuni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setParametar(String parametar) {
        this.parametar = parametar;
        parLengthChanged = true;
        osveziTabelu();
    }

    private void osveziTabelu() {
        try {
            lista = ClientController.getInstance().getAllRacun();
            if (!parametar.equals("")) {
                ArrayList<Racun> novaLista = new ArrayList<>();
                for (Racun r : lista) {
                    if (r.getOrganizacija().getNaziv().toLowerCase().contains(parametar.toLowerCase())) {
                        novaLista.add(r);
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
            lista = ClientController.getInstance().getAllRacun();
        } catch (Exception ex) {
            Logger.getLogger(TableModelRacuni.class.getName()).log(Level.SEVERE, null, ex);
        }
        fireTableDataChanged();
    }

    public List<Racun> getLista() {
        return lista;
    }

    public int vratiBrojRacunaZaDan(Date danasnjiDatum) {
        int brojRacuna = 0;
        for (Racun racun : lista) {
            if (racun.getDatum().equals(danasnjiDatum)) {
                brojRacuna++;
            }
        }
        return brojRacuna;
    }

    public boolean isParLengthChanged() {
        return parLengthChanged;
    }

    public void setParLengthChanged(boolean parLengthChanged) {
        this.parLengthChanged = parLengthChanged;
    }

}
