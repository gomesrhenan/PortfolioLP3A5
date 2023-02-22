package exercicio3;

public class Triangulo extends FormaGeometrica{
	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea(){
		return (this.base*this.altura)/2;
	}
}