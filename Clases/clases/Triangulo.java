package clases;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calcularPerimetro() {
		return this.lado1 + this.lado2 + this.lado3;
	}

	public double calcularArea() {

		return (Math.sqrt(3) / 4) * Math.pow(lado1, 2);
	}
}
