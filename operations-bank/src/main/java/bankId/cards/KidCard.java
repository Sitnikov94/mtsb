package bankId.cards;

public class KidCard extends CardBank {

    private final String parent;
    private final int ageKid;

    public KidCard(String panCard, String ownerCard, int ageKid, String parent) {
        super(panCard, ownerCard);
        this.parent = parent;
        this.ageKid = ageKid;
    }

    //Получить информацию о родителе
    public String getParent() {
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
}
