package animals_package.types;

import animals_package.Animals;
import animals_package.calculations.ResultAnimal;

public class Horse extends Animals {
	final static int maxDistanceRun = 1500;
	final static double maxJump = 3;
	final static int maxSwim = 100;
	final static boolean isSwimAnimal = true;
	final static String nameAnimal = "Лошадка";


	@Override
	public void run(int distanceRunAnimal) {
		System.out.println(ResultAnimal.resultRun(distanceRunAnimal, maxDistanceRun, nameAnimal));
	}

	@Override
	public void jump(double distanceJumpAnimal) {
		System.out.println(ResultAnimal.resultJump(distanceJumpAnimal, maxJump, nameAnimal));
	}

	@Override
	public void swim(int distanceSwimAnimal) {
		System.out.println(ResultAnimal.resultSwim(distanceSwimAnimal, maxSwim, isSwimAnimal, nameAnimal));
	}


}
