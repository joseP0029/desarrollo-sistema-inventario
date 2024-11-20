package com.mycompany.proyecto_gestion_inventario;

public class ProductoNoPerecible extends Producto{

    public ProductoNoPerecible() {
    }

    public ProductoNoPerecible(String id, int cantidad, String nombre, String categoria, String nombreFabricante, String detallesEnvio, float precio, Proveedor proveedor) {
        super(id, cantidad, nombre, categoria, nombreFabricante, detallesEnvio, precio, proveedor);
    }
    
    
}
