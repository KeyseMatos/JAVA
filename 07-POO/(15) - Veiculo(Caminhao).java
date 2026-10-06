public class Caminhao extends Veiculo {

	private double capacidadeCarga;
	private int numeroEixos;

	public Caminhao(String id, String modelo, String marca, double valor_loc_dia, Categoria categoria,
			EstadoVeiculo estadoVeiculo) {
		super(id, modelo, marca, valor_loc_dia, categoria, estadoVeiculo);
	}

	@Override
	public void fichaTecnica() {
		System.out.println("Capacidade de Carga: " + capacidadeCarga + " Toneladas.");
		System.out.println("Número de Eixos: " + numeroEixos);
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}

	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}

}
