import java.io.File;
import java.util.Arrays;

public class Main {
    private static final int newWidth = 600;
    public static void main(String[] args) {
        String srcFolder = "D:/src";
        String dstFolder = "D:/dst";

        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        int cpuCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Ядер процессора: " + cpuCount);
        int count = files.length / cpuCount;
        for (int i = 0; i < count; i++) {
            int last = i == cpuCount - 1 ? files.length : i * count + count;// зачем минус 1 и что эта строка делает?
            System.out.println("Партия " + (i * count) + " - " + (last-1));
            File[] part = Arrays.copyOfRange(files, i* count, last);
            System.out.println(part.length + "файлов");
            new Multithreading(part, newWidth, dstFolder).start();

        }
        //new Multithreading (files, newWidth, dstFolder).start();
    }
}