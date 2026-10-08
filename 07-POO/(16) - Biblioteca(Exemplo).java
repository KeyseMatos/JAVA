package br.senai.poo.atividade;

import java.util.ArrayList;

public class Exemplo {

	public static void main(String[] args) {
		
		// CRIAR LOJA
		Loja loja = new Loja();
		
		// ADICIONAR 6 PRODUTOS
		loja.adicionarProduto(new Eletronico("iPhone 15", 101, 4500.0, CategoriaProdutoEnum.SMARTPHONE));
		loja.adicionarProduto(new Eletronico("Samsung Galaxy S24", 102, 3800.0, CategoriaProdutoEnum.SMARTPHONE));
	    loja.adicionarProduto(new Eletronico("Motorola Edge 50", 103, 2500.0, CategoriaProdutoEnum.SMARTPHONE));

	    loja.adicionarProduto(new Eletronico("Dell Inspiron", 104, 4200.0, CategoriaProdutoEnum.NOTEBOOK));
	    loja.adicionarProduto(new Eletronico("Lenovo IdeaPad", 105, 3500.0, CategoriaProdutoEnum.NOTEBOOK));

	    loja.adicionarProduto(new Eletronico("Mouse Logitech", 106, 150.0, CategoriaProdutoEnum.PERIFERICO));

	    
	    System.out.println("=== PRODUTOS DETALHADOS ===");

	    	for (Eletronico produto : loja.listarProdutos()) {
	    		System.out.println(produto.exibirInformacoes(true));
				
			}
	    	
	    System.out.println("\n=== PRODUTOS RESUMIDOS ===");

    	for (Eletronico produto : loja.listarProdutos()) {
    		System.out.println(produto.exibirInformacoes(false));
			
	}
    	System.out.println("\n=== SMARTPHONES ===");
    	
    	ArrayList<Eletronico> smartphones = loja.buscarPorCategoria(CategoriaProdutoEnum.SMARTPHONE);
    	
    	for(Eletronico produto : smartphones) {
    		System.out.println(produto.exibirInformacoes(true));
    	}
    	
    	 System.out.println("\n=== NOTEBOOKS ===");

         ArrayList<Eletronico> notebooks = loja.buscarPorCategoria(CategoriaProdutoEnum.NOTEBOOK);

         for (Eletronico produto : notebooks) {
             System.out.println(produto.exibirInformacoes(true));
         }
 }
}


