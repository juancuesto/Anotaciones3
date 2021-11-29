package S1_01_E8;

import S1_01_E6.Amphibian;
//import S1_01_E7.Frog;

public class Frog extends Amphibian{
	public void Moure() {
		System.out.println("metode Moure Frog");
	}
	public void Respirar() {
		System.out.println("metode Respirar Frog");
	}
	public void Menjar() {
		System.out.println("metode Menjar Frog");
	}
	public void Saltar() {
		System.out.println("metode Saltar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Amphibian f=new Frog();
		f.Menjar();
		f.Moure();
		f.Respirar();*/
		//f.Saltar(); el metodo frog sigue dando error despues de la generalizacion.
		Frog F23=new Frog();
		F23.Menjar();
		F23.Moure();
		F23.Respirar();
		F23.Saltar();//sino hacemos la generalizacion en la clase Frog funcionan todos os metodos.

	}
	

}
