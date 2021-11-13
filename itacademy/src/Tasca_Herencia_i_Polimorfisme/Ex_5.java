package Tasca_Herencia_i_Polimorfisme;

public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_5 col=new Ex_5();
		
		System.out.println(col.MostarColor());
		System.out.println(col.MostarColor("Rojo"));
		System.out.println(col.MostarColor(5));
		System.out.println(col.MostarColor(2));
		Color c1=new Color();
		System.out.println(c1.MostrarColor(11.0));
		System.out.println(c1.MostrarColor(1.0));
		

	}
	
		
	public String MostarColor() {
		return "Rosa";
	}
	public String MostarColor(String R) {
		return R;
	}
	public String MostarColor(int a ) {
		if(a>2) {
			return "Azul";
		}else {
			return "Verde";
		}
	}
	
}
class Color extends Ex_5{

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String MostrarColor(double d) {
		if(d>10) {
			return "Amarillo";
		}else {
			return "negro";
		}
	}
	
}
