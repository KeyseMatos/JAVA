package model1;

public abstract class Produto {
	
	private String id;
	private String nome;
	private String marca;
	private double precoVenda;
	//CRIANDO VARIÁVEL QUE VEM DO TIPO ENUM
	private CategoriaProduto categoria;
	private EstadoProduto estado;
	//CONTADOR GLOBAL NÃO É PRIVADO
	static int totalProduto = 0;
	
	
	//----TODA CLASSE QUE HERDAR DE PRODUTO É OBRIGADA A CRIAR SUA PRÓPRIA VERSÃO DESSE MÉTODO.

	
	public abstract String exibirFichaTecnica(); 
	
	//CONSTRUTOR
	public Produto(String id, String nome, String marca, double precoVenda, CategoriaProduto categoria,
			EstadoProduto estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.precoVenda = precoVenda;
		this.categoria = categoria;
		this.estado = estado;
		
		totalProduto++;
	}
	
	
	//TO STRING PARA EXIBIÇÃO
	@Override
	public String toString() {
		return "Produto id: " + id + ", nome: " + nome + ", marca: " + marca + ", preço de venda: " + precoVenda
				+ ", categoria: " + categoria + ", estado: " + estado ;
	}

	//GETT E SET
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id != null && !id.isEmpty()) {
			this.id = id;
		};
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		if(precoVenda > 0) {
			this.precoVenda = precoVenda;
		}
	}
	public CategoriaProduto getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}
	public EstadoProduto getEstado() {
		return estado;
	}
	public void setEstado(EstadoProduto estado) {
		this.estado = estado;
	}
		

}
