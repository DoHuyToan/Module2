import java.time.LocalDate;

public class CrispyFlour extends Material{
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate mfg, int cost, double quantity) {
        super(id, name, mfg, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getMfg().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ", quantity=" + quantity +
                '}';
    }
}
