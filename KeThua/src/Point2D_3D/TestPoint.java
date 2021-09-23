package Point2D_3D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        point3D.setXYZ(3,6,9);
        System.out.println(point3D.toString());

    }
}
