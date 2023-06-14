package bankId.cards;

public class CreditCard extends CardBank {
    public CreditCard(String panCard, String ownerCard) {
        super(panCard, ownerCard);
    }

    @Override
    public String getNameCard() {
        return "Кредитная карта";
    }

}
