public abstract class Veiculo {

	private String id;
	private String modelo;
	private String marca;
	private double valor_loc_dia;
	// ENUM
	private Categoria categoria;
	private EstadoVeiculo estadoVeiculo;

	public int contador = 0;

	// CONSTRUTOR
	public Veiculo(String id, String modelo, String marca, double valor_loc_dia, Categoria categoria,
			EstadoVeiculo estadoVeiculo) {
		super();
		setId(id);
		this.modelo = modelo;
		this.marca = marca;
		setValor_loc_dia(valor_loc_dia);
		this.categoria = categoria;
		this.estadoVeiculo = estadoVeiculo;

		contador++;

	}

	// MÉTODO
	public abstract void fichaTecnica();

	// TO STRING
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", valor_loc_dia=" + valor_loc_dia
				+ ", categoria=" + categoria + ", estadoVeiculo=" + estadoVeiculo + "]";
	}

	// GETT E SET
	public String getId() {
		return id;
	}

	public void setId(String id) {

		if (id != null && id.isEmpty()) {// NÃO PODE SER NULO E NEM VAZIO
			this.id = id;
			throw new IllegalArgumentException("Id Inválido!");// TRAVAR O APP ATÉ A PESSOA DIGITIR UM VALOR VÁLIDO
		}

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor_loc_dia() {
		return valor_loc_dia;
	}

	public void setValor_loc_dia(double valor_loc_dia) {

		if (valor_loc_dia > 0) {// O VALOR DA DIARIA NÃO PODE SER NEGATIVO E NEM ZERO, LOGO ELE É MAIOR QUE ZERO
			this.valor_loc_dia = valor_loc_dia;
			throw new IllegalArgumentException("Valor Inválido!");// TRAVAR O APP ATÉ A PESSOA DIGITIR UM VALOR VÁLIDO
		}

	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public EstadoVeiculo getEstadoVeiculo() {
		return estadoVeiculo;
	}

	public void setEstadoVeiculo(EstadoVeiculo estadoVeiculo) {
		this.estadoVeiculo = estadoVeiculo;
	}

}
