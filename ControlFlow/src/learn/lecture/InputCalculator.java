package learn.lecture;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        int sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }
        }
        if (counter > 0) {
            avg = Math.round((double) sum / counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
