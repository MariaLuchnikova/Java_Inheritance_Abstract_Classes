package practice;

public class LegalPerson extends Client {

    @Override
    public double getAmount() {
        System.out.println("Текущий баланс на счете: " + amount + System.lineSeparator());
        System.out.println("Пополнение без комиссии." + System.lineSeparator());
        System.out.println("При списании комиссия " + PERCENT_COMMISSIONS_MAX * 100 + "%" + System.lineSeparator());
        return amount;
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        amountToTake += amountToTake * PERCENT_COMMISSIONS_MAX;
        super.take(amountToTake);
    }

}

