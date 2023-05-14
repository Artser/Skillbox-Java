public class Hdd {
    private final HddType type; //тип
    private final int volume; // объем
    private final int weight; // вес

    public Hdd(HddType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public HddType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public Hdd setHddType(HddType type){
        return new Hdd(type, volume, weight);
    }

    public Hdd setVolume(int volume){
        return new Hdd(type, volume, weight);
    }

    public Hdd setWeight(int weight){
        return new Hdd(type, volume, weight);
    }
}

