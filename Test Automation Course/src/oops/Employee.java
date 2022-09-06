package oops;

public class Employee {

	public String Name;
	public int EmpId;
	public String Department;
	public String Role;	
	public String Gender;
	
	public Employee() {
		
		System.out.println("Default Cons");
		
	}
	
	public Employee(String P1, int P2, String P3, String P4, String P5) {
		
		Name = P1;
		EmpId = P2;
		Department = P3;
		Role = P4;
		Gender = P5;
		
	}
	
	
	public void Display() {
		
		System.out.println(Name); 
		System.out.println(EmpId);
		System.out.println(Department);
		System.out.println(Role);
		System.out.println(Gender);
	}

}
