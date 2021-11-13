package Tasca_Herencia_i_Polimorfisme;

public class Amphibian {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian a1=new Amphibian();
		System.out.println(a1.MostarTamanyo(5));
		System.out.println(a1.MostarAlimentacion(5));
		Frog f1=new Frog();
		System.out.println(f1.MostrarEstado(3));
		System.out.println(f1.MostarTamanyo(1));
		System.out.println(f1.MostarAlimentacion(10));
		System.out.println(f1.Saltar());

	}
	public String MostarTamanyo(int a) {
		if(a>10) {
			return "grande";
		}else {
			return "pequeño";
		}
	}
	public String MostarAlimentacion(int al) {
		if(al>5) {
			return "carnivoro";
		}else  {
			return "herbivoro";
		}
	}

}
class Frog extends Amphibian {
	
	public String MostrarEstado(int b) {
		if(b<5) {
			return "renacuajo";
		}else if(b>=5) {
			return "adulto";
		}else {
			return null;
		}	
	}
	public String MostrarAlimentacion(int x) {
		if(x>15) {
			return "Frog carnivoro";
	}else  {
		return "Frog herbivoro";
	}
	}
	public String Saltar() {
		return "Saltar";
	}
	
}
