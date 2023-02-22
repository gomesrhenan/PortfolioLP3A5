package exercicio3;

public class Quadrado extends FormaGeometrica{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea(){
		return this.lado*this.lado;
	}
}
