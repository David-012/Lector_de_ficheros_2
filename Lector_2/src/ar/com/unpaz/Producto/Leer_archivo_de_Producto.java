package ar.com.unpaz.Producto;

public class Leer_archivo_de_Producto {
	public int id;
	public String nombre;
	public int cantidad;
	public double precio;
	public Leer_archivo_de_Producto(int id, String nombre, int cantidad, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String i) {
		this.nombre = i;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double d) {
		this.precio = d;
	}
	

}
