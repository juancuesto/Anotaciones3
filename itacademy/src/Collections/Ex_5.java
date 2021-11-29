package Collections;

//import java.util.ArrayList;
import java.util.*;

public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista1=new LinkedList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		List<Integer> lista2=new LinkedList<Integer>();
		lista2.add(6);
		lista2.add(7);
		lista2.add(8);
		lista2.add(9);
		lista2.add(10);
		Iterator<Integer> it=lista1.iterator();
		//for (Integer integer : lista1) {
		for (int i=lista1.size();i<0 ;i--) {
			
			lista2.add(it.next());
		}
			
		
		for(int j=0; j<lista2.size();j++) {
		System.out.println(lista2);
		}
		

	}

}
