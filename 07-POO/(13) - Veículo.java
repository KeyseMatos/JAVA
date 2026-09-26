
public abstract class Veiculo implements Ivalidavel {
	
	private String placa;
	private int horaEstacionamento;

	public static int totalVeiculosAtendidos = 0;
	
	//CONSTRUTOR
	public Veiculo(String placa, int horaEstacionamento) {
		super();
		setPlaca(placa);
		this.horaEstacionamento = horaEstacionamento;
		
        //INCREMENTAR
		totalVeiculosAtendidos++;
	}

    public abstract double calcularValorTotal();
    
	
	@Override
	public String toString() {
		return "Veiculo [Placa do Veículo: " + placa + ", Hora de Estacionamento: " + horaEstacionamento + ", Valor Total: R$"
				+ calcularValorTotal();
	}

	
    @Override
    public boolean validarPlaca() {

        return placa != null && placa.length() == 7;
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

