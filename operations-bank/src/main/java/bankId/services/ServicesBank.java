package bankId.services;

import bankId.cards.CardBank;

public abstract class ServicesBank {

	private final String ALREADY_ACTIVE_SERVICE_TXT =  "Услуга " + getNameService() + " уже активирована!";
	private final String ACTIVE_SERVICE_TXT =  "Услуга " + getNameService() + " активирована!";
	private final String DEACTIVE_SERVICE_TXT =  "Услуга " + getNameService() + " деактивирована!";
	private final String SERVICE_NO_ACTIVATED_TXT = "Услуга " + getNameService() + " не активирована!";
	private String nameService;
	private boolean isActivityService = false;
	private final CardBank card;
	private final double priceService;

	protected ServicesBank(CardBank card, double priceService) {
		this.card = card;
		this.priceService = priceService;
	}

	public void activateService(){
		boolean isBalanceFalse = card.getBalanceCard() < priceService;
		boolean isLimitFalse = card.getLimitCard() > 0 && card.getLimitCard() < priceService;
		if (!card.isCardActivity()) {
			final String NO_ACTIVE_CARD_TXT = card.getNameCard() + " не активирована!";
			System.out.println(SERVICE_NO_ACTIVATED_TXT + NO_ACTIVE_CARD_TXT);
		}
		else if(isActivityService) {
			System.out.println(ALREADY_ACTIVE_SERVICE_TXT);
		}
		else if (isBalanceFalse) {
			String NO_MONEY_ON_BALANCE_TXT = " Недостаточный баланс!";
			System.out.println(SERVICE_NO_ACTIVATED_TXT + NO_MONEY_ON_BALANCE_TXT);
		}
		else if (isLimitFalse){
			String LIMIT_IS_EXCEEDED_TXT = " Превышен лимит!";
			System.out.println(SERVICE_NO_ACTIVATED_TXT + LIMIT_IS_EXCEEDED_TXT);
		}
		else {
			isActivateService(card);
		}
	}

	//Активация услуги
	public void isActivateService(CardBank card) {
		card.pay(priceService);
		this.isActivityService = true;
		System.out.println(ACTIVE_SERVICE_TXT);
	}

	//Деактивация услуги
	public void isDeactivationService() {
		if (!card.isCardActivity()) {
			final String NO_ACTIVE_CARD_TXT = card.getNameCard() + " не активирована!";
			System.out.println(NO_ACTIVE_CARD_TXT);
		}
		else {
			this.isActivityService = false;
			System.out.println(DEACTIVE_SERVICE_TXT);
		}
	}

	//Вернуть статус услуги
	public void serviceStatus() {
		if(isActivityService()){
			System.out.println(ACTIVE_SERVICE_TXT);
		}
		else System.out.println(SERVICE_NO_ACTIVATED_TXT);
	}
	public boolean isActivityService() {
		return isActivityService;
	}

	public String getNameService() {
		return nameService;
	}

}
