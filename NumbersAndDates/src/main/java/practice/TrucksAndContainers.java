package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    public static int boxes;
    public static int ContainerIndex = 0;
    public static int truck = 0;
    public static int containerInTruck = 12;
    public static int boxInContainer = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        boxes = scanner.nextInt();
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

        for (int i = 1; i <= boxes; i++) {
            if (i % (containerInTruck * boxInContainer) == 1) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }

            if (i % boxInContainer == 1) {
                ContainerIndex++;
                System.out.println("\tКонтейнер: " + ContainerIndex);
            }

            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + truck + " шт.");
        System.out.println("контейнеров - " + ContainerIndex + " шт.");
        truck = 0;
        ContainerIndex = 0;

    }

}
