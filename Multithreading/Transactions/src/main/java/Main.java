import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 0; i < 100; ++i) {
            final String someClientAccount = "408" + RandomStringUtils.randomNumeric(15);
            final long amount = (long) (Math.random() * (99999 - 10000) + 10000) + 50000;
            Account client = new Account(someClientAccount, amount);
            System.out.println(client);
            bank.addAccount(client);
        }
        long sumBank = bank.getSumAllAccounts();
        System.out.println("Amount in all bank accounts: " + sumBank + " rub.");

        String[] accountsNumbers = bank.getAccountsNumbers();

        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            final int ii = i;
            threadList.add(
                    new Thread(() -> {
                        System.out.println("Старт поток " + (ii + 1));
                        for (int t = 0; t < 100; t++) {
                            int k = RandomUtils.nextInt(0, accountsNumbers.length);
                            int l = RandomUtils.nextInt(0, accountsNumbers.length);
                            long transferMoney = (long) (Math.random() * (50100) + 5);
                            try {
                                bank.transfer(accountsNumbers[k], accountsNumbers[1], transferMoney);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println("стоп поток " + (ii + 1));
                    })
            );
        }
        long before = new java.util.Date().getTime();
        threadList.forEach(Thread :: start);
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("После завершения всех потоков:");

        long sumBankEnd = bank.getSumAllAccounts();
        System.out.println("Amount in all bank accounts: " + sumBankEnd + " rub.");
        long difference = Math.abs(sumBankEnd - sumBank);
        System.out.println(difference >0 ? "difference: " + difference : "Sum is the same");

        System.out.println("Потрачено секунд: " + (new java.util.Date().getTime() - before)/(double)1000);
    }
}
