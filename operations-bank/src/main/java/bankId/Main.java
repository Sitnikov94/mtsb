package bankId;

import bankId.cards.*;


public class Main {

	public static void main(String[] args) {

		CardsBank one1 = new CreditCards("23496572928382764", "SERGEI SITNIKOV", 100000, 100000);
		UsersBank user1 = new UsersBank("Ситников Сергей Сергеевич",one1);

		System.out.println(user1.getCard());
		//System.out.println(one1.isCardActivity());
		//System.out.println(one1.getNameCard());


	}
}