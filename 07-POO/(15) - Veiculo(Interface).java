public interface IOperacoes {

	public boolean adicionarVeiculo(Veiculo v);
	public boolean removerVeiculo(String cod);
	public Veiculo buscarVeiculo(String cod);
	public Veiculo buscarVeiculoCategoria(CategoriaVeiculoEnum categoria);
	public void atualizarValorDiaria(String cod, double valor);
	public void listarVeiculos();	
	
}
