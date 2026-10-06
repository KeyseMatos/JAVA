
public class Principal {

	public static void main(String[] args) {

		GestaoFrota gt = new GestaoFrota();
		
		System.out.println(Veiculo.getTotalVeiculos());
		
		Carro carro = new Carro("OUS2830", "Dolphin", "BYD", 15, CategoriaVeiculoEnum.CARRO,
				EstadoVeiculoEnum.DISPONIVEL);
		Carro carro1 = new Carro("OSU3028", "Cooper", "MINI", 15, CategoriaVeiculoEnum.CARRO,
				EstadoVeiculoEnum.EM_MANUTENCAO);
		Caminhao caminhao = new Caminhao("SUO0382", "113", "MERCEDES", 70, CategoriaVeiculoEnum.CAMINHAO,
				EstadoVeiculoEnum.EM_TRANSITO);

		gt.adicionarVeiculo(carro);
		gt.adicionarVeiculo(carro1);
		gt.adicionarVeiculo(caminhao);
		System.out.println(Veiculo.getTotalVeiculos());
		gt.listarVeiculos();
	}

}
