package S1_08_NIVELL1_E1_LAMBDAS;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex01{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion op1=(lista)->{
			List<String> aux=new ArrayList<String>();
			//String aux=null;
			for(int i=0;i<lista.size();i++) {
				if((lista.get(i).charAt(0)=='A')&&(lista.get(i).length()==3)) {
					aux.add(lista.get(i));
				}
			}
			return aux;
		};
		
		List<String> lista=new ArrayList<String>();
		
		lista.add("Juan");
		lista.add("Ana");
		lista.add("Luis");
		lista.add("Abe");
		
		
		
		System.out.println(op1.calcular(lista));
		}

	}
