package S1_06_NIVELL2_E2;

public class ClaseGenerica {
	
	public<T> void metodo1(T a) {
		System.out.println("metodo1");
	}
	public<T> void metodo2(T b) {
		System.out.println("metodo2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementadoraDoble imple=new ImplementadoraDoble();
		
		Interficie1 int1=new ImplementadoraDoble();
		Interficie2 int2=new ImplementadoraDoble();
		
		imple.metodo1(int1);
		imple.metodo2(int2);
		
		
		
		
		
		
		

	}

}
