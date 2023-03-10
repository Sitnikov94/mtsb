package animals_package;

public class Animal {
	int distanceRunAnimal;
	int distanceSwimAnimal;
	int distanceJumpAnimal;
	boolean isSwimAnimal;



	public void run(int distanceRunAnimal) {
		System.out.println("Будем бегать!");
	}

	public void swim(int distanceSwimAnimal) {
		System.out.println("Будем плавать!");
	}

	public void jump(int distanceJumpAnimal) {
		System.out.println("Будем прыгать!");
	}

}
