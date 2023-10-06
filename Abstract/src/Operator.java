import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class Operator implements Employee{
    private String name;
    private BigDecimal salary;

    public Operator(String name)
    {
        this.salary = BigDecimal.valueOf(0.0);
        this.name = name;
    }


    @Override
    public void setSalary(){
        this.salary = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(20000.0, 30000.0));
    }

    @Override
    public void setZeroSalary() {
        this.salary = BigDecimal.valueOf(0.0);
    }

    @Override
    public BigDecimal getMonthSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "Оператор " + this.name + " - " + this.getMonthSalary().setScale(2, RoundingMode.HALF_DOWN);
    }
}