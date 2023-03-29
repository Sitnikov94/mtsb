package bankId;

import bankId.cards.CardsBank;

class UsersBank {

	private final String name;

	private final CardsBank card;

	protected UsersBank(String name, CardsBank card) {
		this.name = name;
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public CardsBank getCard() {
		return card;
	}
}
