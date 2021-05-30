package Pizza;

import java.util.ArrayList;
import java.util.Date;

public class PedidoPizza implements Pedido{
	 private ArrayList<Pizza> listPizza=new ArrayList<>();
	 private Date date;
	 private Cliente cliente;

	  public void adicionarPizza(Pizza pizza) {
		  listPizza.add(pizza);
		}

	  public void setCliente(Cliente cliente){
	    this.cliente = cliente;
	  }

	  public void setDate(Date date){
	    this.date = date;
	  }

	  public double getTotal(){
		 double total = 0;
		for (Pizza p : listPizza) {
			total = total + p.getValor();
	    }
	    return total;
	  }
}
