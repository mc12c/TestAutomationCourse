package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Function to display Employee details
		Employee E1 = new Employee();
		E1.Name = "Mike";
		E1.EmpId = 1000523;
		E1.Department = "HR";
		E1.Role = "Recruitment";
		E1.Gender = "Non-Binary";
		E1.Display();

		//Function example below is to limit the amount of code required to add a new employee
		System.out.println("");//this is just spacing
		Employee E2 = new Employee("Jack", 1001555, "Finance", "Accountable Manager", "Male");
		E2.Display();
		
		System.out.println(""); //this is just spacing
		Employee E3 = new Employee("Marc", 0505066, "Product", "BA", "Bisexual");
		E3.Display();
		
		System.out.println("");//this is just spacing
		Bank B = new Bank();
		B.DisplayBalance();
		int Bal = B.GetBalance();
		
		System.out.println("The Balance is " + B.GetBalance());
		//The below Sysout is the same as above to get the Balance
		System.out.println("The Balance is " + Bal);
		
		System.out.println("");//this is just spacing
		BOABank B1 = new BOABank();
		
		B1.CCBalance();
		B1.DisplayBalance();
		
		B1.AccountNum = 10000000;
		
		BOASisterBank B2 = new BOASisterBank();
		
		B2.CCBalance();
		B2.DisplayBalance();
		
		B2.AccountNum = 0;
		
		// Compile Time Polymorphism example
		System.out.println("");//this is just spacing
		OverLoadingExample obj =new OverLoadingExample();
		
		int RecArea = obj.GetArea(3, 4);
		int SqArea = obj.GetArea(4);
		System.out.println("The Area is " + RecArea);
		System.out.println("The Squared Area is " + SqArea);
		
		
		System.out.println("");//this is just spacing
		B1.CloseAccount(123456);
		B.CloseAccount(123456);
		
		//Overriding Abstraction Example
		System.out.println("");//this is just spacing
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.Show();
		
		Browser Br = new Chrome();
	
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		System.out.println("");//this is just spacing
		Firefox Ff = new Firefox();
		Ff.OpenBrowser();
		Ff.Show();
		
		Browser Br1 = new Firefox();
		
		Br1.OpenBrowser();
		Br1.CloseBrowser();
		Br1.DisplayName();		
		
		//Abstraction Example
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		//System.out.println(car1);
		
		//Encapsulation Example
		System.out.println("");//this is just spacing
		EncapsulationEx En = new EncapsulationEx();
		En.setBalance(3000);
		
		System.out.println("Encapsulation Example - the balance is " + En.getBalance());

		
		
		
	}
}
