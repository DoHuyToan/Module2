package access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.getArea();
        circle.setColor("Green");
        System.out.print(circle.toString());
    }
}
