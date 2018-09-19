package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Circulo;

public class CirculoTest {
	
	@Test
	public void paraUnCirculoDeRadio8SuPerimetroEs50con265() {
		Circulo miCirculo = new Circulo(8d);
		double perimetroEsperado = 50.26d;
		
		assertEquals(perimetroEsperado, miCirculo.calcularPerimetroDeUnCirculo(), 0.1);
	}
	
	@Test
	public void paraUnCirculoDeRadio2SuAreaDebeSer12con56() {
		Circulo miCirculo = new Circulo(2d);
		double areaEsperada = 12.56d;
		
		assertEquals(areaEsperada, miCirculo.calcularAreaDeUnCirculo(), 0.1);
	}
}
