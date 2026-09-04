public class Capa {

	private String cor;
	private String material;
	private double preco;
	
	public Capa(String cor, String material, double preco) {
		super();
		this.cor = cor;
		this.material = material;
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
		
}
