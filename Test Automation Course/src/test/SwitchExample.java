package test;

// Example using a Switch Case to count number of vowels in a String - this is a more efficient way than the VowelsCheck class
public class SwitchExample { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World uuuu";
		int count =0;

		for(int index=0;index<str.length();index++) {

			char ch = str.charAt(index);

			switch(ch) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			}

		}

		System.out.println("Total vowels are " + count);

	}

}
