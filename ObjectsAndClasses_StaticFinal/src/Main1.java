public class Main1 {
    public static void main(String[] args) {
        Processor processor = new Processor(2.5, 6, "N/A", 10);
        Ram ram = new Ram(RamType.DIMM, 16, 16);
        Hdd hdd = new Hdd(HddType.SSD, 250, 100);
        Screen screen = new Screen(22, ScreenType.VA, 2);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, KeyboardIlluminate.YES, 100);

        Computer computer1 = new Computer("CHINA", "DNS1", processor, ram, hdd, screen, keyboard);
        computer1 = computer1.setProcessor(processor.setFrequency(4).setCores(16).setManufacturer("China").setWeight(15));
        computer1 = computer1.setRam(ram.setRamType(RamType.SO_DIMM).setVolume(32).setWeight(25));
        computer1 = computer1.setHdd(hdd.setHddType(HddType.HDD).setVolume(1000).setWeight(500));
        computer1 = computer1.setScreen(screen.setDiagonal(30).setScreenType(ScreenType.IPS).setWeight(2000));
        computer1 = computer1.setKeyboard(keyboard.setKeyboardType(KeyboardType.MEMBRANE).setKeyboardIlluminate(KeyboardIlluminate.NO).setWeight(200));


        Computer computer2 = new Computer("Russia", "Artser", processor, ram, hdd, screen, keyboard);
        computer2 = computer2.setProcessor(processor.setFrequency(3).setCores(10).setManufacturer("China").setWeight(20));
        computer2 = computer2.setRam(ram.setRamType(RamType.DIMM).setVolume(64).setWeight(30));
        computer2 = computer2.setHdd(hdd.setHddType(HddType.SSD).setVolume(500).setWeight(200));
        computer2 = computer2.setScreen(screen.setDiagonal(64).setScreenType(ScreenType.TN).setWeight(2500));
        computer2 = computer2.setKeyboard(keyboard.setKeyboardType(KeyboardType.OPTOMECHANICAL).setKeyboardIlluminate(KeyboardIlluminate.YES).setWeight(200));

        Computer computer3 = new Computer("Japan", "Tokyo", processor, ram, hdd, screen, keyboard);
        computer3 = computer3.setProcessor(processor.setFrequency(3.5).setCores(6).setManufacturer("Japan").setWeight(10));
        computer3 = computer3.setRam(ram.setRamType(RamType.DIMM).setVolume(4).setWeight(20));
        computer3 = computer3.setHdd(hdd.setHddType(HddType.HDD).setVolume(250).setWeight(250));
        computer3 = computer3.setScreen(screen.setDiagonal(12).setScreenType(ScreenType.IPS).setWeight(3000));
        computer3 = computer3.setKeyboard(keyboard.setKeyboardType(KeyboardType.ANALOG_OPTICAL).setKeyboardIlluminate(KeyboardIlluminate.YES).setWeight(300));



        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);
        System.out.println();
        System.out.println(computer3);

    }
}
