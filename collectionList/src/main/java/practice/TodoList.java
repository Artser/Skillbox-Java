package practice;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<String> list = new ArrayList<>();

    public void add(String todo) {
        // добавьте переданное дело в конец списка
        list.add(todo);
        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void add(int index, String todo) {
//  добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index >= 0 && index < list.size()) {
            list.add(index, todo);
            System.out.println("Добавлено дело \"" + todo + "\"");
        } else {
            add(todo);
        }
    }

    public void edit(int index, String todo) {
        // заменить дело на index переданным  индекс
        //  проверьте возможность изменения
        if (index >= 0 && index < list.size()) {
            String previousTodo = list.set(index, todo);
            System.out.println("Дело \"" + previousTodo + "\" заменено на \"" + todo + "\"");
        } else {
            System.out.println("Неверная команда. Укажите индекс редактируемого дела" + " значением не более " + (list.size() - 1));
        }

    }

    public void delete(int index) {
        // удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела

        if (index >= 0 && index < list.size()) {
            String caseBeingDeleted = list.get(index);
            list.remove(index);
            System.out.println("Дело \"" + caseBeingDeleted + "\" удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
            System.out.println("Неверная команда. Укажите индекс удаляемого дела" + " значением не более " + (list.size() - 1));

        }
    }

    public List<String> getTodos() {
// вернуть список дел
        System.out.println("Список дел:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Работа номер: " + i + " " + list.get(i));
        }
        return list;
    }

}
