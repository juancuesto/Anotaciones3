package S1_03_NIVELL3_E2;

import java.util.ArrayList;

public class Numeros {
	
	private static int TAMAÑO=3;
	int[] lista=new int[TAMAÑO];
	
	
	public static int[] redimensonArray(int[] a) {
		TAMAÑO=TAMAÑO*2;
		int[]aux=new int[TAMAÑO];
		System.arraycopy(a, 0, aux, 0, a.length);
		return aux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] miLista=new int[TAMAÑO];
		int contador=0;
		
		for(int i=0;i<TAMAÑO;i++) {
			miLista[i]=i;
			contador++;
			System.out.println(miLista[i]);
		}
		
		for(int i=3;i<12;i++) {
			if(contador>=TAMAÑO) {
				miLista=redimensonArray(miLista);	
			}
			miLista[i]=i;
			contador++;
			System.out.println(miLista[i]);
		}
		System.out.println(System.nanoTime()+"  Tiempo ejecución de la ampliacion del Array en nanosegundos");
		
		ArrayList<Integer> nuevaLista=new ArrayList<Integer>();
		
		for(int i=0;i<3;i++) {
			nuevaLista.add(i);
		}
		System.out.println(nuevaLista);
		
		for(int i=3;i<12;i++) {
			nuevaLista.add(i);
		}
		System.out.println(nuevaLista);
		
		System.out.println(System.nanoTime()+ "  Tiempo de ejecucion del ArrayList en nanosegundos");
		
		

	}

}
