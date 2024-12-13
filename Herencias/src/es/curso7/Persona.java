package es.curso7;

public class Persona {
	private String nombre;
	private int edad;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void andar() {
		System.out.println("anda a 5km/hora");
		
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
