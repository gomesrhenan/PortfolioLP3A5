package exercicio4;

public class Funcionario {
	protected String nome;
	protected double salario;
	protected String departamento;
	
	public Funcionario(String nome, double salario, String departamento) {
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome: " + this.nome
							+ "\nSalário: " + this.salario
							+ "\nDepartamento: " + this.departamento);
	}
}
