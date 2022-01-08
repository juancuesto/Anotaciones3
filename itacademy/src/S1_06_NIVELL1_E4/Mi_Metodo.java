package S1_06_NIVELL1_E4;

import java.io.File;

//import S1_06_NIVELL1_E3.Persona;

public class Mi_Metodo<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pers=new Persona("Juan");
		String elem="arbol";
		File archivo=new File("formlario");
		
		f(pers,elem,archivo);
		
		f(88);
		f();
		
		

	}
	
	public static <T> void f(T ... a) {
		System.out.println("el metodo contiene los siguentes argumentos:");
		for (int i=0; i<a.length;i++) {
			System.out.println(a.toString());
		}
		
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
