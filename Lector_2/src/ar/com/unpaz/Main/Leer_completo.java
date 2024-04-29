/*package ar.com.unpaz.Main;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Servicio.Leer_archivo_de_Servicio;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;

public class Leer_completo {

					
			public static void main(String[] args) {
				Leer_archivo_de_Servicio  servicio = new Leer_archivo_de_Servicio();
				System.out.print("***************************");
				System.out.print("    Programa de lectura");
				System.out.print("***************************");

				List<Leer_archivo_de_Cliente> lista = new ArrayList<Leer_archivo_de_Cliente>();
				lista= servicio.getListClientes();
				
                System.out.println("clientes");
				for (Leer_archivo_de_Cliente cliente : lista) {
					System.out.println("Nombre"+cliente );
					
						
				}
				List<Leer_archivo_de_Venta> listaVenta = new ArrayList<Leer_archivo_de_Venta>();
				listaVenta= servicio.getListVentas();
                System.out.println("Ventas");
				for (Leer_archivo_de_Venta venta : listaVenta) {
					System.out.println("tipo"+venta);
				
		}

	}
}*/
/*Spackage ar.com.unpaz.Main;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Servicio.Leer_archivo_de_Servicio;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;

/*public class Leer_completo {

					
			public static void main(String[] args) {
				Leer_archivo_de_Servicio  servicio = new Leer_archivo_de_Servicio();
				System.out.print("***************************");
				System.out.print("    Programa de lectura");
				System.out.print("***************************");

				List<Leer_archivo_de_Cliente> lista = new ArrayList<Leer_archivo_de_Cliente>();
				lista= servicio.getListClientes();

				for (Leer_archivo_de_Cliente cliente : lista) {
					System.out.println("Nombre"+cliente);
						
				}
				List<Leer_archivo_de_Venta> listaVenta = new ArrayList<Leer_archivo_de_Venta>();
				listaVenta= servicio.getListVentas();

				for (Leer_archivo_de_Venta venta : listaVenta) {
					System.out.println("tipo"+venta);
				
				}
			}
}*/
package ar.com.unpaz.Main;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Cliente.Leer_archivo_de_Cliente;
import ar.com.unpaz.Servicio.Leer_archivo_de_Servicio;
import ar.com.unpaz.Venta.Leer_archivo_de_Venta;

public class Leer_completo {

    public static void main(String[] args) {
        Leer_archivo_de_Servicio servicio = new Leer_archivo_de_Servicio();
        System.out.println("***************************");
        System.out.println("    Programa de lectura");
        System.out.println("***************************");

        // Leer clientes
        List<Leer_archivo_de_Cliente> listaClientes = servicio.getListClientes();
        System.out.println("Clientes:");
        for (Leer_archivo_de_Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
        System.out.println(); // Salto de línea después de imprimir los clientes

        // Leer ventas
        List<Leer_archivo_de_Venta> listaVentas = servicio.getListVentas();
        System.out.println("Ventas:");
        for (Leer_archivo_de_Venta venta : listaVentas) {
            System.out.println(venta.toString());
        }
    }
}

			
			
			

		
	


