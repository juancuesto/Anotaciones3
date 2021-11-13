package Collections;

import java.util.*;

public class Personajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personajes x=new Personajes();
		String[] personajes={"Rambo","Rambo","James Bond","Superman","Batman","Hulk","Hulk"};
		for (int j=0; j<personajes.length;j++) {	
		String n=x.next(personajes,j);
		LinkedList<String> pLinkList=new LinkedList<String>();
		pLinkList.add(n);
		//System.out.println(n);
		iterCollection(pLinkList);
		//System.out.println(pLinkList);
		HashSet<String> pHas=new HashSet<String>();
		pHas.add(n);
		//System.out.println(pHas);
		LinkedHashSet<String> linkSet=new LinkedHashSet<String>();
		linkSet.add(n);
		//System.out.println(linkSet);
		TreeSet<String> Tset=new TreeSet<String>();
		Tset.add(n);
		//System.out.println(Tset);
		}
	}
	public static<String> void iterCollection(LinkedList<String> q) {
		Iterator<String> it=q.iterator();
		System.out.println(it.next());
	}
	
	public String next(String[] w,int p) {
		return w[p];
	}
	
}
	
	