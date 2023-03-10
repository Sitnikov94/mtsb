package animals_package;

public class Dog extends Animal {
	final static int maxDistanceRun = 500;
	final static int maxJump = 10;
	final static int maxSwim = 500;
	final static boolean isSwimAnimal = true;
	final static String nameAnimal = "Пёсик";


	@Override
	public void run(int distanceRunAnimal) {
		System.out.println(ResultAnimal.resultRun(distanceRunAnimal, maxDistanceRun, nameAnimal));
	}

	@Override
	public void jump(int distanceJumpAnimal) {
		System.out.println(ResultAnimal.resultJump(distanceJumpAnimal, maxJump, nameAnimal));
	}

	@Override
	public void swim(int distanceSwimAnimal) {
		System.out.println(ResultAnimal.resultSwim(distanceSwimAnimal, maxSwim, isSwimAnimal, nameAnimal));
	}


}
