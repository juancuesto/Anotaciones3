package S1_06_NIVELL1_E2;

import java.io.File;
import java.io.FileWriter;


public class GenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per=new Persona("Ana");
		
		Mi_Clase<String> clase1=new Mi_Clase();
		Mi_Clase<Persona> clase2=new Mi_Clase();
		Mi_Clase<File> clase3=new Mi_Clase();
		
		clase1.setPrimero("juan");
		clase2.setPrimero(per);
		clase3.setPrimero(new File("archivo"));
		
		/*System.out.println(clase1.getPrimeo());
		System.out.println(clase2.getPrimeo().ToString());
		System.out.println(clase3.getPrimeo());
		
		System.out.println("------------------------------------");
		System.out.println(f(clase1).getPrimeo());
		System.out.println(f(clase2).getPrimeo().ToString());
		System.out.println(f(clase3).getPrimeo());*/
		
		System.out.println(f(clase1.getPrimeo(),clase2.getPrimeo().ToString(),clase3.getPrimeo()));
		System.out.println(f(55,new Persona("jose Luis").ToString(),new File("pepep")));
	}
	public static <T> T f(T a,T b,T c) {
		return (T) ("primer elemento "+ a +"  segundo elem   " + b + "  tercer elem   "+ c);
		
	}
	
}

class Persona{
	
	private String nombre;
	
	public Persona(String n) {
		
		nombre=n;
	}
	public String ToString() {
		return nombre;
	}
	
}

