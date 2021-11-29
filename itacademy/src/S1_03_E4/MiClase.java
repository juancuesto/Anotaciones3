package S1_03_E4;

import java.util.*;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> personal=new ArrayList<String>();
		personal.add("Juan");
		personal.add("Luis");
		personal.add("Maria");
		personal.add("Pedro");
		
		for(int i=0;i<personal.size();i++) {
			iterCollection(personal);
		}
	}
	public static<T> void iterCollection(Collection<T> c) {
		Iterator<T> it=c.iterator();
		while(it.hasNext())
		System.out.println(it.next());	
	}

}
