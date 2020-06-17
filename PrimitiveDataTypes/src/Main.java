
public class Main {

	public static void main(String[] args) {

		/*
		 * byte
		 * char 
		 * short
		 * int
		 * long
		 * float
		 * double
		 * 
		 * */
		
		char myChar = 'D';
		
		char myUnicode = '\u00A9';
		String myString = "Copyright" + myUnicode;
		
		System.out.println("My char: " + myChar);
		System.out.println("My Unicode: " + myUnicode);
		System.out.println("My Copyright: " + myString);
		

	}

}
