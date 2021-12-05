package Collections;

public class Proba2 {//ordenar array de strings
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista[]= {"Maria","Pedro","Luis2","Juan","Antonio"};
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		String aux;
		for(int i=0;i<lista.length-1;i++) { //ordenamiento por burbuja
			for(int j=1;j<lista.length;j++) {
				if(lista[j-1].compareTo(lista[j])>0) {
					aux=lista[j];
					lista[j]=lista[j-1];
					lista[j-1]=aux;	
				}	
		}
		}
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		
		

	}

}
