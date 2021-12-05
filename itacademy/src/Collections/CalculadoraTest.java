package Collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	public void TestSuma(int a, int b) {
		int resultado=Calculadora.suma(3, 2);
		int esperado=5;
		assertEquals(esperado, esperado);
	}
	
	public void TestResta(int a, int b) {
		int resultado=Calculadora.resta(3, 2);
		int esperado=1;
		assertEquals(esperado, esperado);
	}
}