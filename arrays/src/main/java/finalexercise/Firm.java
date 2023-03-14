package finalexercise;

public class Firm {

	private Employee[] employees;

	public Firm(Employee[] employees) {
		this.employees = employees;
	}

	public void printInfoAllEmployyes() {
		tableHeader();
		for (int i = 0; i < employees.length; i++){
			employees[i].fullInfoEmp();
		}
		System.out.println();
	}

	public void printInfoEmployyesOlderThan (int age) {
		tableHeader();
		for (int i = 0; i < employees.length; i++){
			if (employees[i].getAge() > age) {
				employees[i].fullInfoEmp();
			}
		}
		System.out.println();
	}


	public void tableHeader() {
		System.out.printf("%15s%32s%22s%24s%23s%n", "ФИО", "Должность", "ОМТ", "Зарплата", "Возраст");
	}

	public void changeSalary(int age, double increase) {
		for (int i = 0; i < employees.length; i++){
			if (employees[i].getAge() > age) {
				employees[i].setSalary(employees[i].getSalary() + increase);
			}
		}
		printInfoAllEmployyes();
	}

}
