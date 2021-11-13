package Tasca_Herencia_i_Polimorfisme;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Base b=new Base();
		System.out.println(b.metodo2());
		Derivada dev=new Derivada();
		System.out.println(dev.metodo1());*/
		Derivada dev1=new Derivada();
		Base x=(Base)dev1;
		System.out.println(x.metodo2());
		System.out.println(dev1.metodo2());
		
		Base base=new Base();
		//Base base2=(Derivada)base; No es posible hacer este casting
		//
		System.out.println(base.metodo2());
		//System.out.println(base2.metodo2());

	}
	public String metodo1() {
		
		return metodo2();
	}
	public String metodo2() {
		return "metodo 2";
	}

}
class Derivada extends Base{
	public String metodo2() {
		return "metodo 2 Derivada";
	}
}
