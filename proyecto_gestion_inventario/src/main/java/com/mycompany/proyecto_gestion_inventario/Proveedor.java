package com.mycompany.proyecto_gestion_inventario;

import java.io.Serializable;

public class Proveedor implements Serializable{
    private String id, nombre, ciudad, telefono;

    public Proveedor() {
    }
    
    public Proveedor(String id, String nombre, String ciudad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
