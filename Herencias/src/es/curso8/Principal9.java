package es.curso8;
//es el 8 de cecilio
public class Principal9 {

	public static void main(String[] args) {

		PersonaRepositoryNueva repo= new PersonaRepositoryNueva();
		Persona p= new Persona( "juanito1","gomez1",20);
		repo.insertar(p);
		
	}

}
