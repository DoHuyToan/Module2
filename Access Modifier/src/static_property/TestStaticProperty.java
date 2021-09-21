package static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Kia Seltos", "2.0");
        System.out.print(Car.numOfCars);
        Car car2 = new Car("Mazda CX5", "2.8");
        System.out.print(", " + Car.numOfCars);
        Car car3 = new Car("Lexus 350", "3.5");
        System.out.print(", " + Car.numOfCars);
    }
}
