public class Screen {
    private final int diagonal; //диагональ
    private final ScreenType type;
    private final int weight;

    public Screen(int diagonal, ScreenType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Screen setDiagonal(int diagonal) {
        return new Screen(diagonal, type, weight);
    }

    public Screen setScreenType(ScreenType type){
        return new Screen(diagonal, type, weight);
    }

    public Screen setWeight (int weight) {
        return new Screen(diagonal, type, weight);
    }
}
