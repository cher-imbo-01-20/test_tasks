package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Program program = new Program(input);
        System.out.println("Количество гласных: " + program.vowNumb);
        program.sort_output();
        System.out.println("Та же строка, но все гласные заглавные: " + program.vowUp);
    }
}
