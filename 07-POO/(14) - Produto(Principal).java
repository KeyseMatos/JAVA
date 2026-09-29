package model1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		 Inventario inventario = new Inventario();

		    /*01*/Smartphone smartphone1 = new Smartphone(//CRIANDO OS PRODUTOS
		            "001",
		            "Galaxy S24",
		            "Samsung",
		            3500.00,
		            CategoriaProduto.SMARTPHONE,
		            EstadoProduto.NOVO,
		            4000,
		            256
		    );

		    Smartphone smartphone2 = new Smartphone(
		            "002",
		            "iPhone 15",
		            "Apple",
		            4500.00,
		            CategoriaProduto.SMARTPHONE,
		            EstadoProduto.MOSTRUARIO,
		            3800,
		            128
		    );

		    Laptop laptop = new Laptop(
		            "003",
		            "IdeaPad",
		            "Lenovo",
		            3200.00,
		            CategoriaProduto.LAPTOP,
		            EstadoProduto.RECONDICIONADO,
		            CategoriaProduto.LAPTOP,
		            15,
		            "Intel Core i5"
		    );

		    /*02*/System.out.println("Total de produtos: " + Produto.totalProduto);

		    /*03*/inventario.adicionarProduto(smartphone1);//ADICIONANDO OS PRODUTOS AO INVENTÁRIO
		    inventario.adicionarProduto(smartphone2);
		    inventario.adicionarProduto(laptop);
		    
		    /*04*/System.out.println("/n======PRODUTOS DO INVENTÁRIO======/n ");
		    inventario.listarProdutos();
		    
		    /*05*/inventario.listarProdutos();
		    
		    ArrayList<Produto> smartphones = inventario.buscarPorCategoria(CategoriaProduto.SMARTPHONE);
		    
		    System.out.println("/n======SMARTPHONE======/n ");
		    
		    for (Produto p : smartphones) {
		    	
		    	System.out.println(p.exibirFichaTecnica());
					
			}
		    
		    /*06*/System.out.println("\n===== ATUALIZANDO PREÇO =====");
		    inventario.atualizarPreco("001", 3000.00);
		    
		    System.out.println("\n===== REMOVENDO PRODUTO =====");
		    inventario.removerProduto("002");
		    
		    /*07*/System.out.println("\n===== INVENTÁRIO APÓS MANUTENÇÃO =====");
		    inventario.listarProdutos();
		    
		    Produto produto = inventario.buscarProduto("001");
		    
		    System.out.println("\n===== PREÇO FORMATADO =====");
		    System.out.println(Formatador.formatarMoeda(produto.getPrecoVenda()));
	}
	
			

}
