package Tasca_Herencia_i_Polimorfisme;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("Ford","Focus");
		System.out.println(v1.Iniciar());
		System.out.println(v1.Acelerar());
		System.out.println(Vehicle.Parar());
		System.out.println(v1.color);
		System.out.println(Vehicle.cilindrada);
		System.out.println(Vehicle.modelo);
		
		

	}
	public Vehicle(String M,String Mod) {
		marca=M;
		modelo=Mod; //en el constructor se puede inicializar el atributo static pero no los final pq ya estan inicializados y no se pueden cambiar
		
	}
	private String marca;
	private static final String cilindrada="1500";
	private static String modelo;
	private final String color="Azul";
	
	public String Iniciar() {
		return marca + "\t" + modelo + "\t" + color + "\t" + cilindrada ;
	}
	public static String Parar() {
		return "parar";
	}
	public String Acelerar() {
		return "acelerar";
	}

}
