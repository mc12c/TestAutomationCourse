package test;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// displays * from 1-10 
		for(int i=1;i<=10;i++) {

			int j = 1;

			while(j<=i) {
				System.out.print("*");
				j++;
			}

			System.out.println();
		}

	}

}


