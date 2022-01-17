package practice;

public abstract class Client {
    protected double amount;
    public static final double PERCENT_COMMISSIONS_MAX = 0.01;

    public abstract double getAmount();

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
            System.out.println("Баланс на счете после операции пополнения: " + amount);
        } else {
            System.out.println("Указана некорректная сумма пополнения.");
        }
    }

    public void take(double amountToTake) {
        if (amountToTake > 0) {
            if (getAmount() < amountToTake) {
                System.out.println("На счете недостаточно средств для списания.");
            } else {
                amount -= amountToTake;
                System.out.println("Баланс на счете после операции списания: " + amount);
            }
        } else {
            System.out.println("Указана некорректная сумма списания.");
        }
    }
}
