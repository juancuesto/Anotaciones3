package S1_03_E8;

import java.util.Comparator;

public class Empleado2  {
	
	private String nombre;
	private static int contador=0;
	private int id=0;
	
	public Empleado2(String e) {
		nombre=e;
		id=contador;
		contador++;
	}
	
	public String getNombre() {
		
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre ;
	}
	
	public int hashCode() {
		return id;
	}

	
	
	

}
