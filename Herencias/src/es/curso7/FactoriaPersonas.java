package es.curso7;

public class FactoriaPersonas {
	public static Persona crearPersona(String tipo,String nombre, int edad) {
		if (tipo.equals("Persona")) {
			
			return new Persona(nombre,edad);
		}else if (tipo.equals("Deportista")) {
			
			return new Deportista(nombre,edad,"padel");
		}else {
			return new DeportistaPro(nombre,edad,"padel", 1);
		}
	}

}
