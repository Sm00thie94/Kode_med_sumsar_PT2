public class ClassesExercise {
    public static void main(String[] args) {
        Company myCompany = new Company(100);







    } public static void circle () {
        Circle myCircle = new Circle(5);

        double circleDiameter = myCircle.getDiameter();
        System.out.println("Cirklens Diameter er: " + circleDiameter);
        myCircle.circleInfo();
    } public static void car () {
        Car myCar = new Car(220, 6500, 3);
        myCar.carInfo();
    }
}
