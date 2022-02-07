package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String in;
        Integer sum = 0;
        Scanner input = new Scanner(System.in);
        in = input.nextLine();
        for (int i = 0; i < in.length(); i++) {
            int number = in.charAt(i) - '0';
            if ((number==1)||(number==2)||(number==3)||(number==4)||(number==5)||(number==6)||(number==7)||(number==8)||(number==9)){
                sum+=number;
            }
        }
        System.out.println("Сумма цифр равна: " + sum);
    }
}
