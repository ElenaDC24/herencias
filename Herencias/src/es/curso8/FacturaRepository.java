package es.curso8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaRepository {
		
		
		static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		static final String USER = "root";
		static final String PASS = "";
		static final String QUERY = "SELECT * from Factura";

		public void insertar(Factura factura) {
			// Open a connection
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
								
								
				sentencia.executeUpdate("insert into factura values ('"+ factura.getNumero()+"','"+ factura.getConcepto()+"',"+factura.getImporte()+")");
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
		}
		public void borrar(Factura factura) {
				// Open a connection
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
				
				String consultaBorrar="delete from Factura where numero='"+factura.getNumero()+"'";
				
						System.out.println(consultaBorrar);
						
				sentencia.executeUpdate(consultaBorrar);
				
				
			} catch (SQLException e) {
					
				e.printStackTrace();
					
		}
	}
}
