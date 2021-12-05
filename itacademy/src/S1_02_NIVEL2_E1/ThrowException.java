package S1_02_NIVEL2_E1;

public class ThrowException extends Exception{
	
	public void f() {
		try {
		g();
	}catch(ThrowException e) {
		System.out.println("Error desde f()");
	}
	}
	public static void g() throws ThrowException{
		
		System.out.println("Error desde g()");
		throw new ThrowException();
		
	}	
	public static void main(String[] args) {
		
		ThrowException  miError=new ThrowException();
		
		miError.f();
		
	}

}
