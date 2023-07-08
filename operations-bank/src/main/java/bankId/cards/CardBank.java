package bankId.cards;

import bankId.services.Premium;
import bankId.services.ServicesBank;

public abstract class CardBank {
	public final  String SUCCESS_PAY_TXT = "Оплата прошла успешно!";
	public final String NO_ACTIVITY_CARD_TXT = "Ваша карта не активна!";
	public final String NO_MONEY_ON_CARD_TXT = "Недостаточно средств на карте!";
	public final String NO_LIMIT_CARD_TXT = "Недостаточно лимита по карте!";
	public final String ACTIVATE_CARD_TXT = getNameCard() +" активирована!";
	public final String DEACTIVATE_CARD_TXT = getNameCard() + " деактивирована!";
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
			System.out.println(SUCCESS_PAY_TXT);
		}
	}

	public boolean isCheckingPossibilityOfPayment(double purchaseAmount) {
		boolean isNotMoney = getBalanceCard() < purchaseAmount;
		boolean isNotLimit = getLimitCard() > 0 && getLimitCard() < purchaseAmount;
		boolean isNotActivityCard = !isCardActivity();
		if (isNotActivityCard) {
			System.out.println(NO_ACTIVITY_CARD_TXT);
			return false;
		} else if (isNotMoney) {
			System.out.println(NO_MONEY_ON_CARD_TXT);
			return false;
		} else if (isNotLimit) {
			System.out.println(NO_LIMIT_CARD_TXT);
			return false;
		} else return true;
	}

	@Override
	public String toString() {
		return
				"\n\tCARD[" + '\n' + '\t' + '\t' +
						"CARDNAME: " + getNameCard() + '\n' + '\t' + '\t' +
						"PANCARD: " + getPanCard() + '\n' + '\t' + '\t' +
						"ACTIVE: " + isCardActivity() + '\n' + '\t' + '\t' +
						"CARDHOLDER: " + getCardHolder() + '\n' + '\t' + '\t' +
						"BALANCE: " + getBalanceCard() + '\n' + '\t' + '\t' +
						"LIMIT: " + getLimitCard() + '\n' + '\t' +
						"]";
	}

	//Активация карты
	public void activateCard() {
		this.isCardActivity = true;
		System.out.println(ACTIVATE_CARD_TXT);
	}

	//Деактивация карты
	public void deactivationCard() {
		this.isCardActivity = false;
		System.out.println(DEACTIVATE_CARD_TXT);
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
