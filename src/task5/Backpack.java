package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Backpack {
    int capacity;
    ArrayList<Integer> obj_value = new ArrayList<>();
    ArrayList<Integer> obj_weight = new ArrayList<>();
    ArrayList<Integer[]> prog = new ArrayList<>();

    public Backpack() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите объём сейфа: ");
        capacity = in.nextInt();
        System.out.println("-----Чтобы закончить ввод, введите -1 в поле ценности-----");
        int input;
        obj_value.add(0);
        obj_weight.add(0);
        while (true) {
            System.out.print("Введите ценность предмета: ");
            input = in.nextInt();
            if (input==-1) { break ;}
            obj_value.add(input);
            System.out.print("Введите объём предмета: ");
            input = in.nextInt();
            obj_weight.add(input);
        }
        Integer[] array = new Integer[capacity+1];
        for (int j=0; j<=capacity; j++) {
            array[j]=0;
        }
        for (int i = 0; i<=obj_value.size(); i++) {
            prog.add(i, array);
        }
    }
    int count_max() {
        int previous;
        int counted;
        for (int i=1; i<obj_value.size(); i++) {
            for (int j=1; j<=capacity; j++) {
                if (obj_weight.get(i) > j) {
                    (prog.get(i))[j] = (prog.get(i - 1))[j];
                } else {
                    previous = (prog.get(i - 1))[j];
                    counted = obj_value.get(i) + (prog.get(i - 1))[Math.abs(j - obj_weight.get(i))];
                    (prog.get(i))[j] = Math.max(previous, counted);
                }
            }
        }
        return (prog.get(obj_value.size()-1))[capacity];
    }
}
