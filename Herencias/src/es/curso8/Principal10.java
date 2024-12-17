package es.curso8;
//es el 8 de cecilio
public class Principal10 {

	public static void main(String[] args) {

		PersonaRepositoryNueva repo= new PersonaRepositoryNueva();
		Persona p= new Persona( "pepe");
		repo.borrar(p);
		
	}

}
