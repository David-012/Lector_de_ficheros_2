package ar.com.unpaz.Crud;

import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Detalle.Leer_archivo_de_Detalle;
import ar.com.unpaz.Producto.Leer_archivo_de_Producto;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;

public interface Funcionalidades  {

	
    List<Leer_archivo_de_Cliente> getListClientes();
    
	
	List<Leer_archivo_de_Venta> getListVentas();
	
	List<Leer_archivo_de_Detalle> getListDetalles();
	
	

	List<Leer_archivo_de_Producto> getListProductos();
}

