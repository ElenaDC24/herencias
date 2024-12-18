package es.curso8;

public class Principal12InsertFact {

	public static void main(String[] args) {
		
		FacturaRepository repo= new FacturaRepository();
		Factura f= new Factura( 50,"fontaneria",230);
		repo.insertar(f);

	}

}
