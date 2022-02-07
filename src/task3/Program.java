package task3;

import java.util.ArrayList;

public class Program {
    int vowNumb;
    String vowUp;
    String input;
    ArrayList<Character> vowels = new ArrayList() {{
        add('а');       add('А');
        add('и');       add('И');
        add('е');       add('Е');
        add('ё');       add('Ё');
        add('о');       add('О');
        add('у');       add('У');
        add('ы');       add('Ы');
        add('э');       add('Э');
        add('ю');       add('Ю');
        add('я');       add('Я');
    }};
    ArrayList<String> words = new ArrayList();
    public Program(String input) {
        this.input  = input;
        vowels_count();
        //vowelsUp();
    }
    void intoWords() {
        int pos1 = 0;
        int pos2 = 0;
        input = input + " ";
        for (int i=0; i<input.length(); i=pos2+2) {
            pos1=i;
            for (int j=i; (input.charAt(j)!=' '); j++) {
                pos2=j;
            }
            words.add(input.substring(pos1,pos2+1));
        }
    }
    void vowels_count() {
        vowNumb = 0;
        for (int i=0; i<input.length(); i++) {
            if (vowels.contains(input.charAt(i))) {
                vowNumb++;
            }
        }
    }
    void sort_output() {

        System.out.println("x3");
    }
    void vowelsUp() {
        intoWords();
        for (int i=0; i < words.size(); i++) {
            String current_word = words.get(i);
            for (int j=0; j < current_word.length(); j++) {
                if (vowels.contains(current_word.charAt(j))) {
                   if (j==0) {
                       words.add(i,current_word.substring(0, 1).toUpperCase() +
                               current_word.substring(1));
                       break;
                   }
                   else if (j==current_word.length()-1) {
                       words.add(i,current_word.substring(0, current_word.length()) +
                               current_word.substring(current_word.length()-1,current_word.length()).toUpperCase());
                       break;
                   } else {
                       words.add(i, current_word.substring(0, j) +
                               current_word.substring(j, j + 1).toUpperCase() +
                               current_word.substring(j + 1));
                       break;
                   }
                }
            }
        }
        vowUp=words.get(0);
        for (int i=1; i < words.size(); i++) {
            vowUp=vowUp+" "+words.get(i);
        }
    }
}
