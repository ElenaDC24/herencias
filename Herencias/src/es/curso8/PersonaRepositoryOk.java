package es.curso8;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaRepositoryOk {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Personas";

	public void insertar(Persona persona) {
		// Open a connection
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			sentencia.executeUpdate("insert into personas values ('" + persona.getNombre() + "','"
					+ persona.getApellidos() + "'," + persona.getEdad() + ")");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void borrar(Persona persona) {
		// Open a connection
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			String consultaBorrar = "delete from Personas where nombre='" + persona.getNombre() + "'";

			System.out.println(consultaBorrar);

			sentencia.executeUpdate(consultaBorrar);

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	public ResultSet buscarTodos() {

		ResultSet rs = null;
		try {
			// conecto a la base de datos
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			// preparo la sentencia
			Statement sentencia = conexion.createStatement();
			// ejecuto
			rs = sentencia.executeQuery("select * from Personas");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}//pedir consulta por apellido
	public ResultSet buscarApellidos() {

		ResultSet rs = null;
		try {
			// conecto a la base de datos
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			// preparo la sentencia
			Statement sentencia = conexion.createStatement();
			// ejecuto
			rs = sentencia.executeQuery("select apellidos from Personas");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
}
}