package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Triangulo;

public class TestTriangulo {

	@Test
	public void CalcularPerimetroDeUnTriangulo() {
		Triangulo triangulo1 = new Triangulo();
		Double resultadoEsperado = 6.0;
		Double resultadoObtenido = triangulo1.calcularPerimetro(2.0, 2.0, 2.0);
      assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
