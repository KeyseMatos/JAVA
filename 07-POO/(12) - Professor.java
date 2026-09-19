public abstract class Professor {
	
		private static int totalProfessores = 0;

		private String matricula;
		private String nome;
		private int horasSemanais;
		private double salarioBase;
		
		@Override
		public String toString() {
			return "Professor [matricula=" + matricula + ", nome=" + nome + ", horasSemanais=" + horasSemanais
					+ ", salarioBase=" + salarioBase + "]";
		}
		
		public abstract boolean elegivelAfastamento();
		public abstract double calcularSalarioFinal();
		

		public Professor(String matricula, String nome, int horasSemanais, double salarioBase) {
			super();
			this.matricula = matricula;
			this.nome = nome;
			this.horasSemanais = horasSemanais;
			this.salarioBase = salarioBase;

			totalProfessores++;
		}


		public String getMatricula() {
			return matricula;
		}


		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getHorasSemanais() {
			return horasSemanais;
		}


		public void setHorasSemanais(int horasSemanais) {
			this.horasSemanais = horasSemanais;
		}


		public double getSalarioBase() {
			return salarioBase;
		}


		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}
		
		
}
