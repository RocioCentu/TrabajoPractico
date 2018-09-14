package clases;

public class ClaseCirculo {
	private Double radio;
	
	public Double calcularPerimetroDeUnCirculo(Double radio) {
		return ( (2)* (Math.PI)* (radio));
	}
	public Double calcularAreaDeUnCirculo(Double radio) {
		return ( (2)* Math.pow(radio, 2));
	}
}
