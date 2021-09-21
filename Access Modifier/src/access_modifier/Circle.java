package access_modifier;

public class Circle {
    private double radius = 5.0;
    private String color = "red";

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                ", are=" + getArea() + '\'' +
                '}';
    }
}
