package S1_01_E1;

public class Vehicle {
	public Vehicle() {
		System.out.println("constructor");
	}
	public void Iniciar() {
		System.out.println("iniciado");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle();
		v1.Iniciar();
		new Vehicle();

	}

}
