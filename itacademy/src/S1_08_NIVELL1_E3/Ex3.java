package S1_08_NIVELL1_E3;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lista= {"papo","coco","pepo","mama","lista","cosa"};
		
		I03_InterfazFuncional e1=(V)->{
			
			ArrayList<String> aux=new ArrayList();
			for(String elemento: V) {
				for(int i=0;i<elemento.length();i++) {
					if(elemento.charAt(i)=='o') {
						aux.add(elemento);	
						break;
					}
				}
			}
			return aux;
		};
		
		ArrayList<String> miLista=new ArrayList();
		miLista=e1.Imprimir(lista);
		
		for(String elemento: miLista) {
			System.out.println(elemento);
		}

	}

}
