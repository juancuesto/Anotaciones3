package S1_08_NIVELL1_E5;

import java.util.ArrayList;

public class Ex5 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mesos=new ArrayList<String>();
		
		mesos.add("Enero");
		mesos.add("Febrero");
		mesos.add("Marzo");
		mesos.add("Abril");
		mesos.add("Mayo");
		mesos.add("Junio");
		mesos.add("Julio");
		mesos.add("Agosto");
		mesos.add("Septiembre");
		mesos.add("Octubre");
		mesos.add("Noviembre");
		mesos.add("Diciembre");
		
		I05_InterfazFuncional e1=(V)-> {
			for(String elemento: V) {
				System.out.println(elemento);
			}
			return V;
		};
		
		e1.Imprimir5(mesos);

	}

}
