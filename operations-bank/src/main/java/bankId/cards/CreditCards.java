package bankId.cards;

public class CreditCards extends CardsBank {
	public CreditCards(String panCard, String ownerCard, double limitCard, double balanceCard) {
		super(panCard, ownerCard, limitCard, balanceCard);
	}

	@Override
	public String getNameCard() {
		return "Кредитная карта";
	}

}
