package S1_01_E7;

import S1_01_E6.Amphibian;
//import S1_01_E6.Frog;

public class Frog extends Amphibian{
	public void Saltar() {
		System.out.println("metode Saltar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian f=new Frog();
		f.Menjar();
		f.Moure();
		f.Respirar();
		//f.saltar(); despues de hacer la generalizacion de la clase Forg a Amphibian, no podemos llamar a la clase Saltar pq no
		// pertenece a la clase Amphibian.
		

	}

}
