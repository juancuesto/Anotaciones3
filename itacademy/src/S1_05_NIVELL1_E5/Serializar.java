package S1_05_NIVELL1_E5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serializar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1=new Empleado("Antonio", 2500);
		Empleado e2=new Empleado("Juan", 2800);
		Empleado e3=new Empleado("Maria", 3000);
		Empleado e4=new Empleado("Sandra", 2000);
		
		Empleado[] personal=new Empleado[4];
		
		personal[0]=e1;
		personal[1]=e2;
		personal[2]=e3;
		personal[3]=e4;
		
		
		for(int i=0;i<personal.length;i++) {
			System.out.println(personal[i].ToString()+" este es desde el arrayyyyy");
			
		}
		
		try {
			ObjectOutputStream escribiendo=new ObjectOutputStream(new FileOutputStream("c:/users/juanc/desktop/java_ejemplo/Prueba3.txt"));
			escribiendo.writeObject(personal);
			escribiendo.close();
			
			ObjectInputStream leyendo=new ObjectInputStream(new FileInputStream("c:/users/juanc/desktop/java_ejemplo/Prueba3.txt"));
			Empleado[] personal_recuperado=(Empleado[])leyendo.readObject();
			leyendo.close();
			
			for(Empleado e: personal_recuperado) {
				System.out.println(e.ToString());
			}
		}catch(Exception e) {
			System.out.println("Error I/O");
		}
	}
}

//--------------------------------------------------
class Empleado implements Serializable{
	
	private String nombre;
	private int sueldo;
	public Empleado(String n, int s) {
		
		nombre=n;
		sueldo=s;
	}
	
	public String ToString() {
		return "Nombre:  " + nombre +" , " + "Sueldo:  "+ sueldo;
	}
	public String dameNombre() {
		return nombre;
	}
	public int dameSueldo() {
		return sueldo;
	}
	
	
}
