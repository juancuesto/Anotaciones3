package S1_01_E3;

public class MiClase {
	static {
		System.out.println("solo se imprime 1 vez");
	}
	{
		System.out.println("se imprime antes del constructor");
	}
	
	public MiClase(){
		System.out.println("constructor");
	}
	public static void Saludos() {
		System.out.println("hola desde el metodo saludos");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MiClase();
		Saludos();
		

	}

}
