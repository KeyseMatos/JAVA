public class Medico {

	private String nome;
	private String CRM;
	private int idade;
	private double salario;

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", CRM=" + CRM + ", idade=" + idade + ", salario=" + salario + "]";
	}

	public Medico(String nome, String cRM, int idade, double salario) {
		super();
		this.nome = nome;
		CRM = cRM;
		this.idade = idade;
		this.salario = salario;
	}

	public boolean medicoAposentado() {
		return idade >= 55;
	}

	public double valorAposentadoria() {
		return salario * 0.8;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
