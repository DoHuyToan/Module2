package circle_cylinder;

import java.util.concurrent.Callable;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setCorlor("Green");
        circle.setRadius(10);
        System.out.println(circle);
        System.out.println(circle.getArea());

        Circle circle11 = new Circle(20,"Blue");
        System.out.println(circle11);
        System.out.println(circle11.getArea());
    }
}
