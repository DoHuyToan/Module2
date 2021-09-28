import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate nowDay = LocalDate.now();
        if((getExpiryDate().equals(nowDay.plusMonths(4)))
                || (getExpiryDate().isBefore(nowDay.plusMonths(4))))
            return getAmount() * 80/100;
        else if((getExpiryDate().equals(nowDay.plusMonths(2)))
                || (getExpiryDate().isBefore(nowDay.plusMonths(2))))
            return getAmount() * 60/100;
        else return getAmount() * 95/100;
    }
}
