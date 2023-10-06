package ejercicio3;

import java.io.*;
import java.util.*;
public class Pregunta3 {

	public static void main(String[] args) {

		File inputFile = new File ("."+ File.separator + "src" + File.separator + "ejercicio3" + File.separator + "archivo.zip");
		
		//cabecera valida de un archivo ZIP
        int[] cabeceraReferencia = {80, 75, 3, 4};
        
        try (InputStream inputStream = new FileInputStream(inputFile)) {
			int[] cabeceraZip = new int[4];
			
			for (int i=0;i<4;i++) {
				cabeceraZip[i] = inputStream.read();
			}
			
			//comparo arrays para ver si la cabecera del archivo coincide con la valida
			if (!Arrays.equals(cabeceraZip, cabeceraReferencia)) {
				System.out.println("No es un ZIP valido");
			} else {
				System.out.println("Es un ZIP valido");
			}
		
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
