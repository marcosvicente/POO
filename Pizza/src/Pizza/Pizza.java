package Pizza;

import java.util.ArrayList;

public class Pizza {
	

	double valor = 0;
	 ArrayList<Ingrediente> ingredients=new ArrayList<>();

	public  void addIngrediente(Ingrediente ingrediente) {
		 ingredients.add(ingrediente);
	 }

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
