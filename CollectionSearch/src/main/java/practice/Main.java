package practice;

import java.util.*;

/**
 * Реализовать методы класса CoolNumbers
 * посчитать время поиска вводимого номера в консоль в каждой из структуры данных
 * проанализировать полученные данные
 */
public class Main {

    public static void main(String[] args) {
        String number = "Н555НН100";
        List list = CoolNumbers.generateCoolNumbers();
        System.out.println("Количество номеров: " + list.size());

        long time1 = System.nanoTime();
        String search = CoolNumbers.bruteForceSearchInList(list, number) ? "найден" : "не найден";
        long time2 = System.nanoTime();
        String time = Long.toString(time2 - time1);
        System.out.println("Бинарный поиск: номер" + search + ", поиск занял " + time + "нс");


        HashSet<String> hashSet = new HashSet<>(list);
        time1 = System.nanoTime();
        search = CoolNumbers.searchInHashSet(hashSet, number) ? "найден":"не найден";
        time2 = System.nanoTime();
        time = Long.toString(time2 - time1);
        System.out.println("Поиск в HashSet: номер" + search + ", поиск занял " + time + " нс");

        TreeSet<String> treeSet = new TreeSet<>(list);
        time1 = System.nanoTime();
        search = CoolNumbers.searchInTreeSet(treeSet, number) ? "найден" : "не найден";
        time2 = System.nanoTime();
        time = Long.toString(time2 - time1);
        System.out.println("Поиск в TreeSet: " + search + ", поиск занял " + time + " нс");
    }
}