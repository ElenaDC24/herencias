package es.curso8;
//es el 4 de cecilio
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal5 {

	// queremos borrar personas
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
			
			sentencia.executeUpdate("delete from personas where nombre='david'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

