package animals_package;

import animals_package.types.*;

public class Animals {
	public static void main(String[] args) {
		Animals dog1 = new Dog();
		dog1.run(1);
		dog1.jump(1);
		dog1.swim(1);

		Animals horse1 = new Horse();
		horse1.run(150);
		horse1.jump(5);
		horse1.swim(40);

		Animals cat1 = new Cat();
		cat1.run(150);
		cat1.jump(5);
		cat1.swim(40);

		Animals bird1 = new Bird();
		bird1.run(150);
		bird1.jump(5);
		bird1.swim(40);
	}

	public void run(int distanceRunAnimal) {
		System.out.println("Будем бегать!");
	}

	public void swim(int distanceSwimAnimal) {
		System.out.println("Будем плавать!");
	}

	public void jump(double distanceJumpAnimal) {
		System.out.println("Будем прыгать!");
	}

}
