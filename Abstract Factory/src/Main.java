
public class Main {

	public static void main(String[] args) {
		Card card = (Card) FactoryOfFactory.factoryCard("card").tipo("terreno");
		
		System.out.println("card: " + card.tipo());
		
		Card card1 = (Card) FactoryOfFactory.factoryCard("card").tipo("feitico");
		
		System.out.println("card: " + card1.tipo());

	}

}
