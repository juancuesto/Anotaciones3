package S1_06_NIVELL1_E1;

public class NoGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] personal=new Persona[3];
		
		personal[0]=new Persona("Juan");
		personal[1]=new Persona("Ana");
		personal[2]=new Persona("Luis");
		
		System.out.println("Nombre: "+personal[0].dameNombre());
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
	public String dameNombre() {
		return nombre;
	}
	
}
