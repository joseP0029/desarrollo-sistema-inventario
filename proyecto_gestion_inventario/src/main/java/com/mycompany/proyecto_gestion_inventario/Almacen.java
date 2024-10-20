package com.mycompany.proyecto_gestion_inventario;

import java.util.ArrayList;
import java.io.*;


public class Almacen {
    private ArrayList<Producto> productos;
    private String nombreArchivo;
    
    public Almacen() {
        this.productos = new ArrayList<Producto>();
    }

    public Almacen(ArrayList<Producto> productos, String nombreArchivo) {
        this.productos = productos;
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto>productos) {
        this.productos = productos;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
    
    public void leer(){
        Producto producto;
        //this.lista.removeAllElements(); //limpia la lista
        try {
            ObjectInputStream Obin;
            Obin=new ObjectInputStream(new FileInputStream(nombreArchivo));
            while((producto=(Producto)Obin.readObject())!=null){
            agregarProducto(producto);
            }Obin.close();
        }catch (Exception ex){}
}
    public boolean guardar(){ 
        Boolean b=true;
        try{
            ObjectOutputStream Obout;
            Obout = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            for (Producto producto: productos){
            Obout.writeObject(producto); //guarda en el archivo
            }
            Obout.close();
        }catch(Exception Ex){ b=false;}
        return b;
}
    
}
