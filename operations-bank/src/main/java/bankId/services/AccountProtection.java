package bankId.services;

import bankId.cards.CardBank;

public class AccountProtection extends ServicesBank {
    public AccountProtection(CardBank card, double balance) {
        super(card, balance);
    }

    @Override
    public String getNameService() {
        return "Защита счета";
    }
}
