class PizzaCalabreza implements Ingrediente{
  private ArrayList<Ingrediente> ingredients=new ArrayList<>();

  
  public Pizza addIngrediente(Ingrediente ingrediente) {
    return ingrediente.add(ingrediente);
  }
}