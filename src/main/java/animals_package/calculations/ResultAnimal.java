package animals_package.calculations;

public class ResultAnimal {
	final static String SUCCESS_RUN_TXT = " пробежал!";
	final static String SUCCESS_SWIM_TXT = " проплыл!";
	final static String SUCCESS_JUMP_TXT = " прыгнул!";
	final static String NOT_SUCCESS_TXT = " не может!";
	final static String NOT_SWIM_TXT = " не плавает!";


	protected static String result;


	public static String resultRun(int distanceRunAnimal, int maxDistanceRun, String nameAnimal) {
		return result = maxDistanceRun >= distanceRunAnimal ? nameAnimal + SUCCESS_RUN_TXT : nameAnimal + NOT_SUCCESS_TXT;
	}

	public static String resultJump(double distanceJumpAnimal, double maxJump, String nameAnimal) {
		return result = maxJump >= distanceJumpAnimal ? nameAnimal + SUCCESS_JUMP_TXT : nameAnimal + NOT_SUCCESS_TXT;
	}

	public static String resultSwim(int distanceSwimAnimal, int maxSwim, boolean isSwimAnimal, String nameAnimal) {
		if (isSwimAnimal) {
			return result = maxSwim >= distanceSwimAnimal ? nameAnimal + SUCCESS_SWIM_TXT : nameAnimal + NOT_SUCCESS_TXT;
		} else {
			return result = nameAnimal + NOT_SWIM_TXT;
		}
	}

}
