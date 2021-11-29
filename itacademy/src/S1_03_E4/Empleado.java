package S1_03_E4;

import java.util.*;

public class Empleado {

	private String nombre;
	
	public Empleado(String e) {
		nombre=e;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	
	
}
