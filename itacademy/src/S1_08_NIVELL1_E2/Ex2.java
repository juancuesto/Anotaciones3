package S1_08_NIVELL1_E2;

import java.util.*;

public class Ex2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] valores={1,2,3,4,5,6};
		
		I02_InterfazFuncional e1=(v)->{
			
			String aux=null;
			for(int e: v) {
				
				if(e%2==0) {
					String a=String.valueOf(e);
					aux=aux+"e"+a+",";
				}else {
					String p=String.valueOf(e);
					aux=aux+"o"+p+",";
				}
				}
			return aux;
		};
		
		String res=e1.Ordenar(valores);
		System.out.println(res);

	}

}
