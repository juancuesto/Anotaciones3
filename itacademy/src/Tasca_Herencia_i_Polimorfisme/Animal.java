package Tasca_Herencia_i_Polimorfisme;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gat f=new Gat();
		f.Correr();
		f.Correr("hola");
		f.Correr(3);
		f.Correr(15.0);

	}
public void Correr() {
	System.out.println("El Animal corre:  ");
	}
public void Correr(String a) {
	System.out.println("El Animal corre 2:  " + a);
}
public void Correr(int x) {
	System.out.println("El Animal corre 3:  " + x);
}

}
class Gat extends Animal{
	
	public void Correr(double d) {
		System.out.println("El gato corre:  " + d);
	}
}
