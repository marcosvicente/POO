package Pizza;

public class FactoryPizza {
	public Pizza buildPizza(String sabor){
	    if (pizza.equals("calabreza")) {
	        return new PizzaCalabreza('calabreza');
	    }
	    if (pizza.equals("tomate")) {
	      return new PizzaItaliana('tomate');
	    }
	  }
}