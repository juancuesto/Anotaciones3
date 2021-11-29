package S1_02_E1;

public class MiError extends Exception {
	public MiError(String msj) {
		super(msj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiError elerror=new MiError("el error es mio");
		int valors[]= {1,2,3,4};
		try {
			System.out.println(valors[10]);
		}catch (Exception e) {
			System.out.println(elerror);
		}finally {
			System.out.println("Finally");
		}

	}

}
