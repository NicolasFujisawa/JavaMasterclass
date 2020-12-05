package learn.lecture;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter < 10){
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
                scanner.next();
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
