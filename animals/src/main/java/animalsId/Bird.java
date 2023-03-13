package animalsId;

public class Bird extends Animals {
	public final String FLY_TXT = " пролетела";
	public final String DIDNT_FLY_TXT = " не пролетела";

	/*
	 * Передаём данные в родитель
	 */
	public Bird() {
		super("Птичка", 5, 0.2, 0, false);
	}

	@Override
	public void run(double distanceRun) {
		if (getMaxDistanceRun() >= distanceRun) {
			System.out.println(getNameAnimal() + FLY_TXT);
		} else {
			System.out.println(getNameAnimal() + DIDNT_FLY_TXT);
		}
	}
}
