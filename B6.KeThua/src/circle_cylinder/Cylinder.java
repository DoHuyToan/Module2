package circle_cylinder;

public class Cylinder extends Circle {
    private double width;

    public Cylinder(){}

    public Cylinder(double width) {
        this.width = width;
    }

    public Cylinder(double width, double radius, String corlor){
        super(radius, corlor);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return super.getArea()*2 + super.getArea()*getWidth();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "width=" + getWidth() +
                ", radius=" + super.getRadius() +
                ", corlor='" + super.getCorlor() + '\'' +
                '}';
    }
}
