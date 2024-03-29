import java.math.BigDecimal;

public interface Employee extends Comparable<Employee> {
    BigDecimal getMonthSalary();
    void setSalary();
    void setZeroSalary(); // это общие методы для всех сотрудников, находящихся в едином списке

    @Override
    default int compareTo(Employee employee) {
        return getMonthSalary().compareTo(employee.getMonthSalary());
    }
}