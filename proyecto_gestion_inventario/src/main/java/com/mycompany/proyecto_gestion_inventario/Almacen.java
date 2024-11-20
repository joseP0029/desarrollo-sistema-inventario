package com.mycompany.proyecto_gestion_inventario;

import java.util.ArrayList;
import java.io.*;

public class Almacen {
    private ArrayList<Producto> productos;
    private String nombreArchivo;
    
    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public Almacen(String nombreArchivo) {
        this.productos = new ArrayList<>();
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
    
    public int cantidadProductos() {
        return productos.size();
    }
    
    public Producto productoEnPosicion(int indice) {
        return productos.get(indice);
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
        try (ObjectInputStream Obin = new ObjectInputStream(new FileInputStream(nombreArchivo));) {
            Producto producto;
            while((producto=(Producto)Obin.readObject())!=null){
                agregarProducto(producto);
            }
        }
        catch (EOFException e) {
        }
        catch (IOException | ClassNotFoundException ex) {}
    }
    

    public boolean guardar(){ 
        Boolean b=true;
        try{
            ObjectOutputStream Obout;
            Obout = new ObjectOutputStream(new FileOutputStream(nombreArchivo, false));
            
            for (Producto producto: productos){
                Obout.writeObject(producto);
            }
            Obout.close();
        }catch(IOException ex){ 
            b=false;
            System.out.println("ERROR AL GUARDAR: " + ex.getMessage());
        }
        return b;
    }
    
}
