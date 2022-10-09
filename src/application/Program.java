package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name Department: ");
		String name = sc.nextLine();
		
		System.out.print("Payment Day: ");
		int payDay = sc.nextInt();
		
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		
		System.out.print("Phone: ");
		String phone = sc.nextLine();
		
		Department depart = new Department(name, payDay, new Address(email,phone));
		
		System.out.print("How many employees does the department have ?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
						
			System.out.println("Employee data " + (i+1) + ": ");
			System.out.print("Name: ");
			String nameE = sc.next();
			
			System.out.print ("Salary: ");
			double salary = sc.nextDouble();
		
			Employee emp = new Employee(nameE,salary); 
			
			depart.addEmployee(emp);
		}
		
		showReport(depart);
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println();
		System.out.println("PayRoll");
		System.out.println("Sales Department = R$ " + dept.toString());
		System.out.println("Payment made on the " + dept.getPayDay());
		System.out.println("Employees: ");
		
		for (Employee list : dept.getEmp()) {
			System.out.println(list.getName());
		}
		System.out.printf("For Questions, please contact: %s" , dept.getAddress().getEmail());
	}
	
}
