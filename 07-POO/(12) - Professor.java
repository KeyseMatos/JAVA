public abstract class Professor {
	
		private static int totalProfessores;
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
		

		public Professor(String matricula, String nome, int horasSemanais, double salarioBase, int totalProfessores) {
			super();
			this.totalProfessores = totalProfessores;
			this.matricula = matricula;
			this.nome = nome;
			this.horasSemanais = horasSemanais;
			this.salarioBase = salarioBase;
		}


		public static int getTotalProfessores() {
			return totalProfessores;
		}


		public static void setTotalProfessores(int totalProfessores) {
			Professor.totalProfessores = totalProfessores;
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
