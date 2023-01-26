/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidad.Producto;

/**
 *
 * @author Windows 10
 */
public final class ProductoDaoExt extends DAO {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Collection<Producto> buscarTodo1() throws Exception{
        
        try{
            String sql = "SELECT nombre FROM producto;";
            
            consultarBase(sql);     
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                
                productos.add(producto);
            }
           desconectarBase();
           return productos;
           
        }catch (Exception e){
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> buscarTodo2() throws Exception{
        
        try{
            String sql = "SELECT Nombre, precio FROM producto;";
            
            consultarBase(sql);     
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
           desconectarBase();
           return productos;
           
        }catch (Exception e){
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> buscar3() {
        
        try{
            //Listar aquellos productos que su precio esté entre 120 y 202
            String sql = "select nombre, precio from producto where precio between 120 and 202;";
            
            consultarBase(sql);     
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
           desconectarBase();
           return productos;
           
        }catch (Exception e){
            desconectarBase();
            System.out.println("problema al resolver el ejercicio");
        }
        return null;
    }
    
    public Collection<Producto> buscar4() throws Exception{
        
        try{
            //Buscar y listar todos los Portátiles de la tabla producto
            String sql = "SELECT Nombre, precio FROM producto WHERE nombre like '%portatil%';";
            
            consultarBase(sql);     
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
           desconectarBase();
           return productos;
           
        }catch (Exception e){
            desconectarBase();
            throw e;
        }
    }
    
    public Producto buscar5() throws Exception{
        
        try{
            //Listar el nombre y el precio del producto más barato
            String sql = "SELECT Nombre, precio FROM producto Order BY precio asc limit 1;";
            
            consultarBase(sql);     
            
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
             
            }
           desconectarBase();
           return producto;
           
        }catch (Exception e){
            desconectarBase();
            throw e;
        }
    }    

//Ingresar un producto a la base de datos
    public void buscar6() throws Exception{
        
        try{
           
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Precio: ");
                    Double precio = leer.nextDouble();
                    System.out.print("Codigo de Fabricante: ");
                    int codigof = leer.nextInt();
                    
           
            
            Producto producto = new Producto();
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setCodigoFabricante(codigof);
                guardarProducto(producto);
         

           
        }catch (Exception e){
            
            throw e;
        }
    }

    protected void guardarProducto(Producto producto){
        try{
            if(producto == null){
                System.out.println("Debe indicar producto");
            }
            String sql = "Insert into producto ( nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";
            
            insertarModificarEliminar(sql);
        } catch(Exception e){
            
            System.out.println("Problema al guardar el producto");
    }    
}
    public void buscar8() throws Exception{
        
        try{
           System.out.print("Codigo de producto: ");
                    int codigo = leer.nextInt();
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Precio: ");
                    Double precio = leer.nextDouble();
                    System.out.print("Codigo de Fabricante: ");
                    int codigof = leer.nextInt();
                    
           
            
            Producto producto = new Producto();
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setCodigo(codigo);
                producto.setCodigoFabricante(codigof);
                guardarProducto(producto);
         

           
        }catch (Exception e){
            
            throw e;
        }
    }
    
    protected void modificarProducto(Producto producto){
        try{
            if(producto == null){
                System.out.println("Debe indicar producto");
            }
            String sql = "UPDATE producto SET "
                    + "PRECIO = '" + producto.getPrecio() + "' where codigo = '" + producto.getCodigo() + "' ; '";
            
            insertarModificarEliminar(sql);
        } catch(Exception e){
            
            System.out.println("Problema al modificar el producto");
    }    
}
    
}

