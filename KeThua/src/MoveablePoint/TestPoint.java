package MoveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint.setXY(1,2);
        moveablePoint.setxSpeed(10);
        moveablePoint.setySpeed(15);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
