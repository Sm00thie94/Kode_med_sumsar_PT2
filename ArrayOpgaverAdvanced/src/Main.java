import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    opgave_3();

    }
    public static void opgave_1(){
        Scanner scanner = new Scanner(System.in);
        int y = 5;
        int[] input = new int[y];


        for (int x = 0; x < y; x++){
            System.out.println("Indtast et tal");
            input[x] = scanner.nextInt();
            if (x == 4) {
                for (int a = 0; a < y; a++)
                System.out.println(input[a]);

            }


        }
    } public static void opgave_2 () {
        int y = 4;
        int b = 0;
        int[] printArray = new int[y];

        for (int a = 0; y > a; a++){
            printArray[a] = b = b + 5;


        }
        for (int x = 0; y > x; x++){
            System.out.println(printArray[x]);
        }
    }
    public static void opgave_3(){
        int y = 3;
        int beds = 0;
        Hospital [] hospitals = new Hospital[y];
        hospitals[0] = new Hospital ("Aarhus Universitetshospital", 500);
        hospitals[1] = new Hospital("Herlev", 2500);
        hospitals[2] = new Hospital("København", 5000);
        for (int x = 0; y > x; x++){

            hospitals[x].printInfo();

            beds = beds + hospitals[x].getBeds();

        }
        System.out.println("Der er " + beds + " senge i Danmark");



    }
}
