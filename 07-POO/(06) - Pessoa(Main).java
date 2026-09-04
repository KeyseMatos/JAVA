public class Supermercado {

	public static void main(String[] args) throws Exception {
				
		Pessoa p1 = new Pessoa("Daniel", "123.456.789-11", 19);
		Pessoa p2 = new Pessoa("Gabriel", "123.456.789-10", 18);
		Pessoa p3 = new Pessoa("Ricardo", "123.456.789-10", 18);
		Pessoa p4 = new Pessoa("Thiago", "123.456.789-10", 18);
		
		System.out.println(p1.exibir());
		System.out.println(p2.exibir());		
		System.out.println(p3.exibir());		
		System.out.println(p4.exibir());		
	}
}
