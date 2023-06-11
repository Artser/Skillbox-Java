
package practice.string;

import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");
        String text = new Scanner(System.in).nextLine().trim();
        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text) {

        int number = 1;
        StringBuilder sequentialWords = new StringBuilder().append("(").append(number).append(") ");
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol == ' ') {
                number++;
                sequentialWords.append(" (").append(number).append(") ");
            } else {
                sequentialWords.append(symbol);
            }
        }
        return sequentialWords.toString().trim();
    }
}


/*
package practice.string;

import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");

        String text = new Scanner(System.in).nextLine();
        System.out.println(sequentialWordsNumbers(text));

    }

    public static String sequentialWordsNumbers(String text) {

        StringBuilder resText = new StringBuilder();

        int index = 0;
        int count = 1;
        int space;

        while (index <= text.lastIndexOf("")) {
            space = text.indexOf(" ", index + 1);
            resText.append("(").append(count).append(") ");
            if (space == -1) {
                resText.append(text.substring(index));
                break;
            } else {
                resText.append(text, index, space + 1);
            }
            index = space + 1;
            count++;
        }


        return resText.toString();

    }
}*/
