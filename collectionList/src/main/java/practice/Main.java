package practice;

import java.util.Scanner;

public class Main {
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        boolean work = true;
        while (work) {
            System.out.println("Введите команду:");
            String input = new Scanner(System.in).nextLine();
            String[] commandElements = input.split(" ");

            int index = commandElements.length > 1 ? isDigits(commandElements[1]) : -1;


            switch (commandElements[0].toUpperCase()) {
                case ("ADD"):
                    if (index >= 0) {
                        todoList.add(index, getCase(commandElements, 2));
                    } else {
                        todoList.add(getCase(commandElements, 1));
                    }
                    break;
                case ("EDIT"):
                    todoList.edit(index, getCase(commandElements, 2));
                    break;
                case ("LIST"):
                    todoList.getTodos();
                    break;
                case ("DELETE"):
                    todoList.delete(index); break;
                default: work = false;
            }
        }
    }

    private static int isDigits(String text) {
        try {
            int i = Integer.parseInt(text);
            return i >= 0 ? i : -1;
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    private static String getCase(String[] array, int begin) {
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < array.length; i++){
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
}