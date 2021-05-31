
public class Main {

	public static void main(String[] args) {
		Cards card = Cards
				.build().setAzul("azul")
				.setBranca("branca")
				.setPreta("preta")
				.setVerde("verde")
				.setVermelha("vermelha");


		System.out.println("Mana " + card.getAzul());
		System.out.println("Mana " + card.getBranca());
		System.out.println("Mana " + card.getPreta());
		System.out.println("Mana " + card.getVerde());
		System.out.println("Mana " + card.getVermelha());

	}

}
