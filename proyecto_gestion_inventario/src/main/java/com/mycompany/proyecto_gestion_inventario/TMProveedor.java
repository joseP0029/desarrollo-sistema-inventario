package com.mycompany.proyecto_gestion_inventario;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMProveedor implements TableModel{
    private ArrayList<Proveedor> proveedores;

    public TMProveedor(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    @Override
    public int getRowCount() {
        return proveedores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] nombresCol = {"ID", "Nombre", "Ciudad", "Teléfono"};
        return nombresCol[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedor p = proveedores.get(rowIndex);
        Object[] valor = {p.getId(), p.getNombre(), p.getCiudad(), p.getTelefono()};
        return valor[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Proveedor p = proveedores.get(rowIndex);
        switch(columnIndex) {
            case 0:
                p.setId((String)aValue);
                break;
            case 1:
                p.setNombre((String)aValue);
                break;
            case 2:
                p.setTelefono((String)aValue);
                break;
            case 3:
                p.setCiudad((String)aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
