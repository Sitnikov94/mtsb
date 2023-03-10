package animals_package;

public class ResultAnimal {
	final static String SUCCESS_RUN_TXT = " пробежал!";
	final static String SUCCESS_SWIM_TXT = " проплыл!";
	final static String SUCCESS_JUMP_TXT = " прыгнул!";
	final static String NOT_SUCCESS_TXT = " не смог!";

	protected static String result;

	public static String resultRun(int distanceRunAnimal, int maxDistanceRun, String nameAnimal) {
		return result = maxDistanceRun >= distanceRunAnimal ? nameAnimal + SUCCESS_RUN_TXT : NOT_SUCCESS_TXT;
	}

	public static String resultJump(int distanceJumpAnimal, int maxJump, String nameAnimal) {
		return result = maxJump >= distanceJumpAnimal ? nameAnimal + SUCCESS_JUMP_TXT : NOT_SUCCESS_TXT;
	}

	public static String resultSwim(int distanceSwimAnimal, int maxSwim, boolean isSwimAnimal, String nameAnimal) {
		return result = maxSwim >= distanceSwimAnimal && isSwimAnimal? nameAnimal + SUCCESS_SWIM_TXT : NOT_SUCCESS_TXT;
	}

}
