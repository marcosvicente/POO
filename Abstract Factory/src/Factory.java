
public class Factory implements AbstractFactory<Card>{
	@Override
	public Card tipo(String tipo) {
		switch(tipo) {
			case "feitico":
				return new Feitico();
			case "terreno":
				return new Terreno();
			default:
				throw new Error("Carta Invalida");
		}
		
		
		
	}
}
