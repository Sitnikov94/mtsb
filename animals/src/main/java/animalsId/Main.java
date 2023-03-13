package animalsId;

public class Main {
	public static void main(String[] args) {
		Animals dog1 = new Dog("Пёсик", 500, 0.5, 10, true);
		dog1.run(10);
		dog1.swim(10);
		dog1.jump(10);

		Animals cat1 = new Cat("Котик", 200, 2, 0, false);
		cat1.run(10);
		cat1.swim(10);
		cat1.jump(10);

		Animals bird1 = new Bird("Птичка", 5, 0.2, 0, false);
		bird1.run(10);
		bird1.swim(10);
		bird1.jump(10);

		Animals horse1 = new Horse("Лошадка", 1500, 3, 10, true);
		horse1.run(10);
		horse1.swim(10);
		horse1.jump(10);
	}
}
