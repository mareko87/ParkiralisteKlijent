/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import domain.Vozilo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableModelNovaVozila extends AbstractTableModel {

    private ArrayList<Vozilo> lista;
    private String[] kolone = {"Registarski broj", "Marka"};
    int rb = 0;

    public TableModelNovaVozila() {
        try {
            lista = new ArrayList<>();
        } catch (Exception ex) {
            Logger.getLogger(TableModelNovaVozila.class.getName()).log(Level.SEVERE, null, ex);
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

    public void obrisiVozilo(int selectedRow) {
        lista.remove(selectedRow);
        fireTableDataChanged();
    }

    public void dodajVozilo(Vozilo v) {
        lista.add(v);
        fireTableDataChanged();
    }

    public ArrayList<Vozilo> getLista() {
        return lista;
    }

}
