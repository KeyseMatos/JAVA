package br.senai.poo.atividade;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Eletronico>produtos;

	public Loja() {
		produtos = new ArrayList<>();
	}
	/*ADICIONAR PRODUTOS*/
	public void adicionarProduto(Eletronico produto) {
		produtos.add(produto);
	}
	/*LISTAR PRODUTOS*/
	public ArrayList<Eletronico> listarProdutos(){
		return produtos;
	}
	/*LISTAR PRODUTOS POR CATEGORIAS*/
	public ArrayList<Eletronico> buscarPorCategoria(CategoriaProdutoEnum categoria){
		ArrayList<Eletronico> encontrados = new ArrayList<>();
		
		for (Eletronico produto : produtos) {
			
			if(produto.getCategoria() == categoria) {
				encontrados.add(produto);
			}
			
		}
		
		return encontrados;
	}
	 public Eletronico buscarPorNome(String nome) {
		 
		 for (Eletronico produto : produtos) {
			if(produto.getNome().equalsIgnoreCase(nome)) {
				return produto;
			}
		}
		 
		 System.out.println("Produto não encontrado");
		 return null;
	 }
	

}
