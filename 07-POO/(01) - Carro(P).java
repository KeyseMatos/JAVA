
public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Rosa", "BYD", 120);
		c1.ligar();
		c1.acelerar(120);
		System.out.println(c1.passarMarcha());

	}

}
