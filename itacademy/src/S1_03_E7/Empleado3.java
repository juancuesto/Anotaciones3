package S1_03_E7;

public class Empleado3 {
private String nombre;
private static int contador=0;
private int id=0;
	
	public Empleado3(String e) {
		nombre=e;
		contador++;
		id=contador;
	}
	public void get() {
		System.out.println("pq coño no funcionas");
	}
	
	public String getNombre() {
		return nombre;
		
		
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		
		
		return "Empleado [nombre=" + nombre + "]";
	}

	public int hashCode() {
		return id;
	}
	

}
