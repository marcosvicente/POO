
public class Adapter implements CardVirtual{
	private CardVirtual card_virtual;
	
    public Adapter(CardVirtual card_virtual)
    {
        this.card_virtual = card_virtual;
    }

    @Override
    public String cartao(){
        return card_virtual.cartao();
    }
}
