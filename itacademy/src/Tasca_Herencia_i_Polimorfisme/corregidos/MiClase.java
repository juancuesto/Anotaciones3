
public class MiClase {

	static {
		System.out.println("Solo saldré una vez");

	}

	{
		System.out.println("Saldré antes de ejecutar el constructor");
	}

	public MiClase() {
		System.out.println("Constructor");
	}

	public static void saluda() {
		System.out.println("Saludando desde método estático");
	}

}