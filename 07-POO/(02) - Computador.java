package ATIVIDADE_COMPUTADOR_KEYSE;

public class Computador {
	
	private String marca;
	private String cor;
	private String modelo;
	private double valor;
	private Monitor monitor;

	public Computador(String marca, String cor, String modelo, double valor, Monitor monitor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
		this.monitor = monitor;
			
}
	public void valorTotal() {
		System.out.println("O valor total do computador "+this.marca+ " com o monitor de "+monitor.gettamanho()+ " polegadas "+monitor.gettipo()+ " ficou de: " +(this.valor + monitor.getpreco()));
	}
public String getmarca() {
	return marca;
}
public void setmarca(String marca) {
	this.marca = marca;
}
public String getcor() {
	return cor;
}
public void setcor(String cor) {
	this.cor = cor;
}
public String getmodelo() {
	return modelo;
}
public void setmodelo(String modelo) {
	this.modelo = modelo;
}
public double getvalor() {
	return valor;
}
public void setvalor(double valor) {
	this.valor = valor;
}
public Monitor getmonitor() {
	return monitor;
}
public void setmonitor(Monitor monitor) {
	this.monitor = monitor;
}
}
