package com.mycompany.proyecto_gestion_inventario;

public class PruebaInventario {

    public static void main(String[] args) {
        
        Almacen almacenPrueba = new Almacen("C:\\datos\\objetos.dat");
        almacenPrueba.leer();
        
        TMProducto modelo = new TMProducto(almacenPrueba.getProductos());
        
        Login log = new Login();
        log.setVisible(true);
        
    }//fin metodo main
}//fin de la clase Practica
