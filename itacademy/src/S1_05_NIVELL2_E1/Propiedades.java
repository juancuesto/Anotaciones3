package S1_05_NIVELL2_E1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//import S1_05_NIVELL1_E3.Escribiendo;

public class Propiedades {
	
	public static final String RUTA="c:/users/juanc/desktop/java_ejemplo/configuracion_propiedades.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LECTURA DE ARCHIVO DE PROPIEDADES
		Properties prop=new Properties();
		
		prop.setProperty("Directorio a leer", "c:/users/juanc/desktop/java_ejemplo");
		prop.setProperty("nombre i directorio resultante", "c:/users/juanc/desktop/java_ejemplo/pruebas333.txt");
		
		//System.out.println(prop);
//--------------------------------------------------------------------------------------------		
		File archivo=new File(prop.getProperty("Directorio a leer"));
		
		System.out.println(archivo.getAbsolutePath());
		
		String[] nombre_archivos=archivo.list();
		
		String[] datos=new String[nombre_archivos.length];
		String[] datos2=new String[0];
		
		for(int i=0;i<nombre_archivos.length;i++) {
			if(archivo.isFile()) {
				System.out.println(nombre_archivos[i]+"Es un Archivo");
			}else {
				System.out.println(nombre_archivos[i]+"Es un directorio");
			}
			
			datos[i]=nombre_archivos[i];
			
			File f=new File(archivo.getAbsolutePath(),nombre_archivos[i]);
			
			if(f.isDirectory()) {
				String[] p=f.list();
				datos2=new String[p.length];
				
				for(int j=0;j<p.length;j++) {
					System.out.println(p[j]+"   Subcarpeta");
					datos2[j]=p[j];
				}	
			}		
		}
		int longitud_total=datos.length+datos2.length;
		
		String[] datos_escritura=new String[longitud_total];
		for(int i=0;i<datos.length;i++) {
			datos_escritura[i]=datos[i];
			
		}
		for(int j=0;j<datos2.length;j++) {
			datos_escritura[datos.length+j]=datos2[j];
			
		}
		
		File ruta=new File(prop.getProperty("nombre i directorio resultante"));
		try {
			ruta.createNewFile();
		}catch(IOException e) {
			System.out.println("error al crear archivo");
		}
		Escribiendo es=new Escribiendo();
		
		es.Escribir(ruta.getAbsolutePath(), datos_escritura);//video 160
		
	}
	}
class Escribiendo{
	
	public void Escribir(String ruta_archivo,String[] archivo_esc) {
		
		try {
			FileWriter escritura=new FileWriter(ruta_archivo);
			
			for(int i=0;i<archivo_esc.length;i++) {
				
				escritura.write(archivo_esc[i]);
			}
			escritura.close();
		}catch(IOException e) {
			System.out.println("fallo al escribir");
		}
		
	}


	}


