package finalexercise;

public class Employee {
	private String fullName;
	private String jobTitle;
	private String phoneNumber;
	private double salary;
	private int age;

	protected Employee(String fullName, String jobTitle, String phoneNumber, double salary, int age) {
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void fullInfoEmp() {
		System.out.printf("%-30s%20s%20s%20.2f%20d%n", getFullName(), getJobTitle(), getPhoneNumber(), getSalary(), getAge());
	}


}
