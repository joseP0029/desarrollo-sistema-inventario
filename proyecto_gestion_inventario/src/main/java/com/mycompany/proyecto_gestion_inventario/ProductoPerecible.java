package com.mycompany.proyecto_gestion_inventario;

public class ProductoPerecible extends Producto{
    private boolean refrigerado;

    public ProductoPerecible() {
    }

    public ProductoPerecible(boolean refrigerado, String id, int cantidad, String nombre, String categoria, String nombreFabricante, String detallesEnvio, float precio, Proveedor proveedor) {
        super(id, cantidad, nombre, categoria, nombreFabricante, detallesEnvio, precio, proveedor);
        this.refrigerado = refrigerado;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
    
}
