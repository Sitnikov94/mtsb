package bankId.cards;

public class DebitCards extends CardsBank {

	public DebitCards(String panCard, String ownerCard, double limitCard, double balanceCard) {
		super(panCard, ownerCard, limitCard, balanceCard);
	}

	@Override
	public String getNameCard() {
		return "Дебетовая карта";
	}
}
