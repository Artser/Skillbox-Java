public class Keyboard {
    private final KeyboardType type;
    private final KeyboardIlluminate illuminate;
    private final int weight;

    public Keyboard (KeyboardType type, KeyboardIlluminate illuminate, int weight){
        this.type = type;
        this.illuminate = illuminate;
        this.weight = weight;
    }

    public KeyboardType getType(){
        return type;
    }

    public KeyboardIlluminate getIlluminate() {
        return illuminate;
    }

    public int getWeight() {
        return weight;
    }


    public Keyboard setKeyboardType(KeyboardType type){
        return new Keyboard(type, illuminate, weight);
    }
    public Keyboard setKeyboardIlluminate(KeyboardIlluminate illuminate){
        return new Keyboard(type, illuminate,weight);
    }

    public Keyboard setWeight(int weight){
        return new Keyboard(type,illuminate, weight);
    }
}
