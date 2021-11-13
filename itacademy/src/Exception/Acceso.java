package Exception;

public class Acceso{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] valors= {1,2,3};
		System.out.println(valors[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("El acceso no es posible");
		}finally {
			System.out.println("Finally");
		}
		            

	}

}
 