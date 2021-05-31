
public class BolaDecorator implements Bola{
	private Bola bola;
	
	//entra o objeto original
	public BolaDecorator(Bola bola) {
		this.bola=bola;
	}
	
	@Override
	public String comportamento() {
		return bola.comportamento();
	}

}
