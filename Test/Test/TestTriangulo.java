package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Triangulo;

public class TestTriangulo {

	@Test
	public void CalcularPerimetroDeUnTriangulo() {
		Triangulo triangulo1 = new Triangulo(2.0, 2.0, 2.0, 4.0);
		Double resultadoEsperado = 6.0;
		Double resultadoObtenido = triangulo1.calcularPerimetro();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void CalcularAreaDeUnTriangulo() {
		Triangulo triangulo1 = new Triangulo(2.0, 2.0, 2.0, 4.0);
		Double resultadoEsperado = 4.0;
		Double resultadoObtenido = triangulo1.calcularArea();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
