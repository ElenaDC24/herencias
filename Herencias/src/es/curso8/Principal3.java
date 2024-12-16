package es.curso8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal3 {

	// necesito un monton de codigo
	// lo copio de git hub de cecilioalvarez...cie1...java03...curso08
	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Personas";

	public static void main(String[] args) {
		// Open a connection
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			
			
			String nombre="david";
			String apellidos="alvarez";
			int edad=50;
			
			sentencia.executeUpdate("insert into personas values ('"+ nombre+"','"+apellidos+"',"+edad+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

