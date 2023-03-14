package finalexercise;

public class Firm {

<<<<<<< HEAD
	private Employee[] employees;
=======
	private final Employee[] employees;
>>>>>>> 2f8bd6a (Массивы)

	public Firm(Employee[] employees) {
		this.employees = employees;
	}

<<<<<<< HEAD
	public void printInfoAllEmployyes() {
=======
	public void printInfoAllEmployees() {
>>>>>>> 2f8bd6a (Массивы)
		tableHeader();
		for (int i = 0; i < employees.length; i++){
			employees[i].fullInfoEmp();
		}
		System.out.println();
	}

<<<<<<< HEAD
	public void printInfoEmployyesOlderThan (int age) {
=======
	public void printInfoEmployeesOlderThan(int age) {
>>>>>>> 2f8bd6a (Массивы)
		tableHeader();
		for (int i = 0; i < employees.length; i++){
			if (employees[i].getAge() > age) {
				employees[i].fullInfoEmp();
			}
		}
		System.out.println();
	}

<<<<<<< HEAD

=======
>>>>>>> 2f8bd6a (Массивы)
	public void tableHeader() {
		System.out.printf("%15s%32s%22s%24s%23s%n", "ФИО", "Должность", "ОМТ", "Зарплата", "Возраст");
	}

	public void changeSalary(int age, double increase) {
		for (int i = 0; i < employees.length; i++){
			if (employees[i].getAge() > age) {
				employees[i].setSalary(employees[i].getSalary() + increase);
			}
		}
<<<<<<< HEAD
		printInfoAllEmployyes();
=======
		printInfoAllEmployees();
>>>>>>> 2f8bd6a (Массивы)
	}

}
