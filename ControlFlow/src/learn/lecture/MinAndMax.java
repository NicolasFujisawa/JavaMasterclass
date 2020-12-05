package learn.lecture;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
        }
        System.out.println("min: " + min + ", max: " + max);
    }
}
