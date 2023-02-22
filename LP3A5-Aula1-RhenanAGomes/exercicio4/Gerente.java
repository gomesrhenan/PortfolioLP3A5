package exercicio4;

public class Gerente extends Funcionario{
	private String senha;
	
	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.senha = senha;
	}
	
	@Override
	public void mostrarInformacoes(){
		System.out.println("Nome: " + this.nome
				+ "\nSalário: " + this.salario
				+ "\nDepartamento: " + this.departamento
				+ "\nSenha: " + this.senha);
	}
}
