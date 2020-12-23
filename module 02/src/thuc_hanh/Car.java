package thuc_hanh;

public class Car {
    private String name;
    private String negine;
    public static int numberOfCars;

    public Car(String name, String negine) {
        this.name = name;
        this.negine = negine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car C1 = new Car("Mazada", "skyacty 3");
        System.out.println(Car.numberOfCars);
        Car C2 = new Car("Toyota", "Skyacty 6");
        System.out.println(Car.numberOfCars);
    }
}
