package practice;

import java.util.*;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {
        String[] lettersForNumbers1 = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] lettersForNumbers2 = new String[lettersForNumbers1.length * lettersForNumbers1.length];
        int n = lettersForNumbers1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StringBuilder builder = new StringBuilder();
                lettersForNumbers2[i * n + j] = builder.append(lettersForNumbers1[i]).append(lettersForNumbers1[j]).toString();
            }
        }

        String[] digitsForNumbers = new String[9];
        for (int i = 0; i < digitsForNumbers.length; i++) {
            digitsForNumbers[i] = Integer.toString(((i + 1) * 111));
        }
        List<String> coolNumbers = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            StringBuilder region = new StringBuilder();
            String formatRegion = (i < 10 ? "0" : "") + String.valueOf(i);

            for (int j = 0; j < digitsForNumbers.length; j++) {
                for (int k = 0; k < lettersForNumbers1.length; k++) {
                    for (int l = 0; l < lettersForNumbers2.length; l++) {
                        StringBuilder builder = new StringBuilder();
                        coolNumbers.add(builder.append(lettersForNumbers1[k]).
                                append(digitsForNumbers[j]).append(lettersForNumbers2[l]).
                                append(formatRegion).toString());

                    }
                }
            }

        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list,String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number){
        return Collections.binarySearch(sortedList, number) >=0;
    }

    public static boolean searchInHashSet (HashSet<String> hashSet, String number){

        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number){
        return treeSet.contains(number);
    }
}
