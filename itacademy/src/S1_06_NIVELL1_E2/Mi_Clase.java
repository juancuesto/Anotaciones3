package S1_06_NIVELL1_E2;

public class Mi_Clase<T> {
	
	private T primero;
	
	public Mi_Clase() {
		
		primero=null;
	}
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
	}
	
	public T getPrimeo() {
		return primero;
	}

	
}

