package bankId.services;

import bankId.cards.CardBank;

public abstract class ServicesBank {

	private String nameService;
	private boolean isActivityService = false;
	private CardBank card;
	private double balance;

	protected ServicesBank(CardBank card, double priceService) {
		this.card = card;
		this.balance = priceService;
	}

	public void activateService(){
		boolean isBalanceFalse = card.getBalanceCard() < balance;
		boolean isLimitFalse = card.getLimitCard() > 0 && card.getLimitCard() < balance;
		if(isActivityService) {
			System.out.println("Услуга " + getNameService() + " уже активирована!");
		}
		else if (isBalanceFalse) {
			System.out.println("Услуга неактивирована! Недостаточный баланс!");
		}
		else if (isLimitFalse){
			System.out.println("Услуга неактивирована! Превышен лимит!");
		}
		else {
			isActivateService();
		}
	}

	//Активация услуги
	public void isActivateService() {
		this.isActivityService = true;
		System.out.println("Услуга " + getNameService() + " активирована!");
	}

	//Деактивация услуги
	public void isDeactivationService() {
		this.isActivityService = false;
		System.out.println("Услуга " + getNameService() + " деактивирована!");
	}

	//Вернуть статус услуги
	public boolean isActivityService() {
		return isActivityService;
	}

	public String getNameService() {
		return nameService;
	}

}
