package ar.com.unpaz.Venta;

public class Leer_archivo_de_Venta {
	public int id;
	public int fecha;
	public int cliente;
	public int total;
	public Leer_archivo_de_Venta(int id, int fecha, int cliente, int total) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Leer_archivo_de_Venta [id=" + id + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total
				+ ", getId()=" + getId() + ", getFecha()=" + getFecha() + ", getCliente()=" + getCliente()
				+ ", getTotal()=" + getTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
