public class Ram {
private final RamType type; // тип
    private final int volume;//объем
    private final int weight;

    public Ram (RamType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RamType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }


    public int getWeight() {
        return weight;
    }

    public Ram setRamType(RamType type) {
        return new Ram(type, volume, weight);
    }

    public Ram setVolume(int volume){
        return new Ram(type, volume, weight);
    }

    public Ram setWeight(int weight) {
        return new Ram(type, volume, weight);
    }
}
