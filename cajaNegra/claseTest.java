package Compra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OfertaTest {

	@Test
	public void testOfertaBien() {
		float resultado = Compra.oferta(2, 10);
		float esperado = 1.8f; // 2 menos 10% de 2 = 1.8
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testOfertaMal() {
		float resultado = Compra.oferta(5, 40);
		float esperado = 1.8f; // 5 menos 40% de 5 = 3.0
		assertNotEquals(esperado, resultado);
	}

}
