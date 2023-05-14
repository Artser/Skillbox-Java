public class Processor {
    private final double frequency; //частота
    private final int cores; //количество ядер
    private final String manufacturer; //производитель
    private final int weight;//вес


    public Processor(double frequency, int cores, String manufacturer, int weight){
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Processor setFrequency(double frequency){
        return new Processor(frequency, cores, manufacturer, weight);
    }

    public Processor setCores(int cores){
        return new Processor(frequency, cores, manufacturer, weight);
    }

    public Processor setManufacturer(String manufacturer){
        return new Processor(frequency, cores, manufacturer, weight);
    }

    public Processor setWeight (int weight){
        return new Processor(frequency, cores, manufacturer, weight);
    }

    public int getWeight() {
        return weight;
    }
}
