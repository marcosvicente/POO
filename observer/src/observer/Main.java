package observer;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda venda = new Venda();
		Observer carta = new Carta(venda);
	    Random random = new Random();
		
		
		
		for (int i = 0; i < 10; i++) {
			venda.setState(random.nextInt());
			carta.add(carta);

			System.out.println(carta.update());
		} 
		
		System.out.println("ultimo:" + carta.update());
		



	}

}
