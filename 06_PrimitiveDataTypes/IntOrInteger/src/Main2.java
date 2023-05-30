public class Main2 {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount() + "\n");

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.(код ниже)

        for (int i =0;i<65536;i++){
            char c = (char) i;
            if (c>='А'&&c<='я'||c=='Ё'||c=='ё'){
                System.out.println(i+ "-" +c);
            }
        }
    }
}