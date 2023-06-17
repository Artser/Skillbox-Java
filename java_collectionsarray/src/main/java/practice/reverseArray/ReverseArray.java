package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        for (int i = 0; i < strings.length / 2; i++) {//для чего делить на 2
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];//- 1 - i для чего да еще дважды?
            strings[strings.length - i - 1] = temp;
        }
        return strings;
    }

}