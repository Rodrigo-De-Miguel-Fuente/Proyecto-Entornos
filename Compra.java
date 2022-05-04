package Compra;

import org.junit.*;

/**
 * Clase Compra
 * @author Rodrigo de Miguel Fuente
 * @version 0.0.1
 */
public class Compra {	
	
	public static void main(String[] args) {
		System.out.print(oferta(10, 10));
	}
	
	/**
	 * Metodo que calcula la oferta
	 * @param precio Precio del producto sin oferta
	 * @param oferta Porcentaje de la oferta
	 * @return Precio del producto con la oferta aplicada
	 * @throws IllegalArgumentException cuando se la cantidad de la oferta se sale de los limites establecidos
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
