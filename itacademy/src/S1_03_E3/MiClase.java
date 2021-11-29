package S1_03_E3;

import java.util.*;

public class MiClase {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Generadora g1=new Generadora();
		ArrayList<String> lista1=new ArrayList<String>();// ArrayList deja repetir elementos
		for(int i=0;i<g1.dameLongitud();i++) {
			lista1.add(g1.SeguentPersonatge());
		}
		lista1.add("Batman");
		
		Iterator<String> it=lista1.iterator();
		
		System.out.println(lista1);
		for(int i=0;i<6;i++) {
			if(it.hasNext()) {
			System.out.println(it.next()+ "  lista1");
		}else {
			it=lista1.iterator();
			System.out.println(it.next()+"   lista1");
		}
		
		}
		Generadora g2=new Generadora();
		LinkedList<String> lista2=new LinkedList<String>(); // LinkedList deja repetir elementos
		
		for(int i=0;i<g2.dameLongitud();i++) {
			lista2.add(g2.SeguentPersonatge());
		}
		lista2.add("Batman");
		
		Iterator<String> it2=lista2.iterator();
		
		for(int i=0;i<6;i++) {
			if(it2.hasNext()) {
			System.out.println(it2.next()+ "  lista2");
		}else {
			it2=lista2.iterator();
			System.out.println(it2.next()+ "  lista2");
		}
		
		}
		Generadora g3=new Generadora();
		HashSet<String> lista3=new HashSet<String>();//en este caso cambia el orden de algun elemento(Hulk por Ironman)
														//HashSet no deja repetir elementos
		for(int i=0;i<g3.dameLongitud();i++) {
			lista3.add(g3.SeguentPersonatge());
		}
		lista3.add("Batman");
		
		Iterator<String> it3=lista3.iterator();
		
		for(int i=0;i<6;i++) {
			if(it3.hasNext()) {
			System.out.println(it3.next()+ "  lista3");
		}else {
			it3=lista3.iterator();
			System.out.println(it3.next()+ "  lista3");
		}
		}
		
		Generadora g4=new Generadora();
		LinkedHashSet<String> lista4=new LinkedHashSet<String>();//en este caso cambia el orden de algun elemento (Hulk por Ironman)
																	//LinkedHashSet no deja repetir elementos
		for(int i=0;i<g4.dameLongitud();i++) {
			lista4.add(g4.SeguentPersonatge());
		}
		lista4.add("Batman");
		
		Iterator<String> it4=lista4.iterator();
		
		for(int i=0;i<6;i++) {
			if(it4.hasNext()) {
			System.out.println(it4.next()+ "  lista4");
		}else {
			it4=lista4.iterator();
			System.out.println(it4.next()+ "  lista4");
		}
		}
		
		Generadora g5=new Generadora();
		TreeSet<String> lista5=new TreeSet<String>();//Ordena de menor a mayor los elementos de la colección
														//TreeSet no deja repetir elementos
		for(int i=0;i<g5.dameLongitud();i++) {
			lista5.add(g5.SeguentPersonatge());
		}
		lista5.add("Batman");
		
		Iterator<String> it5=lista5.iterator();
		
		for(int i=0;i<6;i++) {
			if(it5.hasNext()) {
			System.out.println(it5.next()+ "  lista5");
		}else {
			it5=lista5.iterator();
			System.out.println(it5.next()+ "  lista5");
		}
		}
		

	}
}


