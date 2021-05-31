package facade;

public class CartasFacade {
	  private Cartas terreno;
	  private Cartas feitico;

	  public CartasFacade() {
		  terreno = new Terreno();
	      feitico = new Feitico();
	   }
	  public void jogarTerreno(){
		  terreno.tipo();
	   }
	   
	   public void jogarFeitico(){
		   feitico.tipo();
	   }
	 
}
