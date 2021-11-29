package Exception;

public class MiError extends Exception {
	
	public MiError() {}
	public MiError(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiError elerror=new MiError("El error es mio");
		//elerror=null;
		
		try {
			f();
			// elerror.MiMetodo();
		} catch (MiError e) {
			// TODO Auto-generated catch block
			System.out.println(elerror);
			e.printStackTrace();
		}

	}
	static void f() throws MiError{
		throw new MiError("Error originado en f()");
	}
	public void MiMetodo() {
		System.out.println("Hola");
	}

}
