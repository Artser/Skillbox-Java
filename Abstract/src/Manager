import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class Manager implements Employee{
    private String name;
    private BigDecimal salary;
    private BigDecimal profit;
    private BigDecimal bonus;

    public Manager(String name) {
        this.name = name;
        this.profit = BigDecimal.valueOf(0.0);
        this.bonus = BigDecimal.valueOf(0.0);
        this.salary = BigDecimal.valueOf(0.0);
    }

    @Override
    public void setSalary(){
        this.profit = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(0, 400000.0));
        this.bonus = profit.multiply(BigDecimal.valueOf(0.05));
        this.salary = BigDecimal.valueOf(25000.0).add(bonus);
    }

    @Override
    public void setZeroSalary()
    {
        this.profit = BigDecimal.valueOf(0.0);
        this.bonus = BigDecimal.valueOf(0.0);
        this.salary = BigDecimal.valueOf(0.0);
    }

    @Override
    public BigDecimal getMonthSalary(){
        return this.salary;
    }

    public BigDecimal getProfit(){
        return this.profit;
    }

    @Override
    public String toString(){
        return "Менеджер " + this.name + " - " + this.getMonthSalary().setScale(2, RoundingMode.HALF_DOWN);
    }
}
