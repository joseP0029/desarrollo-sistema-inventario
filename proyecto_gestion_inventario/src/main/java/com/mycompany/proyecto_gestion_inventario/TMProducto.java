package com.mycompany.proyecto_gestion_inventario;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

 public class TMProducto implements TableModel{
     private ArrayList<Producto> productos;

    public TMProducto(ArrayList<Producto> productos) {
        this.productos = productos;
    }
     
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] nombresCol = {"ID", "Nombre", "Cantidad", "Categoria", "Fabricante", "Precio", "Proveedor", "Detalles envío", "Refrigerado"};
        return nombresCol[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class[] clasesCol = {int.class, String.class , int.class , String.class, String.class, float.class, String.class, String.class, boolean.class};
        return clasesCol[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        Object[] valor = {p.getId(), p.getNombre(), p.getCantidad(), p.getCategoria(), p.getNombreFabricante(), p.getPrecio(), p.getProveedor().getNombre(), p.getDetallesEnvio()};
        if (columnIndex != 8) {
            return valor[columnIndex];
        }
        else {
            if (p instanceof ProductoPerecible) {
                return ((ProductoPerecible) p).isRefrigerado();
            }
            else return false;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        switch(columnIndex) {
            case 0:
                p.setId((String)aValue);
                break;
            case 1:
                p.setNombre((String)aValue);
                break;
            case 2:
                p.setCantidad((Integer)aValue);
                break;
            case 3:
                p.setCategoria((String)aValue);
                break;
            case 4:
                p.setNombreFabricante((String)aValue);
                break;
            case 5:
                p.setCategoria((String)aValue);
                break;
            case 6:
                p.setProveedor((Proveedor) aValue);
                break;
            case 7:
                p.setDetallesEnvio((String)aValue);
                break;
            case 8:
                if(p instanceof ProductoPerecible) {
                    ((ProductoPerecible) p).setRefrigerado((boolean) aValue);
                }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
     
}
