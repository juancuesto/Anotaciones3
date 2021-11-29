package S1_01_E5;

public class Gat extends Animal {
	public void Correr(Double a) {
		System.out.println("el gato corre");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gat gato=new Gat();
		gato.Correr();
		gato.Correr(2);
		gato.Correr("hola");
		gato.Correr(15.0);


	}

}
