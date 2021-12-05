package S1_03_E8;

import java.util.*;
import java.util.Map.Entry;

import S1_03_E4.Empleado;

public class Ex_8 implements Comparator {
	
	@Override
	public int compare(Object a, Object b) {
		// TODO Auto-generated method stub
		String a1=(String)a;
		String b1=(String)b;
		//return a1.nombre.compareTo(b1.nombre);
		return a1.compareTo(b1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,Empleado2> personal=new LinkedHashMap<String,Empleado2>();
		
		Empleado2 e1=new Empleado2("Juan");
		Empleado2 e2=new Empleado2("Luis");
		Empleado2 e3=new Empleado2("Maria");
		Empleado2 e4=new Empleado2("Pedro");
		
	
		
		int a =e1.hashCode();
		System.out.println(a);
		
		personal.put("Primero", e1);
		personal.put("Segundo", e2);
		personal.put("Tercero", e3);
		personal.put("Cuarto", e4);
		
		List<String> lista=new ArrayList<String>();
		
		for(Entry<String,Empleado2> entrada: personal.entrySet()) {
			lista.add(entrada.getKey());	
			
		}
		
		System.out.println(lista);
		
		Ex_8 f=new Ex_8();
		
		String menor=lista.get(0);
		String aux;
		int pos=0;
		for(int i=1;i<lista.size();i++) {
			if(f.compare(menor,lista.get(i))<0) {
				menor=lista.get(i);
				pos=i;
				for(int j=0;j<lista.size()-1;j++) {
					aux=lista.get(pos);
					lista.add(j, menor);
					lista.add(pos, aux);
					
				}
			}
			
		}
		System.out.println(lista);
	}

}
