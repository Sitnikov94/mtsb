package bankId.customers;

import bankId.cards.CardBank;

import java.util.List;

public class KidCustomer extends Customer{

    public KidCustomer(String name, List<CardBank> card, String agreement) {
        super(name, card, agreement);
    }
}
