package S1_03_NIVELL3_E2;

import java.util.ArrayList;

public class Numeros {
	
	private static int TAMA�O=3;
	int[] lista=new int[TAMA�O];
	
	
	public static int[] redimensonArray(int[] a) {
		TAMA�O=TAMA�O*2;
		int[]aux=new int[TAMA�O];
		System.arraycopy(a, 0, aux, 0, a.length);
		return aux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] miLista=new int[TAMA�O];
		int contador=0;
		
		for(int i=0;i<TAMA�O;i++) {
			miLista[i]=i;
			contador++;
			System.out.println(miLista[i]);
		}
		
		for(int i=3;i<12;i++) {
			if(contador>=TAMA�O) {
				miLista=redimensonArray(miLista);	
			}
			miLista[i]=i;
			contador++;
			System.out.println(miLista[i]);
		}
		System.out.println(System.nanoTime()+"  Tiempo ejecuci�n de la ampliacion del Array en nanosegundos");
		
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
