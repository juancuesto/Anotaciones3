package S1_03_NIVELL3_E1;


public class Contenedora {
	
	private int TAMAÑO=3;
	String[] lista=new String[TAMAÑO];
	private int contador=0;
	
	public Contenedora() {
		for(int i=0;i<lista.length;i++) {
		lista[i]="palabra"+"i";
		contador++;
		}	
	}
	/*public Contenedora(String[] w) {
		System.arraycopy(w, 0, lista, 0, w.length);
	}*/
	public int dameContador() {
		return contador;
	}
	public void CopiaArray(String[] arr) {
		for(int i=0;i<lista.length;i++) {
			arr[i]=lista[i];
		}
		
	}
	public String[] Add (String[] a,String palabra,int x) {
		if(palabra.length()>1) {
			a[x-1]=palabra;
			return a;
			}	
		return a;
	}
	
	public String[] redimensiArray(String[] a) {
		TAMAÑO=TAMAÑO*2;
		String[] nuevalista=new String[TAMAÑO];
		System.arraycopy(a, 0, nuevalista, 0, a.length);
		return nuevalista;
	}
	public int dameLong() {
		return TAMAÑO;
	}
	public String damePalabra(int a) {
		return lista[a];
	}
	public String[] dameArray() {
		return lista;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedora c=new Contenedora();
		
		int p=c.dameLong();
		for(int i=0;i<p;i++) {
		System.out.println(c.damePalabra(i));
		}
		System.out.println(c.dameLong());
		
		try {	
			if(c.dameLong()<=c.dameContador()) {
				String[] aux=new String[c.dameLong()];
				aux=c.redimensiArray(c.dameArray());
				c.CopiaArray(aux);
				System.out.println(c.dameLong());
			}
			c.Add(c.dameArray(), "palabra4", 3);
			System.out.println(c.damePalabra(3)+"   HA PODIDO?????????");
			
		}catch(Exception e){
			System.out.println("Errror acceso Array");
		}
		for(int i=0;i<c.dameLong();i++) {
		//System.out.println(c.damePalabra(i)+ "   array ampliado");
			System.out.println(i);
		}
		System.out.println(c.dameLong());
	}

}
