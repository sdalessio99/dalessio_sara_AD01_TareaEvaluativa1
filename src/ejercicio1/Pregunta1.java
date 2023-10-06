package ejercicio1;

import java.io.*;
public class Pregunta1 {

	public static void main(String[] args) {
		
		//metodo try with resource donde declaro fliereader y filewriter)
		try (FileReader fentrada = new FileReader("."+ File.separator + "src" + File.separator + "ejercicio1" + File.separator + "texto.txt");
			FileWriter fsalida = new FileWriter ("."+ File.separator + "src" + File.separator + "ejercicio1" + File.separator + "salida.txt")) {
			
			int i;
			char c;
			String cadena= "";
			
			//bucle while donde cogo el caracter y lo pongo al principio de la cadena
			while ((i=fentrada.read()) != -1) {
				c = (char) i;
				cadena=c+cadena;
			}
			
			//uso el metodo write de la clase FileWriter para escribir en el archivo de salida
			fsalida.write(cadena);
			
		} catch (FileNotFoundException e) {
			System.out.println("No existe fichero ");
		} catch (IOException e) {
			System.out.println("Error de E/S: " + e.getMessage());
		}
		
	}

}
