package S1_06_NIVELL2_E1;

public class Generica {
	
	public <T> void  MetodoGenerico(T a) {
		System.out.println("Metodo Generico");
		((Implementadora)a).Metodo1();
		((Implementadora)a).Metodo2();
		((Implementadora)a).Metodo3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementadora imp=new Implementadora();
		Generica gen=new Generica();
		
		gen.MetodoGenerico(imp);
		//imp.Metodo1();

	}

}
