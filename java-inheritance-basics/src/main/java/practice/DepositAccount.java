package practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount {
    private Calendar lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = Calendar.getInstance();
    }

    @Override
    public void take(double amountToTake) {
        Calendar income = Calendar.getInstance();
        Calendar copyOfLastIncome = new GregorianCalendar(lastIncome.get(Calendar.YEAR),
                lastIncome.get(Calendar.MONTH), lastIncome.get(Calendar.DATE));
        copyOfLastIncome.add(Calendar.MONTH, 1);
        if (income.after(copyOfLastIncome) && amountToTake <= getAmount()) {
            setScore(getAmount() - amountToTake);
        }
    }
}