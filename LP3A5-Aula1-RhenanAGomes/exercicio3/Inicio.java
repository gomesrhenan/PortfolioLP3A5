//Rhenan Abachioni Gomes SP3069184
//LP3A5 Aula 1 Exercício 3 - Executa os métodos das classes Quadrado, Triangulo e Circulo
package exercicio3;

public class Inicio {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(2);
		System.out.println(quadrado.calcularArea());
		
		Triangulo triangulo = new Triangulo(2,3);
		System.out.println(triangulo.calcularArea());
		
		Circulo circulo = new Circulo(2);
		System.out.println(circulo.calcularArea());		
	}
}
