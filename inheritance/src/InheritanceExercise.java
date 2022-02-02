public class InheritanceExercise {
    public static void main(String[] args) {
        opgave_3();


    }
    public static void opgave_1 (){
        Employee employee = new Employee(50000, "Gustav");
        employee.print();
        System.out.println();
        Programmer programmer = new Programmer(50000, "Rasmus", 10000);
        programmer.print();
        programmer.doProgramming();
    }
    public static void opgave_2 (){
        Vehicle vehicle = new Vehicle(220, 4);
        vehicle.setSpeed(400);
        vehicle.print();
        System.out.println();
        Car car = new Car(250, 4, 4);
        car.setSpeed(400);
        car.print();
    }
    public static void opgave_3() {
        School school = new School("Devinny elementary",700,35,30);
        school.print();
        System.out.println();

        Gymnasium gymnasium = new Gymnasium("Niels Brock", 400, 50,25,"International Økonomi");
        gymnasium.print();
        System.out.println();

        University university = new University("Copenhagen Business School",2500,150,125,800);
        university.print();
    }
}
