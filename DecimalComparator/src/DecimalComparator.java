public class DecimalComparator {
	
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1755));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
		int num1 = (int) (d1 * 1000);
        int num2 = (int) (d2 * 1000);
 
        if (num1 == num2) {
            return true;
        }
        return false;
    }
}
