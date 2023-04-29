package finalexercise;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = new Employee[] {
				new Employee("Ситников Сергей Сергеевич", "Инженер по тестированию",
				"79112223344", 150000, 29),
				new Employee("Овечкина Ольга Геннадиевна", "Инженер по тестированию",
						"79223334455", 150000, 33),
				new Employee("Кузнецов Игорь Вадимович", "Инженер по тестированию",
						"79889990011", 150000, 27),
				new Employee("Барабашкин Евгений Семенович", "Инженер по тестированию",
						"79997368972", 150000, 55),
				new Employee("Джавист Идея", "Инженер по тестированию",
						"79182645726", 150000, 99)
		};

		Firm firm = new Firm(employees);

		firm.printInfoAllEmployees();
		firm.printInfoEmployeesOlderThan(40);
		firm.changeSalary(45, 5000);

	}

}
