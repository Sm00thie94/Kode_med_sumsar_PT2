import java.util.Scanner;

public class ArrayExedrcise {
    public static void main(String[] args) {
        opgave10_5();

    }

    public static void ogpave10_0() {


        int amount = 2;
        int[] posArray = new int[amount];

        posArray[0] = 10;
        posArray[1] = 20;
        System.out.println(posArray[0]);
        System.out.println(posArray[1]);
    }

    public static void opgave10_1() {
        Scanner scanner = new Scanner(System.in);
        int y = 0;

        double[] doubleArray = new double[4];
        doubleArray[0] = y;
        doubleArray[1] = y;
        doubleArray[2] = y;
        doubleArray[3] = y;
        for (int x = 0; x < 4; x++) {
            System.out.println("Indtast dit tal");
            y = scanner.nextInt();
            doubleArray[x] = y;
            System.out.println(doubleArray[x]);


        }
    }

    public static void opgave10_2() {
        int[] count10Array = {10, 20, 30};
        System.out.println(count10Array[0]);
        System.out.println(count10Array[1]);
        System.out.println(count10Array[2]);

    }

    public static void opgave10_3() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double value = 0;

        double[] inputArray = new double[4];
        System.out.println("Indtast et tal mellem 0-2");
        index = scanner.nextInt();
        if (index < 0 || index > 3) {
            return;
        }

        System.out.println("Indtast et andet tal");
        value = scanner.nextInt();
        inputArray[index] = value;

        for (int x = 0; x < 3; x++)
            System.out.println(inputArray[x]);
    }

    public static void opgave10_5() {
        Scanner scanner = new Scanner(System.in);

        int[] resizeArray = new int[5];
        int[] tempArray = new int[5];
        for (int i = 0; i < 5; i++) {
            resizeArray[i] = scanner.nextInt();
            tempArray[i] = resizeArray[i];

        }
        resizeArray = new int[6];
        for (int x = 0; x < 5; x++) {

            resizeArray[x] = tempArray[x];
            System.out.println(resizeArray[x]);
        }
        resizeArray[5] = 100;
        System.out.println(resizeArray[5]);
    }
}
