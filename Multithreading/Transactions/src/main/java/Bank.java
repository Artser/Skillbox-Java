import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank {

    private ConcurrentMap<String, Account> accounts = new ConcurrentHashMap<>();
    private final Random random = new Random();
    public static final long fraudLimit = 50000;

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccNumber(), account);
    }

    public boolean isEnoughMoney(long fromAccountMoney, long amount) {
        return fromAccountMoney >= amount;
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */

    public void transfer(String fromAccountNum, String toAccountNum, long amount) {
        boolean check = false;
        Account fromAccount = accounts.get(fromAccountNum);
        Account toAccount = accounts.get(toAccountNum);
        if (!fromAccount.getStatus() && !toAccount.getStatus() && isEnoughMoney(fromAccount.getMoney(), amount)) {
            Account syn1 = fromAccountNum.compareTo(toAccountNum) < 0 ? fromAccount : toAccount;
            Account syn2 = fromAccountNum.compareTo(toAccountNum) < 0 ? toAccount : fromAccount;
            synchronized (syn1) {
                synchronized (syn2) {
                    fromAccount.setMoney(fromAccount.getMoney() - amount);
                    toAccount.setMoney(toAccount.getMoney() + amount);
                    if (amount > fraudLimit) {
                        try {
                            check = isFraud(fromAccountNum, toAccountNum, amount);

                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                        if (check) {
                            fromAccount.blockAccount();
                            toAccount.blockAccount();
                        }
                    }
                }
            }
        }
    }
public synchronized long getBalance (String accountNum){
        return accounts.get(accountNum).getMoney();
}

public synchronized long getSumAllAccounts(){
        long sumAllAccounts = 0;
        for (ConcurrentMap.Entry< String,Account> item : accounts.entrySet()){
            sumAllAccounts += item.getValue().getMoney();
        }
        return sumAllAccounts;
}

    public void setAccounts(ConcurrentMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public String[] getAccountsNumbers(){
        int n = accounts.size();
        return accounts.keySet().toArray(new String[n]);
    }
}