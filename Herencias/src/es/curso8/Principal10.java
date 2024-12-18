package es.curso8;

public class Principal10 {

	public static void main(String[] args) {

		PersonaRepositoryNueva repo= new PersonaRepositoryNueva();
		Persona p= new Persona( "pepe");
		repo.borrar(p);
		
	}

}
