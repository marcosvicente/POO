
public class Cliente{
  
}


public class DiaFiscal{
  private ArrayList<Pedido> pedidos=new ArrayList<>();

  public addPedidos(Pedido pedido){
    pedido.getPedido();
  }
}
public class PedidoMarmitex implements Pedido{

}

public interface Pedido{
  public Pedido getPedido(){
    return valor;
  }
}
public class PedidoPizza implements Pedido{
  private List<Pizza> listPizza=new ArrayList<>();
  private List<Cliente> listPizza=new ArrayList<>();
  private Date date;

  public void adicionarPizza(Pizza pizza) {
		pizza.add(op);
	}

  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }

  public void setDate(Date date){
    this.date = date;
  }

  public double getTotal(){
    for (Pizza p : list) {
      var total = total + p.getValor()
    }
    return total;
  }
}
public class FactoryPizza {
  public Pizza buildPizza(String sabor){
    if (pizza.equals("calabreza"))
        return new PizzaCalabreza(['calabreza']);
    if (pizza.equals("tomate"))
      return new PizzaItaliana(['tomate']);
    }
  }
}

public interface Pizza {
  public Pizza addIngrediente(Ingrediente ingrediente) {
    return ingrediente.add(ingrediente);
  }

  public void setValor(double valor){
    this.valor = valor;
  }
  public double getValor(){
    return valor;
  }
}
public interface Ingrediente {
  public void setIngrediente(String ingrediente){
    this.ingrediente = ingrediente;
  }

	public Ingrediente getIngrediente() {
		return ingrediente;
	}
}


class Tomate implements Ingrediente{
  private Ingrediente ingrediente; 

  public void setIngrediente(String ingrediente){
    this.ingrediente = ingrediente;
  }

	public Ingrediente getIngrediente() {
		return ingrediente;
	}
}

class Cebola implements Ingrediente{
  private Ingrediente ingrediente; 

  public void setIngrediente(String ingrediente){
    this.ingrediente = ingrediente;
  }

	public Ingrediente getIngrediente() {
		return ingrediente;
	}
}

class PizzaCalabreza implements Ingrediente{
  private ArrayList<Ingrediente> ingredients=new ArrayList<>();

  
  public Pizza addIngrediente(Ingrediente ingrediente) {
    return ingrediente.add(ingrediente);
  }
}
class PizzaItaliana implements Ingrediente{
  private ArrayList<Ingrediente> ingredients=new ArrayList<>();

  
  public Pizza addIngrediente(Ingrediente ingrediente) {
    return ingrediente.add(ingrediente);
  }
}

public class Main {

  public static void main(String[] args) {

    Ingrediente in1=new Ingrediente();
    cr.Cebola(new Cebola());	

    Ingrediente in2=new Ingrediente();
    cr.Tomate(new Tomate());	

    Pizza pi1=new PizzaCalabreza();

    Pizza pi2=new PizzaItaliana();

    PedidoPizza pedido=new PedidoPizza();
    pedido.adicionarPizza(pi2);
    pedido.adicionarPizza(pi2);
    pedido.getTotal()

  }

}%                                                                                                                                                                 ma