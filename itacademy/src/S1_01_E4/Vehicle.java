package S1_01_E4;

public class Vehicle {
	public Vehicle(String c,String m) {//puedo inicializar los atributos en el constructor menos el campo static final
		color=c;
		modelo=m;
		//cilindrada=c;
	}
	private static final String cilindrada="1500";
	private final String color;
	static String modelo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("Rojo","ibiza");
		System.out.println(v1.color);
		System.out.println(v1.modelo);
		System.out.println(v1.cilindrada);

	}

}
