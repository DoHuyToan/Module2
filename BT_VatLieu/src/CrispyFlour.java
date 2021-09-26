import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
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
    public double getRealMoney() {
        LocalDate nowlDate = LocalDate.now();
        if((getExpiryDate().equals(nowlDate.plusMonths(4))) || getExpiryDate().isBefore(nowlDate.plusMonths(4))){
            return getAmount()*80/100;
        } else {
            if ((getExpiryDate().equals(nowlDate.plusMonths(2))) || getExpiryDate().isBefore(nowlDate.plusMonths(2))){
                return getAmount()*60/100;
            }
            else return getAmount()*95/100;
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour { " +
                super.toString() +
                ", quantity=" + quantity +
                '}';
    }
}
