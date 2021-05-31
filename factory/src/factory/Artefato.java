package factory;

public class Artefato implements Card{
	private Artefato() {}
	
	public static Artefato build() {
		return new Artefato();
	}
	
	@Override
	public String getTipo() {
		return "artefato";
	}
}
