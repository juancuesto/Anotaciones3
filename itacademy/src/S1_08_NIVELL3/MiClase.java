package S1_08_NIVELL3;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="cadena";
		
		I007_InferfazFuncional e1=(V)->{
			String invertida="";
			for (int i=V.length()-1; i>=0;i--){
				
				invertida+=V.charAt(i);
					}
			return invertida;
		};
		System.out.println(e1.reverse(a));
		

	}

}
