package com.mycompany.proyecto_gestion_inventario;

public class UsuarioSistema {
    private int id;
    private String rol, nombre;

    public UsuarioSistema() {
    }

    public UsuarioSistema(int id, String rol, String nombre) {
        this.id = id;
        this.rol = rol;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
