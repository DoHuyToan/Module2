import java.time.LocalDate;

abstract public class Material {
    private String id;
    private String name;
    private LocalDate mfg;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate mfg, int cost) {
        this.id = id;
        this.name = name;
        this.mfg = mfg;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getMfg() {
        return mfg;
    }

    public void setMfg(LocalDate mfg) {
        this.mfg = mfg;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mfg=" + mfg +
                ", cost=" + cost +
                '}';
    }
}
