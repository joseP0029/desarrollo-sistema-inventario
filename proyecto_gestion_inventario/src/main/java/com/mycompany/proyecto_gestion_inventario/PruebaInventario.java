package com.mycompany.proyecto_gestion_inventario;

public class PruebaInventario {

    public static void main(String[] args) {
        
        Almacen almacenPrueba = new Almacen("ArchivoDePruebas.dat");
        almacenPrueba.leer();
        if (almacenPrueba.cuenta() == 0){
            Producto p = new Producto(1, 50, "Laptop Lenovo", "Electrónica", "Lenovo", "Envío gratuito a todo el país", 1200.99f, new Proveedor("Distribuciones ALFA", "Bucaramanga", "555-1234"));
            almacenPrueba.agregarProducto(p);
            p = new ProductoNoPerecible(2, 200, "Cereal Chocapic", "Alimentos", "Nestlé", "Envío refrigerado", 3.49f, new Proveedor("Distribuciones ALFA", "Bucaramanga", "555-1234"));
            almacenPrueba.agregarProducto(p);
            p = new Producto(3, 100, "Silla ergonómica", "Muebles", "ErgoPlus", "Envío en 3 días", 199.99f, new Proveedor("Distribuciones ALFA", "Bucaramanga", "555-1234"));
            almacenPrueba.agregarProducto(p);
            p = new Producto(4, 150, "Smartphone Samsung Galaxy", "Electrónica", "Samsung", "Entrega en 24 horas", 899.99f, new Proveedor("Distribuciones ALFA", "Bucaramanga", "555-1234"));
            almacenPrueba.agregarProducto(p);
            p = new ProductoPerecible(true,5, 500, "Jugo de Naranja Natural", "Bebidas", "Natural Juice Co.", "Envío rápido con empaque reciclable", 1.99f, new Proveedor("Distribuciones ALFA", "Bucaramanga", "555-1234"));
            almacenPrueba.agregarProducto(p);

            if (!almacenPrueba.guardar())
            System.out.println("Error al guardar en el archivo");
            else
            System.out.println("Datos archivados correctamente");
        }
                        
        for(int i=0; i<almacenPrueba.cuenta();i++){
            Producto pro = almacenPrueba.productoEn(i);
            System.out.print("   "+(i+1));
               if (pro instanceof ProductoPerecible)
                  System.out.print("\tProducto Perecible\t");
               else{
                   if (pro instanceof ProductoNoPerecible)
                       System.out.print("\tProducto no Perecible\t");
                   else
                       System.out.print("\tProducto   \t");
               }
            System.out.println(pro);
        }

    }//fin metodo main
      
}//fin de la clase Practica
