
public class Main {

	public static void main(String[] args) {
		Bola main = new BolaPrincipal();

		Bola p = new BolaPingando(main);
		System.out.println(p.comportamento());

		Bola q = new BolaQuicando(main);
		System.out.println(q.comportamento());


	}

}
