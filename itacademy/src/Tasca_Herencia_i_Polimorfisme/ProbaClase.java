package Tasca_Herencia_i_Polimorfisme;

public class ProbaClase {
	static {//bloque estatico de inicilizacion
		System.out.println("solo saldre una vez");
	}
	{//bloque de inicializacion de instancia
		System.out.println("saldre antes de ejecutar el constructor");
	}
	public ProbaClase() {
		System.out.println("constructor");
	}
	public static void saluda() {
		System.out.println("saludando desde metodo estatico");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProbaClase();
		ProbaClase.saluda();
		new ProbaClase();

	}

}
