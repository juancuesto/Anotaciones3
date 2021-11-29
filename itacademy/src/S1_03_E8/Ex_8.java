package S1_03_E8;

import java.util.*;
import java.util.Map.Entry;

import S1_03_E4.Empleado;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,Empleado2> personal=new LinkedHashMap<String,Empleado2>();
		
		Empleado2 e1=new Empleado2("Juan");
		Empleado2 e2=new Empleado2("Luis");
		Empleado2 e3=new Empleado2("Maria");
		Empleado2 e4=new Empleado2("Pedro");
		
		personal.put("Primero", e1);
		personal.put("Segundo", e2);
		personal.put("Tercero", e3);
		personal.put("Cuarto", e4);
		
		List<String> lista=new ArrayList<String>();
		
		for(Entry<String,Empleado2> entrada: personal.entrySet()) {
			lista.add(entrada.getKey());	
			
		}
		System.out.println(lista);
		System.out.println(personal);
		
		for(int i=0;i<lista.size()-1;i++) {
		for(int j=1;j<lista.size();j++) {
			if(lista.get(j-1).compareTo(lista.get(j))>0) {
				String aux=lista.get(j-1);
				lista.add((j-1),lista.get(j));
				lista.add(j, aux);
				
			}
		}
		
	}
		

	}

}
