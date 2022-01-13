package S1_08_NIVELL1_E2;

public class Ex2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valores[]={1,2,3,4,5,6};
		
		I02_InterfazFuncional e1=(v)->{
			
			String aux=null;
			for(int e: v) {
				if(e%2==0) {
					aux=aux+"e"+(String)e;
				}else {
					aux=aux+"o"+(String)e;
				}
			}
			return aux;
			
		};
		
		e1.Ordenar(valores)

	}

}
