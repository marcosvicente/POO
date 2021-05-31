
public class Cards {
	private static Cards instance;

	private String card;	

	private Cards() {}
	
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public static Cards getInstance() {
		if(instance == null ) {
			instance = new Cards();
		}
	   return instance;
	}
}
