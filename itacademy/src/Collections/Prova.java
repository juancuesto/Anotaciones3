package Collections;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ap= {2,1,9,5,3};
		for(int i=0;i<ap.length;i++) {
			System.out.println(ap[i]);
		}
		
		
		for(int i=0;i<ap.length-1;i++) { //ordenamiento por burbuja
			for(int j=1;j<ap.length;j++) {
				if(ap[j]<ap[j-1]) {
					int aux=ap[j];
					ap[j]=ap[j-1];
					ap[j-1]=aux;	
				}	
		}
		}
		System.out.println("nuevos vaoles"+"  burbuja");
		
		
		
		for(int i=0;i<ap.length;i++) {
			System.out.println(ap[i]);
		}
		
		int pos,aux,j;
		for(int i=1;i<ap.length;i++) {
			aux=ap[i];
			pos=i-1;
			while((pos>=0)&&(aux<ap[pos])) {
				ap[pos+1]=ap[pos];
				pos--;
			}
			ap[pos+1]=aux;
	}
		System.out.println("valores insercion");
		for(int i=0;i<ap.length;i++) {
			System.out.println(ap[i]);
		}
		
		//FALTA PONER ALGORITMO INSERCION
		
		System.out.println("valores seleccion");
		for(int i=0;i<ap.length;i++) {
			System.out.println(ap[i]);
		}
		
		
		

}
}
