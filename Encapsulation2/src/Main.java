import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);

        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
        Dimensions dimensions = new Dimensions(3,2,1);

        CargoInformation cargoInfo = new CargoInformation(dimensions, 40, "Ростов-на-Дону, Ленина пр.101", true, "340038", false, dimensions);

        System.out.println("Информация о грузе :" + "\n"
                + "Вес" + cargoInfo.getWeight() + "\n"
                + "Адрес доставки" + cargoInfo.getDeliveryAdress() + "\n"
                + "Можно переворачивать" + cargoInfo.isFlip() + "\n"
                + "Регистрационный номер" + cargoInfo.getRegistrationNumber() + "\n"
                + "Хрупкость" + cargoInfo.isFlip() + "\n"
                + "Обьем груза" + cargoInfo.getDimensions());


    }
}