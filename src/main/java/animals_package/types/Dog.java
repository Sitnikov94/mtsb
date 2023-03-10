package animals_package.types;

import animals_package.Animals;
import animals_package.calculations.ResultAnimal;

public class Dog extends Animals {
	final static int maxDistanceRun = 500;
	final static double maxJump = 0.5;
	final static int maxSwim = 10;
	final static boolean isSwimAnimal = true;
	final static String nameAnimal = "Пёсик";


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
