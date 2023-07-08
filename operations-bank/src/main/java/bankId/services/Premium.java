package bankId.services;

import bankId.cards.CardBank;

public class Premium extends ServicesBank {


    public Premium(CardBank card, double priceService) {
        super(card, priceService);
    }

    @Override
    public String getNameService() {
        return "Премиум";
    }
}
