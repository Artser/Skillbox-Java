package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> emailList = new TreeSet<>();

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");// не понимаю эту строчку
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        email = email.toLowerCase();
        if (isValidEmail(email)) {
            emailList.add(email);
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> list = new ArrayList<>();
        list.addAll(emailList);
        //return new ArrayList<>();
        return list;
    }

}
