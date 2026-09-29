package model1;

public class Smartphone extends Produto {
	
	private CategoriaProduto modelo;
	
	private int mAh;
	private int GB;
	
	//CONSTRUTOR
	public Smartphone(String id, String nome, String marca, double precoVenda, CategoriaProduto categoria,
			EstadoProduto estado, int mAh, int gB) {
		super(id, nome, marca, precoVenda, categoria, estado);
		this.mAh = mAh;
		GB = gB;
		this.modelo = CategoriaProduto.SMARTPHONE;
		
	}
	
	@Override
	public String exibirFichaTecnica() {
		
		 return "ID: " + getId()
         + "\nNome: " + getNome()
         + "\nMarca: " + getMarca()
         + "\nPreço: " + getPrecoVenda()
         + "\nCategoria: " + getCategoria()
         + "\nEstado: " + getEstado()
		 + "\nBateria: " + getmAh() + " mAh"
		 + "\nArmazenamento: " + getGB() + " GB";
	}

	//TO STRING PARA EXIBIR SMARTPHONE DESSA MANEIRA AGORA
	@Override
	public String toString() {
		return "SMARTPHONE = Modelo: " + modelo + ", mAh: " + mAh + ", GB: " + GB ;
	}


	//GETT E SET
	public CategoriaProduto getModelo() {
		return modelo;
	}

	public void setModelo(CategoriaProduto modelo) {
		this.modelo = modelo;
	}

	public int getmAh() {
		return mAh;
	}

	public void setmAh(int mAh) {
		this.mAh = mAh;
	}

	public int getGB() {
		return GB;
	}

	public void setGB(int gB) {
		GB = gB;
	}
	
	
	
	
	
	

}
