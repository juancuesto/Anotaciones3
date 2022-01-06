package S1_05_NIVELL1_E1;

import java.io.File;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo=new File("c:/users/juanc/desktop/java_ejemplo");
		
		System.out.println(archivo.getAbsolutePath());
		
		String[] nombre_archivos=archivo.list();
		for(int i=0;i<nombre_archivos.length;i++) {
			System.out.println(nombre_archivos[i]);
		}

	}

}
