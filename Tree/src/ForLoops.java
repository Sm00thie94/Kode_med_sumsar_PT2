import java.util.Scanner;


public class ForLoops {
    public static void main(String[] args) {
        gangeTabel();


    }

    public static void printRage(int FirstNumber, int SecondNumber) {


        for (int i = FirstNumber; i <= SecondNumber; i++) {
            System.out.println(i);
        }

    }

    public static void Sum() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Indtast tal");
            double input1 = scanner.nextDouble();
            sum = sum + input1;
        }
        System.out.println(sum);


    }

    public static void plusIndtilInput() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();

        int sum = 0;

        for (; stop >= start; start++) {
            sum = sum + start;

        }
        System.out.println(sum);


    }

    public static void gennemsnit() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int antal = 10;
        double min = 1000000;
        double max = -1;

        for (int i = 0; i < antal; i++) {
            System.out.println("Indtast tal");
            double input = scanner.nextInt();
            sum = sum + input;
            if (input < min) {
                min = input;
            }
            if (input > max) ;
            {
                max = input;
            }


        }
        System.out.println("Dit gennemsnit er: " + sum / antal);
        System.out.println("Dit mindste tal er: " + min);
        System.out.println("Dit højeste tal er: " + max);


    }

    public static void denHurtigesteBil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast hvor mange biler vil du have");
        System.out.println();
        int amountOfCars = scanner.nextInt();
        int bilNummer = 1;
        double max = -1;
        int bilHastighed = 0;
        int bilVinder = 0;
        int bilAndenHurtigst = 0;
        int bilAndenMax = -1;

        for (int stop = 0; amountOfCars > stop; stop++) {

            System.out.println("Hvor hurtig er bil " + bilNummer + "?");

            bilHastighed = scanner.nextInt();
            if (bilHastighed > max) {
                max = bilHastighed;
                bilVinder = bilNummer;
            }
            if (bilHastighed != max) {
                if (bilHastighed >= bilAndenMax) {
                    bilAndenMax = bilHastighed;
                    bilAndenHurtigst = bilNummer;
                }
            }
            bilNummer++;
        }
        System.out.println("Den hurtigeste bil var: " + bilVinder);
        System.out.println("Med en hastighed på: " + max);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Den anden hurtigeste bil var: " + bilAndenHurtigst);
        System.out.println("Med en hastighed på: " + bilAndenMax);
    }

    public static void gangeTabel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et tal mellem 1-9");
        int input = scanner.nextInt();
        if (input >= 10 || input <= 0) {
            System.out.println("Error! Your input wasn't between 1-9");
            gangeTabel();
            return;
        }
        for (int x = 1; x <= input; x++) {
            for (int y = 1; y <= input; y++) {
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
        gangeTabel();


    }
}

/*
opgave 4.0 Gange tabel!
Få et brugerinput imellem 1 og 9
Lav en gange tabel udfra bruger inputtet

Eksempel:
brugerinput:
6

output:

1  2  3  4  5  6
2  4  6  8  10 12
3  6  9  12 15 18
4  8  12 16 20 24
5  10 15 15 20 25
6  12 18 24 30 36

 */



