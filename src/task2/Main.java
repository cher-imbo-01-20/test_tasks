package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        double number = Double.parseDouble(in);
        if (number%1!=0) {
            System.out.println("Введённое число не является целым");
            System.exit(0);
        }
        else {
            int current = (int) number;
            do {
                do {
                    if (current % 2 == 0) {
                        System.out.print("2 ");
                        current = current / 2;
                    }
                } while (current%2==0);
                for (int i = 3; i <= number; i += 2) {
                    if (current % i == 0) {
                        current = current / i;
                        System.out.print(i + " ");
                    }
                }
            } while (current>1);
        }
    }
}
