
public class BolaPingando extends BolaDecorator{
	public BolaPingando(Bola bola){
	    super(bola);
	  }

	public String comportamento() {
		return "pingar";
	}

}
