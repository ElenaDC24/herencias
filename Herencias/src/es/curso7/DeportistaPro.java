package es.curso7;

public class DeportistaPro extends Deportista{
	private int nivel;
	public DeportistaPro(String nombre, int edad,String deporte) {
	super(nombre, edad, deporte);
	nivel=2;
	
	}


	@Override
	public void andar() {
		System.out.println("anda a 9 km/h");
		
	}


	public DeportistaPro(String nombre, int edad, String deporte, int nivel) {
		super(nombre, edad, deporte);
		this.nivel = nivel;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
