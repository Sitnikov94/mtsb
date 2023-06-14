package bankId.cards;

public abstract class CardBank {
    private final String panCard;
    private final String cardHolder;
    private String nameCard;
    private double limitCard = 0;
    private double balanceCard = 0;
    private boolean isCardActivity = true;

    protected CardBank(String panCard, String cardHolder) {
        this.panCard = panCard;
        this.cardHolder = cardHolder;
    }

    public void pay(double purchaseAmount) {
        if (isCheckingPossibilityOfPayment(purchaseAmount)) {
            setBalanceCard(getBalanceCard() - purchaseAmount);
            System.out.println("Оплата прошла успешно");
        }
    }

    // TODO: 15.06.2023 подумать над применением лимита
    public boolean isCheckingPossibilityOfPayment(double purchaseAmount) {
        if (!isCardActivity()) {
            System.out.println("Ваша карта неактивна!");
            return false;
        } else if (getBalanceCard() < purchaseAmount) {
            System.out.println("Недостаточно средств на карте!");
            return false;
        } else if (getLimitCard() > 0 && getLimitCard() < purchaseAmount) {
            System.out.println("Недостаточно лимита по карте!");
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return
                "\n\tCARD[" + '\n' + '\t' + '\t' +
                "PANCARD: " + getPanCard() + '\n' + '\t' + '\t' +
                "NAMECARD: " + getNameCard() + '\n' + '\t' + '\t' +
                "ACTIVE: " + isCardActivity() + '\n' + '\t' + '\t' +
                "CARDHOLDER: " + getCardHolder() + '\n' + '\t' + '\t' +
                "BALANCE: " + getBalanceCard() + '\n' + '\t' + '\t' +
                "LIMIT: " + getLimitCard() + '\n' + '\t' +
                "]";
    }

    //Активация карты
    public void activateCard() {
        this.isCardActivity = true;
    }

    //Деактивация карты
    public void deactivationCard() {
        this.isCardActivity = false;
    }

    //Установить лимит
    public void setLimitCard(double limitCard) {
        this.limitCard = limitCard;
    }

    //Установить баланс
    public void setBalanceCard(double balanceCard) {
        this.balanceCard = balanceCard;
    }

    //Получить наименование карты
    public String getNameCard() {
        return nameCard;
    }

    //Получить номер карты
    public String getPanCard() {
        return panCard;
    }

    //Получить владельца карты
    public String getCardHolder() {
        return cardHolder.toUpperCase();
    }

    //Получить лимит по карте
    public double getLimitCard() {
        return limitCard;
    }

    //Получить баланс на карте
    public double getBalanceCard() {
        return balanceCard;
    }

    //Получить статус активности карты
    public boolean isCardActivity() {
        return isCardActivity;
    }

}
