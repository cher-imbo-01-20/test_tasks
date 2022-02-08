package task4;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Numbers one = new Numbers(
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ');
        Numbers two = new Numbers(
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ', ' ',
                ' ', ' ', '*', '*', '*', ' ', ' ');
        Numbers three = new Numbers(
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ');
        Numbers four = new Numbers(
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ');
        Numbers five = new Numbers(
                ' ', ' ', '*', '*', '*', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ', ' ',
                ' ', ' ', '*', '*', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', ' ', ' ', ' ');
        Numbers six = new Numbers(
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ', ' ',
                ' ', ' ', '*', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ');
        Numbers seven = new Numbers(
                ' ', ' ', '*', '*', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ');
        Numbers eight = new Numbers(
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ');
        Numbers nine = new Numbers(
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ', ' ');
        Numbers zero = new Numbers(
                ' ', ' ', '*', '*', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', '*', ' ', ' ');
        Input input = new Input();
        Integer max = input.numbers.get(0);
        for (int n = 1; n < input.numbers.size(); n++) {
            if (input.numbers.get(n)>max) {max = input.numbers.get(n);}
        }
        for (int i = 0; i < 7; i++) {
            for (int n = 0; n < input.numbers.size(); n++) {
                Numbers current = new Numbers();
                switch (input.numbers.get(n)) {
                    case 0: {current = zero; break;}
                    case 1: {current = one; break;}
                    case 2: {current = two; break;}
                    case 3: {current = three; break;}
                    case 4: {current = four; break;}
                    case 5: {current = five; break;}
                    case 6: {current = six; break;}
                    case 7: {current = seven; break;}
                    case 8: {current = eight; break;}
                    case 9: {current = nine; break;}
                    default: {break;}
                }
                for (int j = 0; j < 7; j++) {
                    if ((input.numbers.get(n)==max)&&(current.lines[i][j]=='*')){
                        System.out.print(input.numbers.get(n));
                    }
                    else
                    {
                        System.out.print(current.lines[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
