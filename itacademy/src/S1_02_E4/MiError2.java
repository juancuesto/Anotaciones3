package S1_02_E4;

import Exception.MiError;

public class MiError2 extends Exception{
	String mensaje;
	public MiError2(String msj) {
		mensaje=msj;
	}
	public String MostrarCadena() {
		return mensaje;
	}
	static void f() throws MiError2{
		throw new MiError2("Error originado en f()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiError2 err=new MiError2("Los errores");
		System.out.println(err.MostrarCadena());
		try {
			f();
		}catch(MiError2 e) {
			System.out.println(err);
			e.printStackTrace();
			
		}

	}

}
