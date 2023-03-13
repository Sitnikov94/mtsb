package animalsId;

public abstract class Animals {
	/*
	 * Текстовые переменные
	 */
	public final String RAN_TXT = " пробежал";
	public final String DIDNT_RAN_TXT = " не пробежала";
	public final String SWIM_TXT = " проплыл";
	public final String DIDNT_SWAM_TXT = " не пропыл";
	public final String DONT_SWIM_TXT = " не плавает";
	public final String JUMPED_TXT = " перепрыгнул";
	public final String DIDNT_JUMPED_TXT = " не перепрыгнул";


	/*
	 * Переменные для наследования
	 */
	private final String nameAnimal;
	private final double maxDistanceRun;
	private final double maxDistanceJump;
	private final double maxDistanceSwim;
	private final boolean isSwimAnimal;

	/*
	 * Конструктор для наследования. Создаём животное
	 */
	protected Animals(String nameAnimal, double maxDistanceRun, double maxDistanceJump, double maxDistanceSwim, boolean isSwimAnimal) {
		this.nameAnimal = nameAnimal;
		this.maxDistanceRun = maxDistanceRun;
		this.maxDistanceJump = maxDistanceJump;
		this.maxDistanceSwim = maxDistanceSwim;
		this.isSwimAnimal = isSwimAnimal;
	}

	/*
	 * Бегаем
	 */
	public void run(double distanceRun) {
		if (maxDistanceRun >= distanceRun) {
			System.out.println(nameAnimal + RAN_TXT);
		} else {
			System.out.println(nameAnimal + DIDNT_RAN_TXT);
		}
	}

	/*
	 * Плаваем
	 */
	public void swim(double distanceSwim) {
		//надо подумать
		if (isSwimAnimal) {

			if (maxDistanceSwim >= distanceSwim) {
				System.out.println(nameAnimal + SWIM_TXT);
			} else {
				System.out.println(nameAnimal + DIDNT_SWAM_TXT);
			}

		} else {
			System.out.println(nameAnimal + DONT_SWIM_TXT);
		}
	}

	/*
	 * Прыгаем
	 */
	public void jump(double distanceJump) {
		if (maxDistanceJump >= distanceJump) {
			System.out.println(nameAnimal + JUMPED_TXT);
		} else {
			System.out.println(nameAnimal + DIDNT_JUMPED_TXT);
		}
	}

	protected double getMaxDistanceRun() {
		return maxDistanceRun;
	}

	protected String getNameAnimal() {
		return nameAnimal;
	}
}
