package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    public static int boxes;
    public static int container = 1;
    public static int truck = 1;
    public static int containerInTruck = 12;
    public static int boxInContainer = 27;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество коробок : ");

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        System.out.println();


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
        System.out.println("Грузовик " + truck + ":");
        System.out.println("Контейнер " + container + ":");

        for (int box = 1; box <= boxes; box++){
            System.out.println("\tЯщик " + box);
            if (box % boxInContainer == 0){
                container++;
                if (container % containerInTruck == 1){
                    truck++;
                    System.out.println();
                    System.out.println("Грузовик " + truck + ":");
                }
                System.out.println("Контейнер " + container + ":");
            }

        }
        System.out.println();
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + truck + " шт.");
        System.out.println("контейнеров - " + container + " шт.");

    }

}
