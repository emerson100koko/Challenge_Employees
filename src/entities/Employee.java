package entities;

public class Employee {
	
	private String nameE;
	private double salary;
	
	public Employee(String name, double salary) {
		this.nameE = name;
		this.salary = salary;
	}
	
	public Employee() {
	}
	
	public String getName() {
		return nameE;
	}

	public void setName(String name) {
		this.nameE = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}