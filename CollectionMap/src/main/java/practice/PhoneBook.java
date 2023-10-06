package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    Map<String, String> phoneBookList = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (isPhone(phone) && isName(name)) {
            phoneBookList.put(phone, name);
        }
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку

        return phoneBookList.get(phone) + " - " + phone;
    }

    public Set<String> getContactsByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet

        Set<String> contacts = new TreeSet<>();
        List<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneBookList.entrySet()) {
            if (entry.getValue().equals(name)) {
                phones.add(entry.getKey());
            }
        }
        contacts.add(name + " - " + String.join(", ", phones));
        return contacts;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet

        Set<String> contacts = new TreeSet<>();
        Set<String> phones;
        Map<String, Set<String>> namePhonesOrder = new TreeMap<>();

        for (Map.Entry<String, String> entry : phoneBookList.entrySet()) {
            if (namePhonesOrder.containsKey(entry.getValue())) {
                phones = namePhonesOrder.get(entry.getValue());
            } else {
                phones = new TreeSet<>();
            }
            phones.add(entry.getKey());
            namePhonesOrder.put(entry.getValue(), phones);
        }

        for (Map.Entry<String, Set<String>> entry : namePhonesOrder.entrySet()) {
            contacts.add(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

        return contacts;
    }
// для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */

    public boolean isName(String name) {
        Matcher matcher = Pattern.compile("[А-Я][а-яё]+").matcher(name.trim());
        return matcher.matches();
    }

    public boolean isPhone(String phone) {
        Matcher matcher = Pattern.compile("79\\d{9}").matcher(phone);
        return matcher.matches();
    }

    public void phoneBookStart() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введите номер, имя или команду:");
            input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            if (isName(input)) {
                selectActionToEnterName(input);
            } else if (isPhone(input)) {
                selectActionToEnterPhone(input);
            } else if (input.equalsIgnoreCase("LIST")) {
                for (String contact : getAllContacts()) {
                    System.out.println(contact);
                }
            } else {
                System.out.println("Неверный формат ввода");
            }
        }
    }

    private void selectActionToEnterPhone(String phone) {
        if (phoneBookList.containsKey(phone)) {
            System.out.println(getContactByPhone(phone));
        } else {
            System.out.println("Такого номера нет в телефонной книге. Введите имя абонента для номера: \""
                    + phone + "\"");
            enterNameForNewSubscriber(phone);
        }
    }

    private void enterNameForNewSubscriber(String phone) {
        String input = new Scanner(System.in).nextLine();
        if (isName(input)) {
            addContact(phone, input);
            System.out.println("Контакт сохранен!");
        } else {
            System.out.println("Неверный формат имени абонента. Введите имя абонента для номера телефона: \""
                    + phone + "\"");
            enterNumberForNewSubscriber(phone);
        }
    }

    private void selectActionToEnterName(String name) {
        if (phoneBookList.containsValue(name)) {
            for (String s : getContactsByName(name)) {
                System.out.println(s);
            }
        } else {
            System.out.println("Такого имени нет в телефонной книге. Введите номер телефона для абонента: \""
                    + name + "\"");
            enterNumberForNewSubscriber(name);
        }
    }

    private void enterNumberForNewSubscriber(String name) {
        String input = new Scanner(System.in).nextLine();
        if (isPhone(input)) {
            addContact(input, name);
            System.out.println("Контакт сохранен!");
        } else {
            System.out.println("Неверный формат номера телефона. Введите номер телефона для абонента: \""
                    + name + "\"");
            enterNumberForNewSubscriber(name);
        }
    }
}