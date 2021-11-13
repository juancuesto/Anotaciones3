package Tasca_Herencia_i_Polimorfisme;

public class Rossegador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ratoli rat=new Ratoli();
		Jerbu jer=new Jerbu();
		Hamster ham=new Hamster();
		Rossegador[] valors= {rat,jer,ham};
		for(int i=0;i<valors.length;i++) {
			System.out.println(valors[i].Ensumar());
			System.out.println(valors[i].Rosegar());
			System.out.println(valors[i].Correr());
		}

	}
		public String Ensumar() {
			return "El Rossegador Ensuma";
		}
		public String Rosegar() {
			return "El Rossegador Rosega";
		}
		public String Correr() {
			return "El Rosegador Corre";
		}
	}

	class Ratoli extends Rossegador{
		public String Ensumar() {
			return "El Ratoli Ensuma";
		}
		public String Rosegar() {
			return "El Ratoli Rosega";
		}
		public String Correr() {
			return "El Ratoli Corre";
		}
	}
	class Jerbu extends Rossegador{
		public String Ensumar() {
			return "El Jerbu Ensuma";
		}
		public String Rosegar() {
			return "El Jerbu rosega";
		}
		public String Correr() {
			return "El Jerbur Corre";
		}
	}
	class Hamster extends Rossegador{
		public String Ensumar() {
			return "El Hamster Ensuma";
		}
		public String Rosegar() {
			return "El Hamster Rosega";
		}
		public String Correr() {
			return "El Hamster Corre";
		}
	}


