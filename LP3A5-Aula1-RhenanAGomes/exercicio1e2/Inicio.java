//Rhenan Abachioni Gomes SP3069184
//LP3A5 Aula 1 Exercício 1 e 2 - Executa os métodos da classe Pessoa e da classe filha Aluno.
package exercicio1e2;

public class Inicio {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Nome1", 20);
		pessoa1.apresentar();
		
		pessoa1 = new Aluno("Nome2", 20, "Matricula1");
		pessoa1.apresentar();
	}

}
