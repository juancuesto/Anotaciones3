package S1_03_E7;

import java.util.*;
import java.util.Map.Entry;

//import com.sun.tools.javac.code.Attribute.Array;

import S1_03_E4.Empleado;

public class MiClase {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Empleado3> mapa=new HashMap<String,Empleado3>();
		
		Empleado3 e1=new Empleado3("Pedro");
		Empleado3 e2=new Empleado3("Luis");
		Empleado3 e3=new Empleado3("Maria");
		Empleado3 e4=new Empleado3("Juan");
		
		int a=e1.getId();
		
		mapa.put("Primero", e1);
		mapa.put("Segundo", e2);
		mapa.put("Tercero", e3);
		mapa.put("Cuarto", e4);
		
		ArrayList<String> claves=new ArrayList<String>();

		for(Entry<String,Empleado3> entrada: mapa.entrySet()) {
			claves.add(entrada.getKey());	
			//System.out.println(entrada.getValue());
			//System.out.println(entrada.getKey());
			
		}
		String clave[]=new String[4];
		/*for(int i=0;i<claves.size();i++) {
			clave[i]=claves.get(i);
		}*/
		claves.toArray(clave);//copiamos el ArrayList en el Array
		for(int j=0;j<clave.length;j++) {
		System.out.println(clave[j]+"  antes de ordenar");
		}	
		
		Arrays.sort(clave);
		for(int j=0;j<clave.length;j++) {
			System.out.println(clave[j]+"  despues de ordenar");
			}
		
		ArrayList<String> claves2=new ArrayList<String>();
		
		for(int p=0;p<clave.length;p++) {
			claves2.add(clave[p]);
		}
		
		Map<String, Empleado3> mapa2=new TreeMap<String , Empleado3>();
		
		for(String claveM: claves2) {
			mapa2.put(claveM, mapa.get(claveM));
		}
		System.out.println(mapa2 );
		
		Map<String, Empleado3> mapa3=new LinkedHashMap<String, Empleado3>();
		
		
		
		for(Map.Entry<String, Empleado3> clavesL: mapa2.entrySet()) {
			mapa3.put(clavesL.getKey(),clavesL.getValue());
			String clau=clavesL.getKey();
			Empleado3 valor=clavesL.getValue();
			System.out.println("Clave= "+ clau +", Valor= "+ valor);
		}
		
		Set<String> set1=new HashSet<String>();
		
		for(Map.Entry<String, Empleado3> index: mapa3.entrySet()) {
			set1.add(index.getKey());
		}
		
		System.out.println(set1 +"Impresion desde HashSet");//NO RESPETA EL ORDEN
		
		Set<String> set2=new LinkedHashSet<String>();
		
		for(Map.Entry<String, Empleado3> index: mapa3.entrySet()) {
			set2.add(index.getKey());
		}
		
		System.out.println(set2 +"Impresion desde LinkedHashSet");//RESPETA EL ORDEN
	}
}
		
		
		
	




