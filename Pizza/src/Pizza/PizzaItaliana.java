package Pizza;

import java.util.ArrayList;

public class PizzaItaliana implements Ingrediente{
	 private String nome;
	 private ArrayList<Ingrediente> ingredients=new ArrayList<>();

	 public PizzaItaliana(String nome) {
		super();
		this.nome = nome;
	 }
	 public ArrayList<Ingrediente> Ingrediente(Ingrediente ingrediente) {
		 return ingredients.add(ingrediente);
	 }
}
