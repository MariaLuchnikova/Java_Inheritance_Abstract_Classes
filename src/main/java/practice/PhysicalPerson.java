package practice;

public class PhysicalPerson extends Client {

    @Override
    public double getAmount() {
        System.out.println("Текущий баланс на счете: " + amount + System.lineSeparator());
        System.out.println("Пополнение и списание осуществляется без комиссии." + System.lineSeparator());
        return amount;
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }
}
