package es.curso8;

public class Principal11BorrarFact {

	public static void main(String[] args) {
		
		FacturaRepository repo= new FacturaRepository();
		Factura f= new Factura(1);
		repo.borrar(f);

	}

}
