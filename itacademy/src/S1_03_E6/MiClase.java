package S1_03_E6;

import java.util.*;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista=new LinkedList<Integer>();
		
		ListIterator<Integer> it=lista.listIterator();
		
		it.add(5);
		it.add(35);
		it.add(16);
		
		System.out.println(lista);
		System.out.println(it.previous());

	}
	

}
