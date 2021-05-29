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
