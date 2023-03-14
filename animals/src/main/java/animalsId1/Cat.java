package animalsId1;

public class Cat extends Animals {

	/*
	 * Передаём данные в родитель
	 */
	public Cat(String nameAnimal, double maxDistanceRun, double maxDistanceJump, double maxDistanceSwim, boolean isSwimAnimal) {
		super(nameAnimal, maxDistanceRun, maxDistanceJump, maxDistanceSwim, isSwimAnimal);
	}
}
