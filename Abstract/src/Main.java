import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Company firstCompany = new Company("Our Company", "I.I Ivanov");

        ArrayList<Employee> operators = new ArrayList<>();
        ArrayList<Employee> managers = new ArrayList<>();

        for (int i = 0; i < 270; i++) {
            if (i < 180) {
                operators.add(new Operator("Operator" + (i + 1)));
            }
            if (i >= 180 && i < 260) {
                managers.add(new Manager("Manager " + (i + 1)));
            }
            if (i >= 260) {
                firstCompany.hair(new TopManager("TopManager " + (i + 1)));
            }
        }
        firstCompany.hairAll(operators);
        firstCompany.hairAll(managers);

        if(firstCompany.getSuccessStatus()){
            System.out.println("Компания " + firstCompany.getCompanyTitle() + " преуспевает.Доход " + firstCompany.getIncome() + "\n");
        }else {
            System.out.println("Компания " + firstCompany.getCompanyTitle() + " в упадке. Доход " + firstCompany.getIncome() + "\n");

        }
        System.out.println("Самые высокооплачиваемые сотрудники: ");
        List<Employee> topStaff = firstCompany.getTopSalaryStaff(15);
        for (Employee staff : topStaff) {
            System.out.println(staff);
        }
        System.out.println("Самые низкооплачиваемые сотрудники: ");
        List<Employee> bottomStaff = firstCompany.getLowestSalaryStaff(30);
        for (Employee otherStaff : bottomStaff) {
            System.out.println(otherStaff);
        }
        System.out.print("\n"); // для более удобного чтения результата

        int startStaffCount = firstCompany.getEmployeeCount();
        int endStaffCount = firstCompany.getEmployeeCount() / 2;
        System.out.println("Теперь уволим половину сотрудников.");
        for (int j = startStaffCount; j > endStaffCount; j--) {
            firstCompany.fair(firstCompany.getAllStaff().get(ThreadLocalRandom.current().nextInt(0, j - 1)));  //увольняем случайного сотрудника из списка
        }
        System.out.println("Осталось работать сотрудников: " + firstCompany.getEmployeeCount() + "\n");

        if (firstCompany.getSuccessStatus()) {
            System.out.println("Компания " + firstCompany.getCompanyTitle() + " преуспевает. Доход " + firstCompany.getIncome());
        } else {
            System.out.println("Компания " + firstCompany.getCompanyTitle() + " в упадке. Доход " + firstCompany.getIncome());
        }

        System.out.println("Самые высокооплачиваемые сотрудники: ");
        List<Employee> newTopStaff = firstCompany.getTopSalaryStaff(15);
        for (Employee staff : newTopStaff) {
            System.out.println(staff);
        }
        System.out.println("Самые низкооплачиваемые сотрудники: ");
        List<Employee> newBottomStaff = firstCompany.getLowestSalaryStaff(30);
        for (Employee otherStaff : newBottomStaff) {
            System.out.println(otherStaff);
        }
    }
}