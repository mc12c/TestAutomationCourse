package oops;

public class BOASisterBank extends BOABank{
	
	public int CreditCardNum;
	
	int AccountNum;
	
	public void CCBalance() {
		
		System.out.println("Inside BOA Sister CC Balance");
		
		this.CreditCardNum  = 1000;
		super.AccountNum = 123456;
		this.AccountNum = 7890;
	}
	
	public void CloseAccount(int CCNumber) {
		
		System.out.println("Inside BOA Sister CloseAccount");
	}

}



