public class CargoInformation {
    private final int weight;
    private final String deliveryAdress;
    private final boolean flip;
    private final String registrationNumber;
    private final boolean fragile;
    private final Dimensions dimensions;
    private String items;

    public CargoInformation(Dimensions dimensions, int weight, String deliveryAdress, boolean flip, String registrationNumber, boolean fragile){
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.flip = flip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoInformation setDimensions (Dimensions dimensions) {
        return new CargoInformation(dimensions, weight, deliveryAdress, flip,  registrationNumber, fragile);
    }

    public Dimensions getDimensions (){
        return dimensions;
    }

    public int getWeight(){
        return weight;
    }

    public CargoInformation  setWeight(int weight) {
        return new CargoInformation(dimensions, weight, deliveryAdress, flip,registrationNumber, fragile);
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public CargoInformation setDeliveryAdress (String deliveryAdress) {
        return new CargoInformation(dimensions, weight, deliveryAdress, flip, registrationNumber, fragile);
    }


    public boolean isFlip() {
        return flip;
    }

    public CargoInformation setFlip(boolean flip) {
        return new CargoInformation(dimensions, weight, deliveryAdress, flip, registrationNumber, fragile);
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(dimensions, weight, deliveryAdress,flip, registrationNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public CargoInformation setFragile(boolean fragile) {
        return new CargoInformation(dimensions, weight, deliveryAdress, flip, registrationNumber, fragile);
    }

    public String toString() {
        return "Информация о грузе: " + "\n" + "Габариты " + "\n" + "Вес" + weight + " кг " + "\n" + "Адрес доставки :" + deliveryAdress + "\n" + "Можно переворачивать :" + flip + "\n" + "Регистрационный номер " + registrationNumber + "\n" + "Хрупкий " + fragile + "\n";
    }
}
