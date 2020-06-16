
public class Main {

	public static void main(String[] args) {

		//int myValue = 10000;
		int minIntValue = Integer.MIN_VALUE;
		int maxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Int Minimun value: " + minIntValue);
		System.out.println("Int Maximum value: " + maxIntValue);
		System.out.println("Busted MAX value: " + (maxIntValue + 2));
		System.out.println("Busted MIN value:: " + (minIntValue - 2));
		//int myMaxIntTest = 2_147_483_647;
		
		byte myByteMinValue = Byte.MIN_VALUE;
		byte myByteMaxValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimun value: " + myByteMinValue);
		System.out.println("Byte Maximum value: " + myByteMaxValue);
		
		
		short myShortMinValue = Short.MIN_VALUE;
		short myShortMaxValue = Short.MAX_VALUE;
		System.out.println("Short Minimun value: " + myShortMinValue);
		System.out.println("Short Maximum value: " + myShortMaxValue);
		
		long myLongValue = 100L;
		long myLongMinValue = Long.MAX_VALUE;
		long myLongMaxValue = Long.MAX_VALUE;
		System.out.println(myLongValue);
		System.out.println("Long Minimun value: " + myLongMinValue);
		System.out.println("Long Maximum value: " + myLongMaxValue);
		
		long bigLong = 2_147_483_647_890L;
		System.out.println(bigLong);
	}

}
