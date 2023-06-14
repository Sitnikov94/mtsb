package bankId.services;

import bankId.cards.CardBank;

public class Premium extends ServicesBank {
    public Premium(CardBank card, double balance) {
        super(card, balance);
    }

    @Override
    public String getNameService() {
        return "Премиум";
    }
}
