package ar.com.unpaz.Cliente;

public class Leer_archivo_de_Cliente {
	
	public int id;
	public  String nombre;
	public String apellido;
	public int telefono;
	public Leer_archivo_de_Cliente(int id, String nombre, String apellido, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Leer_archivo_de_cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + "]";
	} 

}
