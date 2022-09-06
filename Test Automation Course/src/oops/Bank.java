package oops;

public class Bank {
	
	public int AccountNum;
	
	protected void DisplayBalance() {
		
		System.out.println("Inside DisplayBalance Balance");
	}
	
	public int GetBalance() {
		
		return 500;
	}
	
	public void CloseAccount(int AccountNum) {
		
		System.out.println("Inside Bank CloseAccount");
	}
}
