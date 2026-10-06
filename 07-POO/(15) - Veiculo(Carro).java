public class Carro extends Veiculo {

	private int capacidadePM;
	private String tipoCombustivel;

	public Carro(String id, String modelo, String marca, double valor_loc_dia, Categoria categoria,
			EstadoVeiculo estadoVeiculo, int capacidadePM, String tipoCombustivel) {
		super(id, modelo, marca, valor_loc_dia, categoria, estadoVeiculo);
		this.capacidadePM = capacidadePM;
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getCapacidadePM() {
		return capacidadePM;
	}

	public void setCapacidadePM(int capacidadePM) {
		this.capacidadePM = capacidadePM;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public void fichaTecnica() {
		System.out.println("Capacidade do Porta-Malas: " + capacidadePM + " Litros.");
		System.out.println("Tipo de Combustível: " + tipoCombustivel + " Litros.");

	}

}
