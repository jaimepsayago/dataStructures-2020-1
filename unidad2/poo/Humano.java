package unidad2.poo;

public class Humano {
	
	protected String nombre;
	protected String apellido;
	
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	String nombreCompleto() {
		return this.apellido+ " "+ this.nombre;
	}
	String identificacion() {
		return this.nombreCompleto();
	}
	

}
