package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangulo {

	@Test
	public void CalcularPerimetroDeUnTriangulo() {
		ClaseTriangulo triangulo1 = new ClaseTriangulo();
		Double resultadoEsperado = 6;
		Double resultadoObtenido = triangulo1.calcularPerimetro(2.0, 2.0, 2.0);
      assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void CalcularPerimetroDeUnTriangulo() {
		ClaseTriangulo triangulo1 = new ClaseTriangulo();
		Double resultadoEsperado = 8;
		Double resultadoObtenido = triangulo1.calcularPerimetro(8.0, 2.0);
      assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
