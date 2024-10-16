package com.mycompany.proyecto_gestion_inventario;

public class Proveedor {
    private String nombre, ciudad;
    private int numeroTelefono;

    public Proveedor() {
    }
    
    public Proveedor(String nombre, String ciudad, int numeroTelefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroTelefono = numeroTelefono;
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    
    
}
