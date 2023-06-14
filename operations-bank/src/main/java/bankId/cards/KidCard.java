package bankId.cards;

import bankId.customers.Customer;

import java.util.List;

public class KidCard extends CardBank {

    private final Customer parent;
    private final int ageKid;

    public KidCard(String panCard, String ownerCard, int ageKid, Customer parent) {
        super(panCard, ownerCard);
        this.parent = parent;
        this.ageKid = ageKid;
    }

    //Получить информацию о родителе
    public Customer getParent() {
        return parent;
    }

    //Получить возраст ребенка
    public int getAgeKid() {
        return ageKid;
    }

    @Override
    public String getNameCard() {
        return "Детская карта";
    }

    @Override
    public String toString() {
        return
                "\n\tCARD[" + '\n' + '\t' + '\t' +
                        "PANCARD: " + super.getPanCard() + '\n' + '\t' + '\t' +
                        "NAMECARD: " + getNameCard() + '\n' + '\t' + '\t' +
                        "PARENT: " + getParent().getFullName() + '\n' + '\t' + '\t' +
                        "ACTIVE: " + super.isCardActivity() + '\n' + '\t' + '\t' +
                        "CARDHOLDER: " + super.getCardHolder() + '\n' + '\t' + '\t' +
                        "AGE: " + getAgeKid() + '\n' + '\t' + '\t' +
                        "BALANCE: " + super.getBalanceCard() + '\n' + '\t' + '\t' +
                        "LIMIT: " + super.getLimitCard() + '\n' + '\t' +
                        "]";
    }
}
