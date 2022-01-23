public class Car {
    String color;
    Motor motor;

    public Car (String colorOfCar) {
        color = colorOfCar;
        motor = new Motor("Ferrari", 850);

    }
    public void print () {
        System.out.println("Farven af bilen er: " + color);
        motor.print();
    }
}
