package bankId.cards;

public class KidCards extends CardsBank {

	private final String parent;
	private final int ageKid;

	public KidCards(String panCard, String ownerCard, double limitCard, double balanceCard, String parent, int ageKid) {
		super(panCard, ownerCard, limitCard, balanceCard);
		this.parent = parent;
		this.ageKid = ageKid;
	}

	@Override
	public String getNameCard() {
		return "Детская карта";
	}
}
