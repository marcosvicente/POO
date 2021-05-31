package factory;

public class Terreno implements Card{
	private Terreno() {}
	
	public static Terreno build() {
		return new Terreno();
	}
	
	@Override
	public String getTipo() {
		return "terreno";
	}
}
