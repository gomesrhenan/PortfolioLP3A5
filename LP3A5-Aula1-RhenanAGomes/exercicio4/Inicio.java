//Rhenan Abachioni Gomes SP3069184
//LP3A5 Aula 1 Exercício 4 - Executa os métodos das classes Funcionario e Gerente.
package exercicio4;

public class Inicio {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("nome1", 1000, "depto1");
		func1.mostrarInformacoes();
		
		Funcionario gerente1 = new Gerente("nome2", 2000, "depto2", "senha");
		gerente1.mostrarInformacoes();
	}
}
