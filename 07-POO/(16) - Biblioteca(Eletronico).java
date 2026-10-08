package br.senai.poo.atividade;

public class Eletronico extends Produto {
	
	private CategoriaProdutoEnum categoria;
	private Integer id;
	
	private static Integer proximoId = 1;

	public Eletronico(String nome, Integer codigo, Double preco, CategoriaProdutoEnum categoria) {
		super(nome, codigo, preco);
		this.categoria = categoria;
		this.id = proximoId;
		proximoId++;
	}
	
	
	public CategoriaProdutoEnum getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaProdutoEnum categoria) {
		this.categoria = categoria;
	}


	@Override
	public String exibirInformacoes() {
		return "Eletronico [categoria=" + categoria 
				+ ", id=" + id 
				+ ", getNome()=" + getNome() 
				+ ", getCodigo()=" + getCodigo() 
				+ ", getPreco()=" + getPreco() + "]";
		
	}
	
	public String exibirInformacoes(Boolean detalhado) {
		
		if(detalhado) {
			return "Eletronico [categoria=" + categoria 
					+ ", id=" + id
					+ ", Nome=" + getNome() 
					+ ", getCodigo()="
					+ getCodigo() 
					+ ", getPreco()=" + getPreco() + "]";
		}else {
			return " Nome: " + getNome();		
			
	}


		
	}
	


}
	

