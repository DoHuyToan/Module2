import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate nowDay = LocalDate.now();
        if((getExpiryDate().equals(nowDay.plusDays(5)))
                || (getExpiryDate().isBefore(nowDay.plusDays(5))))
            return getAmount() * 70/100;
        else if((getExpiryDate().equals(nowDay.plusDays(3)))
                || (getExpiryDate().isBefore(nowDay.plusDays(3))))
            return getAmount() * 50/100;
        else return getAmount() * 90/100;
    }
}
