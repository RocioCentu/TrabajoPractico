package clases;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcularPerimetroDeUnCirculo() {
		
		return ( (2)* (Math.PI)* (this.radio));
	}
	public Double calcularAreaDeUnCirculo() {
		return ( (2)* Math.pow(this.radio, 2));
	}
}
