import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(){}

    public Meat(String id, String name, LocalDate mfg, int cost, double weight){
        super(id, name, mfg, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getMfg().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate nowlDate = LocalDate.now();
        if((getExpiryDate().equals(nowlDate.plusDays(3))) || getExpiryDate().isBefore(nowlDate.plusDays(3))){
            return getAmount()/2;
        } else {
            if ((getExpiryDate().equals(nowlDate.plusDays(5))) || getExpiryDate().isBefore(nowlDate.plusDays(5))){
                return getAmount()*7/10;
            }
            else return getAmount()*9/10;
        }
    }

    @Override
    public String toString() {
        return "Meat { " +
                super.toString() +
                ", realMoney" + getRealMoney() +
                ", weight=" + weight +
                '}';
    }
}
