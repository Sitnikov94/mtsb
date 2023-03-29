package bankId.cards;

public abstract class CardsBank {
	private final String panCard;
	private final String ownerCard;
	private String nameCard;
	private final double limitCard;
	private final double balanceCard;
	private boolean cardActivity = true;

	protected CardsBank(String panCard, String ownerCard, double limitCard, double balanceCard) {
		this.panCard = panCard;
		this.ownerCard = ownerCard;
		this.limitCard = limitCard;
		this.balanceCard = balanceCard;
	}

	public String getNameCard() {
		return nameCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public String getOwnerCard() {
		return ownerCard;
	}

	public double getLimitCard() {
		return limitCard;
	}

	public double getBalanceCard() {
		return balanceCard;
	}

	/*
	Вернуть статус карты
	*/
	public boolean isCardActivity() {
		return cardActivity;
	}

	/*
	Установить активность карты
	*/
	protected void setCardActivity(boolean cardActivityValue) {
		cardActivity = cardActivityValue;
	}

}
