package bankId.customers;

import bankId.cards.KidCard;

import java.util.Arrays;

public class KidCustomer extends Customer {

	public KidCustomer(String fullName, KidCard kidCard, String agreement) {
		super(fullName, Arrays.asList(kidCard), agreement);
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
