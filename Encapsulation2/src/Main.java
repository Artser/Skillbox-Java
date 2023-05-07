import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /*Код для Elevator
        Elevator elevator = new Elevator(-3, 26);

        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        Dimensions dimensions1 = new Dimensions(3,2,1);
        dimensions1 = dimensions1.setHeight(5);

        CargoInformation cargoOrders1 = new CargoInformation(dimensions1,5,"г.Спб, ул.Садовая, д.12",
                true,"NA985623",false);


        System.out.println(cargoOrders1);

    }
}