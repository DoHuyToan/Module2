package circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){}

    public Circle(double radius, String corlor) {
        this.radius = radius;
        this.color = corlor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCorlor() {
        return color;
    }

    public void setCorlor(String corlor) {
        this.color = corlor;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", corlor='" + color + '\'' +
                '}';
    }
}
