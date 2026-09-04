public class Celular {

	private String marca;
	private String cor;
	private String modelo;
	private double valor;
	private Capa capa;

	public Celular(String marca, String cor, String modelo, double valor, Capa capa) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
		this.capa = capa;
	}

	public void ValorTotal() {
	System.out.println("O valor total do celular "+ this.marca +
			" com a capa "+capa.getCor()+" de "+capa.getMaterial()+
			" ficou de: "+(this.valor+capa.getPreco()));
	}

}
