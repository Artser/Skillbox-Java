public class Computer {
    private final Processor processor; // процессор
    private final Ram ram; //оперативная память
    private final Hdd hdd;//память накопителя
    private final Screen screen;//экран
    private final Keyboard keyboard;//клавиатура
    private final String vendor;
    private final String name;
    private int totalWeight;

    public Computer(String vendor, String name, Processor processor, Ram ram, Hdd hdd, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(vendor, name, processor, ram, hdd, screen, keyboard);
    }

    public Computer setRam(Ram ram) {
        return new Computer(vendor, name, processor, ram, hdd, screen, keyboard);
    }

    public Computer setHdd(Hdd hdd) {
        return new Computer(vendor, name, processor, ram, hdd, screen, keyboard);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor, name, processor, ram, hdd, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, processor, ram, hdd, screen, keyboard);
    }


    public int getTotalWeight() {
        return totalWeight = totalWeight + getProcessor().getWeight() + getRam().getWeight() + getHdd().getWeight() + getScreen().getWeight() + getKeyboard().getWeight();
    }

    public String toString(){
        return "Computer: " + "\n" +
                "Процессор: " + "Производитель: " + getVendor() + "." + "Название: " + getName() + "." + "Частота: "
                + getProcessor().getFrequency() + "." + "Количество ядер:" + getProcessor().getCores() + "." +
                "Производитель:" + getProcessor().getManufacturer() + "." + "Вес:" + getProcessor().getWeight() + "гр." + "\n" +
                "Оперативная память: "  + "Тип"  + getRam().getType() +". Объем" + getRam().getVolume() +
                ".Вес" + getRam().getWeight() + "гр." + "\n" + "Накопитель информации: " + "Тип:" + getHdd().getType() +
                ".Объем: " + getHdd().getVolume() + ". Вес"+ getHdd().getWeight() + "гр." + "\n" + "Экран: "  + "Диагональ: " +
                getScreen().getDiagonal() + ". Тип: " + getScreen().getType() + ". Вес" + getScreen().getWeight() + " гр." +
                "\n" + "Клаиватура: " + "Тип: " + getKeyboard().getType() + ". Подсветка: " + getKeyboard().getIlluminate() +
                ". Вес: " + getKeyboard().getWeight()+ " гр." + "\n" + "Общий вес оборудования: " + getTotalWeight() + " гр.";
    }
}
