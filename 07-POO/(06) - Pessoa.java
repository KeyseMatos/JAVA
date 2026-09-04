public class Pessoa {

	private static int proxId = 1;
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		this.id = proxId++;
		this.nome = nome;
		this.idade = idade;
		setCpf(cpf);
	}	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(validarCpf(cpf)) {
			this.cpf = cpf;			
		}else {
			System.out.println("Cpf Inválido!");
		}
	}
	private boolean validarCpf(String cpf) {
		 return cpf.length() == 14;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) throws Exception {
		if(idade < 0) {
			throw new Exception("Idade Inválida");
		}else {
			this.idade = idade;			
		}
	}
	
	public String exibir() {
		return "ID:"+ this.id +"\nNome: "+ this.nome + "\nCpf: "+this.cpf+"\nIdade: "+this.idade;
	}
}
