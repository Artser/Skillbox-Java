package practice.twoDimensionalArray;
//откуда его запускать - этот код
public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] cross = new char[size][size];

        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross.length; j++) {
                if (i == j || i + j == (size - 1)) {
                    cross[i][j] = SYMBOL;
                } else {
                    cross[i][j] = ' ';
                }
            }
        }
        return cross;
        
        //return new char[0][0];
    }
}
