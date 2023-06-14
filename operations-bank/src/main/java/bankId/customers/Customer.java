package bankId.customers;

import bankId.cards.CardBank;

class Customer {

	private final String fullName;
	private final CardBank card;
	private final String agreement;

	protected Customer(String name, CardBank card, String agreement) {
		this.fullName = name;
		this.card = card;
		this.agreement = agreement;
	}

	public String getName() {
		return fullName;
	}

	public CardBank getCard() {
		return card;
	}
}
