public class Loja {

	public static void main(String[] args) {
		
		Capa capa = new Capa("Prata", "Aço", 500);
		Celular celular = new Celular("Nokia", "Rose", "Lumia", 1000, capa);
		celular.ValorTotal();
	}

}
