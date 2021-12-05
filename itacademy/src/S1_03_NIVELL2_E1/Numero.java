package S1_03_NIVELL2_E1;

import java.util.PriorityQueue;

public class Numero {
	
	public static int crearNum() {
		
		return (int)(Math.random()*100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<6;i++) {
			
			pq.add(crearNum());
		}
		System.out.println(pq);
		for(int j=0;j<pq.size()-1;j++) {// NO ENTIENDO PQ NO FUNCIONA EL METODO SIZE DE PRIORITYQUEUE
			System.out.println(pq.poll());
		}
		System.out.println("Numero de elementos  "+pq.size());
		for(int j=0;j<6;j++) {
			System.out.println(pq.poll());
		}
		System.out.println("Numero de elementos en realidad  "+pq.size());
		
		
		}

}
