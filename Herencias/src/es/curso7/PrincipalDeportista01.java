package es.curso7;

public class PrincipalDeportista01 {

	public static void main(String[] args) {

		DeportistaPro deportista = new DeportistaPro("pepe", 20, "tenis", 1);

		System.out.println(deportista.getNombre());
		System.out.println(deportista.getEdad());
		System.out.println(deportista.getDeporte());
		System.out.println(deportista.getNivel());
		deportista.andar();
		Deportista deportistaNormal = new Deportista("ana", 30,"baloncesto");
		deportista.andar();
	
				Persona p= new Persona ("gema", 20);
		p.andar ();
		
	}

}
