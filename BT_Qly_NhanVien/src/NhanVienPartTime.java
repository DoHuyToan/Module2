public class NhanVienPartTime extends NhanVien {
    private int time;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int gioLamViec) {
        this.time = gioLamViec;
    }

    public NhanVienPartTime(String code, String name, int age, String numPhone, String email, int time) {
        super(code, name, age, numPhone, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public double salary() {
        return (time * 100);
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "Ten=" + getName() +
                ", gioLamViec=" + time +
                ", salary=" + salary() +
                '}';
    }
}
