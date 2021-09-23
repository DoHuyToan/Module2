package circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setWidth(10);
        cylinder.setRadius(20);
        cylinder.setCorlor("Puple");
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());;
    }
}
