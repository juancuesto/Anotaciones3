package S1_03_E3;

import java.util.*;
import java.util.Iterator;

public class Generadora {
	private String nombre;
	int i=0;
	String[] lista= {"Superman","Batman","Hulk","Ironman"};
	
	private int longitud=lista.length;
	
	public int dameLongitud() {
		return longitud;
	}
	public String SeguentPersonatge() {
			i++;
			return lista[i-1];
				
		}
		
	}
	


