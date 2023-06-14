package bankId.services;

import bankId.cards.CardBank;

public class Insurance extends ServicesBank {
    public Insurance(CardBank card, double balance) {
        super(card, balance);
    }

    @Override
    public String getNameService() {
        return "Страховка";
    }
}
