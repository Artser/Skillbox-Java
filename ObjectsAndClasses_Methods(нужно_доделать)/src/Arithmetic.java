public class Arithmetic {

    public int a;
    public int b;

public Arithmetic(int a, int b) {
    this.a = a;
    this.b = b;
}

    public int sum(){
    return a + b;
}
    public int multiplication(){
    return a*b;
}

    public int Max(){
    return  Math.max(a, b);
}

    public int Min(){
    return Math.min(a, b);
}


}
