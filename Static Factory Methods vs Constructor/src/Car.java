public class Car {

    String name;
    String carType;

    public Car(String name, String carType) {
        this.name = name;
        this.carType = carType;
    }

    public Car(String name){
        this.name = name;
        this.carType="Slow Car";
    }
    public static Car createFastCar(String name){
        return new FastCar(name);
    }

}
