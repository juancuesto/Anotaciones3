package S1_02_E2;

//import S1_02_E1.MiError;

public class MiError extends Exception{
	public MiError(String msj) {
		super(msj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiError elerror=new MiError("el error es mio");
		String cadena=null;
		int a;
		try {
			a=cadena.compareTo("hola");
		}catch (Exception e) {
			System.out.println(elerror);
		}

	}
}
