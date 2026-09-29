package model1;

public class Laptop extends Produto {
	
	private CategoriaProduto modelo;
	
	private int polegadas;
	private String modeloProcessador;
	
	//CONSTRUTOR
	public Laptop(String id, String nome, String marca, double precoVenda, CategoriaProduto categoria,
			EstadoProduto estado, CategoriaProduto modelo, int polegadas, String modeloProcessador) {
		super(id, nome, marca, precoVenda, categoria, estado);
		
		this.polegadas = polegadas;
		this.modeloProcessador = modeloProcessador;
		
		this.modelo = CategoriaProduto.LAPTOP;
	}
	@Override
	public String exibirFichaTecnica() {
		
		 return "ID: " + getId()
         + "\nNome: " + getNome()
         + "\nMarca: " + getMarca()
         + "\nPreço: " + getPrecoVenda()
         + "\nCategoria: " + getCategoria()
         + "\nEstado: " + getEstado()
		 + "\nPolegadas: " + getPolegadas() + " Polegadas"
		 + "\nModelo do Processador: " + getModeloProcessador(); 
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Laptop modelo: " + modelo + ", polegadas: " + polegadas + ", modelo do processador: " + modeloProcessador;
	}

	public CategoriaProduto getModelo() {
		return modelo;
	}

	public void setModelo(CategoriaProduto modelo) {
		this.modelo = modelo;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public String getModeloProcessador() {
		return modeloProcessador;
	}

	public void setModeloProcessador(String modeloProcessador) {
		this.modeloProcessador = modeloProcessador;
	}
	
	
	
	
	
	

	

}
