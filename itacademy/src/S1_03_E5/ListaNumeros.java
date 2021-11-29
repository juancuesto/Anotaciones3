package S1_03_E5;



import java.util.*;

public class ListaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista1=new ArrayList<Integer>();
		
		lista1.add(1);
		lista1.add(3);
		lista1.add(5);
		lista1.add(7);
		
		List<Integer> lista2=new ArrayList<Integer>();
		
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		lista2.add(8);
		
		System.out.println(lista1);
		System.out.println(lista2);
		
		ListIterator<Integer> itr1=lista1.listIterator();	
		ListIterator<Integer> itr2=lista2.listIterator();
		while(itr2.hasNext()) {
			itr2.next();
		}
		
		while(itr1.hasNext()) {
			if(itr2.hasPrevious()) {
				itr1.next();
			}
			itr1.add(itr2.previous());
		}
		System.out.println(lista1);
		
		
		while(itr1.hasNext()) { //no entiendo pq en este caso se repiten 2 elementos(4,8)
			itr1.next();
		}
		while(itr2.hasNext()) {
			if(itr1.hasPrevious()) {
				itr2.next();
			}
			itr1.add(itr2.next());
		}
		System.out.println(lista1);

	}

}
