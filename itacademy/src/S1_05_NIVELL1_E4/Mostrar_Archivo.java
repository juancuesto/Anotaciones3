package S1_05_NIVELL1_E4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Mostrar_Archivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File nuevo_archivo=new File("c:/users/juanc/desktop/java_ejemplo/Prueba2.txt");
		
		String frase="Esto es una Prueba";
		
		String ruta=nuevo_archivo.getAbsolutePath();
		
		try {
			FileWriter escribir=new FileWriter(ruta);
			escribir.write(frase);
			escribir.close();
		}catch(Exception e) {}
		
		try {
			FileReader lectura=new FileReader(ruta);
			int val=lectura.read();
			while(val!=-1 ) {
				System.out.print((char)val);
				val=lectura.read();
			}
			
		}catch(Exception e) {
			System.out.println("Error lectura");
		}
		
		

	}

}
