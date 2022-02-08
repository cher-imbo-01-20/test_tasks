package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    ArrayList<Integer> numbers = new ArrayList<>();

    public Input() {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        for (int i=0; i<number.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
    }
}
