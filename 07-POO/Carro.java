public class Carro {

	String cor;
	String modelo;
	boolean ligado;
	double velocidadeAtual;
	double velocidadeMaxima;

	public Carro(String cor,String modelo,double velocidadeMaxima) {
		this.ligado = false;
		this.velocidadeAtual = 0;
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("Carro Ligado!");
	}
	public void acelerar(int velocidade) {
		if (this.ligado) {
			if (this.velocidadeAtual + velocidade > velocidadeMaxima) {
				System.out.println("Velocidade Maxima é "+ this.velocidadeMaxima+" KM/h");
			} else {
				this.velocidadeAtual = velocidade;
			}
		} else {
			System.out.println("Ligue o Carro!");
		}
	}
	public int passarMarcha() {
		if(velocidadeAtual < 21) {
			return 1;
		}else if(velocidadeAtual < 41) {
			return 2;
		}else if(velocidadeAtual < 61) {
			return 3;
		}else if(velocidadeAtual < 101) {
			return 4;
		}else { 
			return 5;
		}
	}
}
