package factory;

public class Factory {
	private Factory() {}
	
	public static Card build(String tipo) {
		if(tipo == "terreno") {
			return Terreno.build();

		}else if(tipo == "artefato") {
			return Artefato.build();

		}else {
			throw new Error("error");
		}
	}
}
