package com.mycompany.proyecto_gestion_inventario;

import java.io.Serializable;

public class Producto implements Serializable{
    private int id, cantidad;
    private String nombre, categoria, nombreFabricante, detallesEnvio;
    private float precio;
    private Proveedor proveedor;

    public Producto() {
    }

    public Producto(int id, int cantidad, String nombre, String categoria, String nombreFabricante, String detallesEnvio, float precio, Proveedor proveedor) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.nombreFabricante = nombreFabricante;
        this.detallesEnvio = detallesEnvio;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getDetallesEnvio() {
        return detallesEnvio;
    }

    public void setDetallesEnvio(String detallesEnvio) {
        this.detallesEnvio = detallesEnvio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
