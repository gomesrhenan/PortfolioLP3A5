package exercicio3;

public class Circulo extends FormaGeometrica{
	private static final double pi = 3.14159;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea(){
		return pi*(this.raio*this.raio);
	}
}
