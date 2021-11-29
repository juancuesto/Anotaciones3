package S1_03_E7;

import java.util.*;
import java.util.Map.Entry;

import S1_03_E4.Empleado;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Empleado> mapa=new HashMap<String,Empleado>();
		
		Empleado e1=new Empleado("Juan");
		Empleado e2=new Empleado("Luis");
		Empleado e3=new Empleado("Maria");
		Empleado e4=new Empleado("Pedro");
		
		mapa.put("Primero", e1);
		mapa.put("Segundo", e2);
		mapa.put("Tercero", e3);
		mapa.put("Cuarto", e4);
		
		List<String> claves=new ArrayList<String>();
		
		
		for(Entry<String,Empleado> entrada: mapa.entrySet()) {
			claves.add(entrada.getKey());	
			
		}
		System.out.println(claves);
		
		//Arrays.sort(claves);
		/*String aux=null;
		for(int i=0; i<claves.size()-1;i++) {
			for(int j=1;j<claves.size();j++) {			
			if(claves.get(j-1).compareTo(claves.get(j))<0) {
				    aux=claves.get(j-1);
					claves.add((j-1), claves.get(j));
					claves.add(j, aux);
				}
			
			}
			
		}*/
		int i,j;
		String aux;
		for(i=1;i<claves.size();i++) {
			aux=claves.get(i);
			j=i-1;
			while((j>=0)&&(aux.compareTo(claves.get(j))<0)) {
				claves.add((j+1), claves.get(j));
				j--;
			}
			claves.add(j+1, aux);
		}
		System.out.println(claves);
		//System.out.println(aux);
	}

}


