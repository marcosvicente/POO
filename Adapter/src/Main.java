
public class Main {

	public static void main(String[] args) {
		  Card card = new Papel();
		  CardVirtual card_virtual = new Dados();
	  
	     
	      
		System.out.println("Compra: " +  card.dinheiro());
		System.out.println("Compra: " +  card_virtual.cartao());

		Adapter dinheiro_adapter = new Adapter(card_virtual);
		System.out.println("Adaptar Compra: " +  dinheiro_adapter.cartao());

	      
	}

}
