
public class FactoryOfFactory {
public static AbstractFactory<?> factoryCard(String factory){
		
		switch(factory) {
			case "card":
				return new Factory();
			default:
				throw new Error("Fabrica Errada");
		}
	}
}
