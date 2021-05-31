public class BolaQuicando extends BolaDecorator{
	public BolaQuicando(Bola bola){
	    super(bola);
	  }

	@Override
	public String comportamento() {
		return "quicar";
	}

}
