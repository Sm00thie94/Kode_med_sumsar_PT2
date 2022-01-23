import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Speciallægepraksisplanlægningsstabiliseringsperiode";
        int y = 3;
        while (true) {
            for (int x = 0; x < y; x++) {
                String guess = scanner.nextLine();

                if (guess.equalsIgnoreCase(answer)) {
                    System.out.println("Tillykke! Du gættet rigtigt!");
                    return;

                } else {
                    System.out.println("Øv, det var ikke det rigtige svar");
                }
            }
            String firstThreeLetters = answer.substring(0, answer.length() / 2);
            System.out.println("Den første halvdel af ordet er: " + firstThreeLetters);

        }
    }

    public static void stringCheck() {
        String s1 = "test";
        String s2 = "test2";

        if (s2.contains(s1)) {
            System.out.println("Hey! String 1 har noget af det samme indhold som String 2!");
        }

    }

    public static void lineAndName() {
        Scanner scanner = new Scanner(System.in);
        String myUsername = "Sm00th94";
        String input = scanner.nextLine();


        if (input.equalsIgnoreCase(myUsername)) {
            System.out.println("Det er mit navn!");
        } else {
            System.out.println("Hej med dig");
        }

        if (input.length() >= 15) {
            System.out.println("Det er en lang linje");
        } else if (input.length() >= 5) {
            System.out.println("Det er en mellem lang linje");
        } else {
            System.out.println("Det er en kort linje");
        }
    }
}
