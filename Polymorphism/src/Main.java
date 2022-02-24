import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(30, 89);
        System.out.println(square.getArea());
        Shape circle = new Circle(39);
        System.out.println(circle.getArea());




    } public static void opgave_16 (){
        HospitalWorker[] hospitalWorkers = new HospitalWorker[3];
        HospitalWorker doctor = new Doctor(50000, "Kræft");
        HospitalWorker nurse = new Nurse(25000, true);
        HospitalWorker hospitalWorker = new HospitalWorker(15000);


        hospitalWorkers[0] = doctor;
        hospitalWorkers[1] = nurse;
        hospitalWorkers[2] = hospitalWorker;
        for (int i = 0; i < 3; i++){
            System.out.println();
            hospitalWorkers[i].printStats();
            if (hospitalWorkers[i] instanceof Doctor){
                Doctor tempDoc = (Doctor) hospitalWorkers[i];
                tempDoc.treatPatient();
            }
        }

    } public static void opgave_16_1 (){
        Scanner scanner = new Scanner(System.in);
        double x;
        int cast;
        x = scanner.nextDouble();
        cast = (int) x;
        int[] array = new int[3];
        array[0] = 6;
        array[1] = 7;
        array[2] = 8;

        System.out.println(array[cast]);

    }


}
