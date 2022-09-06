package oops;

public class EncapsulationEx {
	
	//Generate Getters and Setters
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	private int balance;
	
	private String Name;
	
	private String Address;

}
