public class Car {
    double topSpeed;
    double kmDriven;
    int passengers;

    public Car (int topMove, int kmTraveled, int peopleInCar) {
        topSpeed = topMove;
        kmDriven = kmTraveled;
        passengers = peopleInCar;
    }

    public void carInfo () {
        System.out.println("Bilens top hastighed: " + topSpeed);
        System.out.println("Antal kilometer kørt: " + kmDriven);
        System.out.println("Antal passagere i bilen: " + passengers);
    }
}
