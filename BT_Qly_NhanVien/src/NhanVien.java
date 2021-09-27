public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private String numPhone;
    private String email;

    public NhanVien(){}

    public NhanVien(String code, String name, int age, String numPhone, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.numPhone = numPhone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double salary();

    @Override
    public String toString() {
        return "NhanVien{" +
                "codeEmployee='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numPhone=" + numPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
