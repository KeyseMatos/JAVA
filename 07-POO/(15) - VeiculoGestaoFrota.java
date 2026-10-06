import java.util.ArrayList;

public class GestaoFrota implements IOperacoes {

	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

	@Override
	public boolean adicionarVeiculo(Veiculo v) {
		if (buscarVeiculo(v.getPlaca()) == null) {
			veiculos.add(v);
			return true;
		} else {
			System.out.println("Veiculo já cadastrado.");
			return false;
		}
	}

	@Override
	public boolean removerVeiculo(String cod) {
		if (buscarVeiculo(cod) == null) {
			return false;
		} else {
			veiculos.removeIf(n -> n.getPlaca() == cod);
		}
		return true;
	}

	@Override
	public Veiculo buscarVeiculo(String cod) {
		for (Veiculo v : veiculos) {
			if (v.getPlaca().equalsIgnoreCase(cod)) {
				v.fichaTecnica();
				return v;
			}
		}
		return null;
	}

	@Override
	public Veiculo buscarVeiculoCategoria(CategoriaVeiculoEnum categoria) {
		for (Veiculo v : veiculos) {
			if (v.getCategoria().equals(categoria)) {
				v.fichaTecnica();
				return v;
			}
		}
		return null;
	}

	@Override
	public void atualizarValorDiaria(String cod, double valor) {
		if (buscarVeiculo(cod) == null) {
			System.out.println("Veiculo inexistente!");
		} else {
			buscarVeiculo(cod).setValorDiaria(valor);
		}

	}

	@Override
	public void listarVeiculos() {
		for (Veiculo veiculo : veiculos) {
			veiculo.fichaTecnica();
		}

	}

}
