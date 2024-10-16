package com.mycompany.proyecto_gestion_inventario;

public class Almacen {
    private int id;
    private Producto[] productos;

    public Almacen() {
    }

    public Almacen(int id, Producto[] productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
}
