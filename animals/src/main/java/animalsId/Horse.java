package animalsId;

public class Horse extends Animals {

	/*
	 * Передаём данные в родитель
	 */

	public Horse(String nameAnimal, double maxDistanceRun, double maxDistanceJump, double maxDistanceSwim, boolean isSwimAnimal) {
		super(nameAnimal, maxDistanceRun, maxDistanceJump, maxDistanceSwim, isSwimAnimal);
	}
}
