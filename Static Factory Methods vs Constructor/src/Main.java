public class Main {
    public static void main(String[] args) {

        // Constructor
        Car car1 = new Car("Car1","Slow Car");
        Car car2 = new Car("Car2");

        // Static Factory Methods
        Car car3 = Car.createFastCar("Car3");

        System.out.println(car1.name + ": "+car1.carType);
        System.out.println(car2.name + ": "+car2.carType);
        System.out.println(car3.name + ": "+car3.carType);
    }
}