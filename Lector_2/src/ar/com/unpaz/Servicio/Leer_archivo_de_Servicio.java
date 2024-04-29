	package ar.com.unpaz.Servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Crud.Funcionalidades;
import ar.com.unpaz.Detalle.Leer_archivo_de_Detalle;
import ar.com.unpaz.Producto.Leer_archivo_de_Producto;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;
import ar.com.unpaz.repositorio.Leer_archivo_de_Repositorio;

public class Leer_archivo_de_Servicio implements Funcionalidades {

	    @Override
	    public List<Leer_archivo_de_Cliente> getListClientes() {
	    	Leer_archivo_de_Repositorio repo = new Leer_archivo_de_Repositorio();
	        List<Leer_archivo_de_Cliente> sList = new ArrayList<Leer_archivo_de_Cliente>();
	        sList =  repo.getListClientes();
	        return repo.getListClientes();
	        		
	    }

	    @Override
	    public List<Leer_archivo_de_Venta> getListVentas() {
	        Leer_archivo_de_Repositorio repo = new Leer_archivo_de_Repositorio();
	        List<Leer_archivo_de_Venta> sList = new ArrayList<Leer_archivo_de_Venta>();
	        return repo.getListVentas();
	    }

	
	    @Override
	    public List<Leer_archivo_de_Producto> getListProductos() {
	        Leer_archivo_de_Repositorio repo = new Leer_archivo_de_Repositorio();
	        List<Leer_archivo_de_Producto> sList = new ArrayList<Leer_archivo_de_Producto>();
	        return repo.getListProductos();
	       
	    }

		

		@Override
		public List<Leer_archivo_de_Detalle> getListDetalles() {
			Leer_archivo_de_Repositorio repo = new Leer_archivo_de_Repositorio();
			List<Leer_archivo_de_Detalle> sList = new ArrayList<Leer_archivo_de_Detalle>();
			
			return repo.getListDetalles();
		}
	}



