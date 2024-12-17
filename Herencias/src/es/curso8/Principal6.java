package es.curso8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//es el 5 de cecilio
//hay que crear un file de texto
public class Principal6 {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("hola.txt");
		
		try {
			List<String> lineas = Files.readAllLines(ruta);
			
			for (String linea : lineas) {
				System.out.println(linea);
			}
		} catch (IOException e ) {
			
			System.out.println("hola majo que no va el fichero");
		}finally {
			System.out.println("cerrar");
		}

	}

}
