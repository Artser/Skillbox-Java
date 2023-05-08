import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         //Код для Elevator
        /*Elevator elevator = new Elevator(-3, 26);

        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        Dimensions dimensions1 = new Dimensions(3,1,2);
        Dimensions dimensions2 = dimensions1.setHeight(5);
        System.out.println(dimensions1);
        System.out.println(dimensions2);

        CargoInformation cargoOrders1 = new CargoInformation(dimensions1,5,"г.Ростов-на-Дону",
                true,"344038",false);
CargoInformation cargoOrders2 = cargoOrders1.setDimensions(dimensions2);

        System.out.println(cargoOrders1);
        System.out.println(cargoOrders2);

    }
}