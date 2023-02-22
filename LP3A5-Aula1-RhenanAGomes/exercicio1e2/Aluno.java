package exercicio1e2;

public class Aluno extends Pessoa{
	private String matricula;
	
	
	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void apresentar() {
		System.out.println("Olá, eu sou o aluno " + this.nome + " com matrícula " + this.matricula + " e tenho " + this.idade + " anos.");
	}
}
