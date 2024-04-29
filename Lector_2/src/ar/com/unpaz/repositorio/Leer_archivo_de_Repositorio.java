package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Crud.Funcionalidades;
import ar.com.unpaz.Detalle.Leer_archivo_de_Detalle;
import ar.com.unpaz.Producto.Leer_archivo_de_Producto;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;

public class Leer_archivo_de_Repositorio implements Funcionalidades {

    public List<Leer_archivo_de_Cliente> getListClientes() {
    	File sFile = new File("H:\\optativa1\\Carp de Repositorios\\Fichero\\Cliente.txt");
        List<Leer_archivo_de_Cliente> sListLeer_archivo_de_Cliente = new ArrayList<Leer_archivo_de_Cliente>();
        FileReader sFilereader;
        try {
         sFilereader = new FileReader(sFile);
         BufferedReader sBufferedReader = new BufferedReader(sFilereader);
            String linea ="";
            while ((linea = sBufferedReader.readLine()) != null) 
            {
                String datos[] = linea.split(",");
                Leer_archivo_de_Cliente cliente = new Leer_archivo_de_Cliente(0, linea, linea, 0);
                cliente.setId(0);
                cliente.setNombre(linea);
                cliente.setApellido(linea);
                cliente.setTelefono(0);
                sListLeer_archivo_de_Cliente.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
       
       
    }
		return sListLeer_archivo_de_Cliente;
    }

   

   
     
    @Override
	public List<Leer_archivo_de_Venta> getListVentas() {
		File sFile = new File("H:\\optativa1\\Carp de Repositorios\\Fichero\\Venta.txt");
        List<Leer_archivo_de_Venta> sListLeer_archivo_de_Venta = new ArrayList<Leer_archivo_de_Venta>();
        FileReader sFilereader;
        try {
         sFilereader = new FileReader(sFile);
         BufferedReader sBufferedReader = new BufferedReader(sFilereader);
            String linea ="";
            while ((linea = sBufferedReader.readLine()) != null)
            {
                String datos[] = linea.split(",");
                Leer_archivo_de_Venta venta = new Leer_archivo_de_Venta(0, 0, 0, 0);
                venta.setId(0);
                venta.setFecha(0);
                venta.setCliente(0);
                venta.setTotal(0);
                sListLeer_archivo_de_Venta.add(venta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
            return sListLeer_archivo_de_Venta;
     }
	
	
	@Override
	public List<Leer_archivo_de_Detalle> getListDetalles() {
		File sFile = new File("ruta\\");
        List<Leer_archivo_de_Detalle> sListLeer_archivo_de_Detalle = new ArrayList<Leer_archivo_de_Detalle>();
        FileReader sFilereader;
        try {
         sFilereader = new FileReader(sFile);
         BufferedReader sBufferedReader = new BufferedReader(sFilereader);
            String linea ="";
            while ((linea = sBufferedReader.readLine()) != null) 
            {
                String datos[] = linea.split(",");
                Leer_archivo_de_Detalle Detalle = new Leer_archivo_de_Detalle(0, 0, 0, 0, 0);
                Detalle.setId(0);
                Detalle.setVenta(0);
                Detalle.setProducto(0);
                Detalle.setCantidad(0);
                Detalle.setPrecio(0);
                sListLeer_archivo_de_Detalle.add(0, Detalle);
            }
        } catch (IOException e) {
            e.printStackTrace();
       
       
    }
		return sListLeer_archivo_de_Detalle;


	}

	@Override
    public List<Leer_archivo_de_Producto> getListProductos() {
    	File sFile = new File("ruta\\");
        List<Leer_archivo_de_Producto> sListLeer_archivo_de_Producto = new ArrayList<Leer_archivo_de_Producto>();
        FileReader sFilereader;
        try {
         sFilereader = new FileReader(sFile);
         BufferedReader sBufferedReader = new BufferedReader(sFilereader);
            String linea ="";
            while ((linea = sBufferedReader.readLine()) != null) 
            {
                String datos[] = linea.split(",");
                Leer_archivo_de_Producto producto = new Leer_archivo_de_Producto(0, linea, 0, 0);
                producto.setId(0);
                producto.setNombre(linea);
                producto.setCantidad(2);
                producto.setPrecio(Double.parseDouble(datos[3]));
                sListLeer_archivo_de_Producto.add(0, producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
       
       
    }
		return sListLeer_archivo_de_Producto;

    }



	

	
}
