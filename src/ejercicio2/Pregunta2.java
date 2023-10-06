package ejercicio2;

import java.io.*;
import java.util.Scanner;
public class Pregunta2 {

	public static void main(String[] args) {
		//try with resource donde declaro bufferedreader y bufferedwriter
		try (BufferedReader fbr = new BufferedReader(new FileReader("."+ File.separator + "src" + File.separator + "ejercicio2" + File.separator + "lectura.txt"));
			BufferedWriter fbw = new BufferedWriter(new FileWriter("."+ File.separator + "src" + File.separator + "ejercicio2" + File.separator + "escritura.txt"))) {
			
			String texto="";
			String linea= fbr.readLine();
			
			//uso la clase scanner para usar la linea leida por bufferedreader
			//scanner y leer palabra por palabra para ver si es palindromo
			while (linea!= null) {
				try (Scanner input = new Scanner (linea)) {
					while (input.hasNext()) {
						String palabra = input.next();
						if (esPalindromo(palabra)) {
							texto += palabra+"\n";
						}
					}
				}
				linea= fbr.readLine();
			}
			
			fbw.write(texto);

		} catch (FileNotFoundException e) {
		      System.out.println("No existe fichero ");
		} catch (IOException e) {
		      System.out.println("Error de E/S: " + e.getMessage());
		}

	}
	
	//metodo para ver si una palabra es palindroma
	public static boolean esPalindromo(String cadena){

		for(int i=0 ; i < cadena.length()/2;i++)
		{
		  if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i))

		      return false;
		}

		return true;
	}
}
