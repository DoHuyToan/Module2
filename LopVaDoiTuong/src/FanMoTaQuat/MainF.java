package FanMoTaQuat;

public class MainF {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.print(fan1.toString() + "\n");

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.SLOW);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.print(fan2.toString());
    }
}
