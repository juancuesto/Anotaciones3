package S1_08_NIVELL1_E4;

import java.util.ArrayList;

import S1_08_NIVELL1_E3.I03_InterfazFuncional;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String[] lista= {"papo","extraordinario","pepo","mama","listado","cositas"};
		
		I04_InterfazFuncional e1=(V)->{
			
			ArrayList<String> aux=new ArrayList();
			for(String elemento: V) {
				if(elemento.length()>5) {
					aux.add(elemento);
				}
			}
			return aux;
		};
		
		ArrayList<String> miLista=new ArrayList();
		miLista=e1.Imprimir4(lista);
		
		for(String elemento: miLista) {
			System.out.println(elemento);
		}

	}


	}


