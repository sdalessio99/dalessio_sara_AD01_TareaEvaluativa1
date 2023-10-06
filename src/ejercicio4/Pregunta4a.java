package ejercicio4;

import java.io.*;
public class Pregunta4a {

	public static void main(String[] args) {
		//longitud del registro 4+18+20+40+20+4+4
		final int longReg = 110;
		File fichero = new File("."+ File.separator + "src" + File.separator + "ejercicio4" + File.separator + "Marvel.dat");
		
		//arrays sacados del moodle del curso
		int [] ids= {1, 2, 3, 4, 5, 6, 7};		
		String[] dnis= {"01010101A", "03030303C", "05050505E", "07070707G", "02020202B", "04040404D", "06060606F"};
		String[] noms= {"Spiderman", "Green Goblin", "Storm", "Wolverine", "Mystique", "IronMan", "Mandarin"};
		String[] identidades = {"Peter Parker", "Norman Osborn", "Ororo Munroe","James Howlett", "Raven Darkholme", "Tony Stark", "Zhang Tong"};
		String[] tipos = {"heroe","villano","heroe","heroe","villano","heroe","villano"};
		int[] pesos = {76,84,66,136,78,102,70};
		int[] alturas = {178,183,156,152,177,182,188};
		
		StringBuffer bufferDnis = null;
		StringBuffer bufferNoms = null;
		StringBuffer bufferIden = null;
		StringBuffer bufferTipos = null;
		int datos=ids.length;
		int posicion = 0;
		
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			
			for (int i=0;i<datos; i++){
				posicion=i*longReg;
				file.seek(posicion);
				
				file.writeInt(ids[i]);
				
				bufferDnis = new StringBuffer(dnis[i]);
				bufferDnis.setLength(9); 
				file.writeChars(bufferDnis.toString());
				
				bufferNoms = new StringBuffer(noms[i]);
				bufferNoms.setLength(10); 
				file.writeChars(bufferNoms.toString());
				
				bufferIden = new StringBuffer(identidades[i]);
				bufferIden.setLength(20); 
				file.writeChars(bufferIden.toString());
				
				bufferTipos = new StringBuffer(tipos[i]);
				bufferTipos.setLength(10); 
				file.writeChars(bufferTipos.toString());
				
				file.writeInt(pesos[i]);
				file.writeInt(alturas[i]);
			 }     
			file.close();
			
			System.out.println("La carga de los personajes ha terminado correctamente.");			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
