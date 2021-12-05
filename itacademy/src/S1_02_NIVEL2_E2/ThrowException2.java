package S1_02_NIVEL2_E2;

import S1_02_NIVEL2_E1.ThrowException;

public class ThrowException2 {
	
	public void f() {
		try {
			g();
	}catch(IndexOutOfBoundsException e) {
		System.out.println("Error desde f()");
	}
	}
	public static void g() {
		
		System.out.println("Error desde g()");
		int valores[]= {1,2,3,4};
		int a=valores[7];
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException  miError=new ThrowException();
		
		miError.f();

	}

}
