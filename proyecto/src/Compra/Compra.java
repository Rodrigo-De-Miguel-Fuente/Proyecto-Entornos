package Compra;

import org.junit.*;


public class Compra {	
	
	public static void main(String[] args) {
		System.out.print(oferta(10, 10));
	}
	
	/**
	 * 
	 * @param precio
	 * @param oferta
	 * @return
	 */
	public static float oferta(float precio, float oferta) {
		if (oferta > 100) {
			throw new IllegalArgumentException("Oferta no puede ser mayor que 100");
		}else if (oferta < 0) {
			throw new IllegalArgumentException("Oferta no puede ser menor que 0");
		}else{
			return (precio - precio*(oferta/100));
		}
	}
}
