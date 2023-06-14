package bankId;


import bankId.cards.CardBank;
import bankId.cards.CreditCard;

public class Main {

	public static void main(String[] args) {

		CardBank one = new CreditCard("456435762348627", "SITNIKOV SERGEI");
		System.out.println(one);
		one.deactivationCard();
		System.out.println(one);
		one.pay(93);
		System.out.println(one);
	}
}