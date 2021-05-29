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

}