package bankId.customers;

import bankId.cards.CardBank;

import java.util.List;

public class Customer{

    private final String fullName;
    private final List<CardBank> card;
    private final String agreement;

    public Customer(String fullName, List<CardBank> card, String agreement) {
        this.fullName = fullName;
        this.card = card;
        this.agreement = agreement;
    }

    public List<CardBank> getCard() {
        return card;
    }

    public String getFullName() {
        return fullName.toUpperCase();
    }

    public String getAgreement() {
        return agreement;
    }

    @Override
    public String toString() {
        return "CUSTOMER[" + '\n' + '\t' +
                "FULLNAME: " + getFullName() + '\n' + '\t' +
                "AGREEMENT: " + getAgreement() + '\n' + '\t' +
                getCard() + '\n' +
                "]";
    }


}
