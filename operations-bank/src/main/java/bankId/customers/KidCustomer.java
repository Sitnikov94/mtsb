package bankId.customers;

import bankId.cards.KidCard;

import java.util.Arrays;
import java.util.Collections;

public class KidCustomer extends Customer {

	public KidCustomer(String fullName, KidCard card, String agreement) {
		super(fullName, Collections.singletonList(card), agreement);
	}

	@Override
	public String toString() {
		return "KidCustomer[" +
				"FULLNAME: " + getFullName() + '\n' + '\t' +
				"AGREEMENT: " + getAgreement() + '\n' + '\t' +
				getCard() + '\n' +
				"]";
	}
}
