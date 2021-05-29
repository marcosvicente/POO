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