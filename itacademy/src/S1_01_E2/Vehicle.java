package S1_01_E2;

public class Vehicle {
	public Vehicle() {
		System.out.println("constructor");
	}
	public void Iniciar() {
		System.out.println("iniciado");
	}
	public static void Parar() {
		System.out.println("Esoy parando");
	}
	public void Acelerar() {
		System.out.println("Estor acelerando");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle();
		v1.Iniciar();
		new Vehicle();
		v1.Acelerar();
		Parar();
	}

}
