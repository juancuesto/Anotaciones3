package Exception;

public class Reperesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		
		while(i<0) {
		try {
			int[] valors= {1,2,3};
			System.out.println(valors[5]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("El acceso no es posible");
			}
		i--;
		}

	}

}
