package es.curso8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal13 {

	public static void main(String[] args) {
		
		PersonaRepositoryOk repo= 
				new PersonaRepositoryOk();

		ResultSet rs=repo.buscarTodos();
		
		try {
			while(rs.next()) {
				
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getInt("edad"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}