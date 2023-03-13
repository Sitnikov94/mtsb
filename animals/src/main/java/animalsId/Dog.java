package animalsId;

public class Dog extends Animals {

	/*
	 * Передаём данные в родитель
	 */
	public Dog(String nameAnimal, double maxDistanceRun, double maxDistanceJump, double maxDistanceSwim, boolean isSwimAnimal) {
		super(nameAnimal, maxDistanceRun, maxDistanceJump, maxDistanceSwim, isSwimAnimal);
	}
}
