package com.mycompany.proyecto_gestion_inventario;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Proveedor> proveedores;
    private String nombreArchivo;
    
    public Agenda() {
        this.proveedores = new ArrayList<>();
    }

    public Agenda(String nombreArchivo) {
        this.proveedores = new ArrayList<>();
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor>proveedores) {
        this.proveedores = proveedores;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public int cantidadProveedores() {
        return proveedores.size();
    }
    
    public Proveedor proveedorEnPosicion(int indice) {
        return proveedores.get(indice);
    }
    
    public int buscarProveedorPorId(int id) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId().equals(id)) {
                return proveedores.indexOf(proveedor);
            }
        }
        return -1; 
    }
    
    public int buscarProveedorPorNombre(String nombre) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNombre().equalsIgnoreCase(nombre)) {
                return proveedores.indexOf(proveedor);
            }
        }
        return -1; 
    }
    
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }
    
    public boolean actualizarProveedor(int idProveedor, Proveedor proveedor) {
        if(buscarProveedorPorId(idProveedor) != -1) {
            proveedores.set(buscarProveedorPorId(idProveedor), proveedor);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminarProveedorPorId(int idProveedor) {
        if(buscarProveedorPorId(idProveedor) != -1) {
            proveedores.remove(buscarProveedorPorId(idProveedor));
            return true;
        } else {
            return false;
        }
    }
    
    public void leer(){
        try (ObjectInputStream Obin = new ObjectInputStream(new FileInputStream(nombreArchivo));) {
            Proveedor proveedor;
            while((proveedor=(Proveedor)Obin.readObject())!=null){
                agregarProveedor(proveedor);
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
            
            for (Proveedor proveedor: proveedores){
                Obout.writeObject(proveedor);
            }
            Obout.close();
        }catch(IOException ex){ 
            b=false;
            System.out.println("ERROR AL GUARDAR: " + ex.getMessage());
        }
        return b;
    }

}
