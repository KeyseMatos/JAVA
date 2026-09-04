
public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		setsaldo(saldo);
	}
	
public String gettitular() {
	return titular;
}
public void settitular(String titular) {
	this.titular = titular;
}
public double getsaldo() {
	return saldo;
}
public void setsaldo(double saldo) {
	if(saldo < 0) {
		System.out.println("Valor invalido!");
		this.saldo = saldo;
	}else {
		this.saldo = saldo;
	}
}
public void exibirDados() {
	System.out.println("O titular "+this.titular+" tem o saldo de "+this.saldo);
}
}
