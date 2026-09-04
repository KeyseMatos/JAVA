package ATIVIDADE_COMPUTADOR_KEYSE;

public class Monitor {
	private int tamanho;
	private String tipo;
	private double preco;


public Monitor(int tamanho, String tipo, double preco) {
	this.tamanho = tamanho;
	this.tipo = tipo;
	this.preco = preco;
}
public int gettamanho() {
	return tamanho;
}
public void settamanho(int tamanho) {
	this.tamanho = tamanho;
}
public String gettipo() {
	return tipo;
}
public void settipo(String tipo) {
	this.tipo = tipo;
}
public double getpreco() {
	return preco;
}
public void setpreco(double preco) {
	this.preco = preco;
}
}
