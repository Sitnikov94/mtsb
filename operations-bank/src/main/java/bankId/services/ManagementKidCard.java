package bankId.services;

import bankId.cards.CardBank;
import bankId.cards.KidCard;

public class ManagementKidCard extends ServicesBank{

    protected ManagementKidCard(KidCard card, double balance) {
        super(card, balance);
    }
}
