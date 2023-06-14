package bankId.services;

import bankId.cards.CardBank;

public abstract class ServicesBank {

    private String nameService;
    private boolean activityService = false;
    private CardBank card;
    private double balance;

    protected ServicesBank(CardBank card, double balance) {
        this.card = card;
        this.balance = balance;
    }

    //Активация услуги
    public void activateService() {
        this.activityService = true;
    }

    //Деактивация услуги
    public void deactivationService() {
        this.activityService = false;
    }

    //Вернуть статус активности
    public boolean isActivityService() {
        return activityService;
    }

    public String getNameService() {
        return nameService;
    }
}
