package Collections;

public class proba3 {
	
	public static int[] redimenArray(int[] arreglo) {
		int[] nuevoArray=new int[arreglo.length*2];
		System.arraycopy(arreglo, 0, nuevoArray, 0, arreglo.length);
		return nuevoArray;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arreglo=new int[5];
		int contador=0;
		
		for(int i=0;i<arreglo.length;i++) {
			arreglo[i]=i;	
			contador++;
			System.out.println(arreglo[i]);
		}
		
		//int[] arreglo1=new int[arreglo.length];
		
		for(int i=0;i<15;i++) {
			if(contador>=arreglo.length) {
				arreglo=redimenArray(arreglo);
			}
			arreglo[i]=i;
			contador++;
			System.out.println(arreglo[i]+ "    array redimensionado");
		}
		System.out.println(contador);
		System.out.println(arreglo.length);
		
		

	}

}
