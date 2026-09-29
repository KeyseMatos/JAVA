package model1;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
	
	//CRIANDO A LISTA
	private ArrayList<Produto>produtos;
	
	//PUBLIC INVENTARIO QUE IRÁ RECEBER A NOVA LISTA
	public Inventario() {
		
		produtos = new ArrayList<Produto>();
	}
	
	//PRIMEIRO MÉTODO DE ADICIONAR PRODUTOS
	public void adicionarProduto(Produto produto) {
		
		for (Produto p : produtos) {
			
			if(p.getId().equals(produto.getId())) {//COMPARAÇÃO DE STRING USA O EQUALS E RETORNA VAZIO POIS NÃO FAZ NENHUMA AÇÃO
				return;
			}	
		}
		produtos.add(produto);
	}
	
	//MÉTODO DE REMOVER PRODUTOS
	public void removerProduto(String id) {
		
		for (Produto p : produtos) {
			
			if(p.getId().equals(id)) {//COMPARAÇÃO DO ID DA CLASSE PRODUTO COM O ID QUE PUXEI
				produtos.remove(p);//REMOVE O ITEM P DA LISTA DE PRODUTOS
				return;
			}	
	}
	}
	
	//BUSCAR PRODUTO 
	public Produto buscarProduto(String id) {
		
		for (Produto p : produtos) {//PARA CADA PRODUTO DA LISTA:
			
			if(p.getId().equals(id)) {//SE O ID DELE FOR IGUAL AO ID PROCURADO:
				
				return p;//DEVOLVE ESSE PRODUTO.
		}
	}
		return null;//SE TERMINOU A LISTA E NÃO ENCONTROU: DEVOLVE NULL

	}
	
	//BUSCAR PRODUTO POR CATEGORIA
	public ArrayList<Produto> buscarPorCategoria(CategoriaProduto categoria){
		
		ArrayList<Produto> encontrados = new ArrayList<Produto>();//CRIA UMA LISTA VAZIA PARA GUARDAR OS ENCONTRADOS.
	
		for (Produto p : encontrados) {//PERCORRE TODOS OS PRODUTOS DO INVENTÁRIO.
			
			if(p.getCategoria().equals(categoria)) {//VERIFICA SE A CATEGORIA DO PRODUTO É IGUAL À CATEGORIA PROCURADA.
				encontrados.add(p);//SE FOR IGUAL, ADICIONA O PRODUTO NA LISTA ENCONTRADOS
			}
			
		}
		return encontrados;//NO FINAL, DEVOLVE A LISTA ENCONTRADOS.
	
	}
	
	//ATUALIZAR PREÇO
	public void atualizarPreco(String id, double novoPreco) {
		
		for (Produto p : produtos) {
			
			if(p.getId().equals(id)) {
				
				p.setPrecoVenda(novoPreco);
			}
			
		}
	}
		
	public void listarProdutos() {
		
		for (Produto p : produtos) {
			
			System.out.println(p.exibirFichaTecnica());
		}
	}
		
}


