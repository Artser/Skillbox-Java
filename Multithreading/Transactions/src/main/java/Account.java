import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Account {
    private long money;
    private String accNumber;
    private Boolean isBlocked;

    public  Account(String accNumber, Long money) {
        this.accNumber = accNumber;
        this.money = money;
        isBlocked = false;
    }

    public boolean getStatus() {
        return isBlocked;
    }

    public void blockAccount(){
        isBlocked = true;
    }

    public String toString() {
        return "You account number: " + getAccNumber() + ". And Your balance: " + getMoney() + " rub.";
    }
}