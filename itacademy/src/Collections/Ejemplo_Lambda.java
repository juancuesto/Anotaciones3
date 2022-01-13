package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejemplo_Lambda implements Comparator<Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		lista.sort(new Ejemplo_Lambda());
		
		lista.forEach((n)->System.out.println(n));
		

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -(o1.compareTo(o2));
	}

}
