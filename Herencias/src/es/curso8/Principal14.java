package es.curso8;

import java.util.ArrayList;

public class Principal14 {

	public static void main(String[] args) {

		// instancio el repositorio
		PersonaRepositoryOk2 repo = new PersonaRepositoryOk2();
		//llamo al metodo buscarTodos()
		// ese metodo devuelve un resultSet
		// lo asocio
		ArrayList<Persona> lista = repo.buscarTodos();

		//ya tengo un resultset 
		//lo recorro como lo recorri otras veces 
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
			
		}

	}

}