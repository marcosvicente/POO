package factory;

public class Main {

	public static void main(String[] args) {
		Card terreno = Factory.build("terreno");
		Card artefato = Factory.build("artefato");
		
		System.out.println("Carta e:" + terreno.getTipo());
		System.out.println("Carta e: " + artefato.getTipo());

	}

}
