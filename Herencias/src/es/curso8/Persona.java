package es.curso8;

public class Persona {

	public String nombre;
	public String apellidos;
	public int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
