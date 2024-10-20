package com.mycompany.proyecto_gestion_inventario;

import java.util.ArrayList;

public class Almacen {
    private int id;
    private ArrayList<Producto> productos;

    public Almacen() {
    }

    public Almacen(int id, ArrayList<Producto> productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto>productos) {
        this.productos = productos;
    }
    
    public int buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return productos.indexOf(producto);
            }
        }
        return -1; 
    }
    
    public int buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return productos.indexOf(producto);
            }
        }
        return -1; 
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public boolean actualizarProducto(int idProducto, Producto producto) {
        if(buscarProductoPorId(idProducto) != -1) {
            productos.set(buscarProductoPorId(idProducto), producto);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminarProductoPorId(int idProducto) {
        if(buscarProductoPorId(idProducto) != -1) {
            productos.remove(buscarProductoPorId(idProducto));
            return true;
        } else {
            return false;
        }
    }
    
}
