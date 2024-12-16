package es.curso8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal2 {

	// necesito un monton de codigo
	// lo copio de git hub de cecilioalvarez...cie1...java03...curso08
	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Factura";

	public static void main(String[] args) {
		// Open a connection
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			ResultSet conjuntoResultados = sentencia.executeQuery(QUERY);
			{
				while (conjuntoResultados.next()) {
					// Display values
					System.out.print(conjuntoResultados.getInt("numero")+".- ");
					System.out.print(conjuntoResultados.getString("concepto")+": ");
					System.out.println(conjuntoResultados.getDouble("importe")+"€");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
