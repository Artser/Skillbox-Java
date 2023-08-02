package practice;

public class BankAccount {
    private double score;

    public double getAmount() {
        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету
        return score;

    }

    public void setScore(double score) {
        this.score = score;
    }


    public void put(double amountToPut) {
        //TODO: реализуйте метод и удалите todo
        // метод зачисляет деньги на счет
        if (amountToPut > 0) {
            score = score + amountToPut;
        }
    }

    public void take(double amountToTake) {
        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
        if (amountToTake <= score) {
            score = score - amountToTake;
        }
    }
}
