package ATIVIDADE_COMPUTADOR_KEYSE;

public class Main {
	public static void main(String[] args) {
		Monitor monitor = new Monitor(26,"OLED",3.600);
		Computador computador = new Computador ("DELL","misto","Cinza",2000, monitor);
		computador.valorTotal();	
	}
}
