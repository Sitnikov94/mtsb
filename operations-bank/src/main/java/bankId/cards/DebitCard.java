package bankId.cards;

public class DebitCard extends CardBank {

    public DebitCard(String panCard, String ownerCard) {
        super(panCard, ownerCard);
    }

    @Override
    public String getNameCard() {
        return "Дебетовая карта";
    }
}
