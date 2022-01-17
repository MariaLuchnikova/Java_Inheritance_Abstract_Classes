package practice;

public class IndividualBusinessman extends Client {
    private static final double VALUE_MONEY = 1000;
    private static final double PERCENT_COMMISSIONS_MIN = 0.005;


    @Override
    public double getAmount() {
        System.out.println("Текущий баланс на счете: " + amount + System.lineSeparator());
        System.out.println("Сумма пополнения меньше " + VALUE_MONEY + ", комиссия "
                + PERCENT_COMMISSIONS_MAX * 100 + "%" + System.lineSeparator());
        System.out.println("Сумма пополнения больше либо равна " + VALUE_MONEY + ", комиссия "
                + PERCENT_COMMISSIONS_MIN * 100
                + "%" + System.lineSeparator());
        System.out.println("Списание без комиссии.");
        return amount;
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut < VALUE_MONEY) {
            amountToPut -= amountToPut * PERCENT_COMMISSIONS_MAX;
        } else {
            amountToPut -= amountToPut * PERCENT_COMMISSIONS_MIN;
        }
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }
}
