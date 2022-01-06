package S1_05_NIVELL1_E2;

import java.io.*;

public class Acceso_Fiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo=new File("c:/users/juanc/desktop/java_ejemplo");
		
		System.out.println(archivo.getAbsolutePath());
		
		String[] nombre_archivos=archivo.list();
		for(int i=0;i<nombre_archivos.length;i++) {
			
			System.out.println(nombre_archivos[i]);
			
			File f=new File(archivo.getAbsolutePath(),nombre_archivos[i]);
			
	if(f.isDirectory()) {
		String[] p=f.list();
		for(int j=0;j<p.length;j++) {
			System.out.println(p[j]+"   Subcarpeta");
		}
		
	}
			
			
		}

	}

	}

