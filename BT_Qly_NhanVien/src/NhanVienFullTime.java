public class NhanVienFullTime extends NhanVien {
    private double tienThuong;
    private double tienPhat;
    private double luongCung;

    public NhanVienFullTime(){}

    public NhanVienFullTime(double tienThuong, double tienPhat, double luongCung) {
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public NhanVienFullTime(String code, String name, int age, String numPhone, String email, double tienThuong, double tienPhat, double luongCung) {
        super(code, name, age, numPhone, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double salary() {
        return (luongCung + tienThuong - tienPhat);
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "Ten=" + getName() +
                ", tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +
                ". salary=" + salary() +
                '}';
    }
}
