package S1_06_NIVELL1_E3;

import java.io.File;

public class Metodo_Gener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona pers=new Persona("Juan");
		String elem="arbol";
		File archivo=new File("formlario");
		
		
		System.out.println(f(archivo,pers.getNombre(),elem));

	}
	public static <T> T f(T a,T b,T c) {
		return (T) (" "+ a +"  " + b + "  "+ c);
		
	}

}

class Persona{
	private String nombre;
	
	public Persona(String n) {
		
		nombre=n;
	}
	public void setNombre(String n) {
		nombre=n;
		}
	public String getNombre() {
		return nombre;
	}
}
