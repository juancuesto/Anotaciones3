package S1_02_E5;

public class Represa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valors= {1,2,3,4,5};
		int i=10;
		while(i>=0) {
		try {
			 
				System.out.println(valors[i]);
				break;
				
			
		}catch(Exception e) {
			System.out.println("Error de acceso");
			
		}
		i--;
		}
		

	}

}
