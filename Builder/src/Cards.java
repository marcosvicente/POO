
public class Cards {
	private String azul;
	private String branca;
	private String preta;
	private String vermelha;
	private String verde;
	

	public static Cards build() {
		return new Cards();
	}
	
	public String getAzul() {
		return azul;
	}
	public Cards setAzul(String azul) {
		this.azul = azul;
		return this;
	}
	public String getBranca() {
		return branca;
	}
	public Cards setBranca(String branca) {
		this.branca = branca;
		return this;

	}
	public String getPreta() {
		return preta;
	}
	public Cards setPreta(String preta) {
		this.preta = preta;
		return this;

	}
	public String getVermelha() {
		return vermelha;
	}
	public Cards setVermelha(String vermelha) {
		this.vermelha = vermelha;
		return this;

	}
	public String getVerde() {
		return verde;
	}
	public Cards setVerde(String verde) {
		this.verde = verde;
		return this;

	}

}
