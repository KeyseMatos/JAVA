
public class Veiculo {
	
	private String placa;
	private int horaEstacionamento;
	public static int totalVeiculosAtendidos;
	
	//CONSTRUTOR
	public Veiculo(String placa, int horaEstacionamento) {
		super();
		this.placa = placa;
		this.horaEstacionamento = horaEstacionamento;
		//INCREMENTAR
		totalVeiculosAtendidos++;
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", horaEstacionamento=" + horaEstacionamento + ", calcularValorTotal()="
				+ calcularValorTotal() + ", getPlaca()=" + getPlaca() + ", getHoraEstacionamento()="
				+ getHoraEstacionamento() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public abstract double calcularValorTotal();
	public abstract boolean validarPlaca() {
		if(placa == placa.length() == 7) {
			return true;
		}
	}

	//GET E SETTER
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		if(placa !=  null && placa.length() == 7 ) {
			this.placa = placa;
		}else{
			System.out.println("Placa Inválida");
		}
	}


	public int getHoraEstacionamento() {
		return horaEstacionamento;
	}


	public void setHoraEstacionamento(int horaEstacionamento) {
		this.horaEstacionamento = horaEstacionamento;
	}
	
	
	
	

}

