
public class Main {

	public static void main(String[] args) {
		
		Cards singleton = null;
		
		singleton = Cards.getInstance();
		
		singleton.setCard("Tudo que relux");
		
		System.out.println("Carta name: " + singleton.getCard());
		
		System.out.println("Singleton memoria - " + singleton);


	}

}
