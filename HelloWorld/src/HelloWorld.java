
public class HelloWorld {

	public static void main(String[] args) {

		char myChar = 'D';
		
		char myUnicode = '\u00A9';
		String myString = "Copyright" + myUnicode;
		
		System.out.println("My char: " + myChar);
		System.out.println("My Unicode: " + myUnicode);
		System.out.println("My Copyright: " + myString);
	}

}
