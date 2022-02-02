import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guard guard = new Guard("Sumsar1812", 1000, 1500, 1250, 3000000, "A-Vagt", 3, 10);

        Scanner scanner = new Scanner(System.in);
        int input;
        int y;
        guard.returnLevel();


        while (true) {
            y = 1;
            System.out.println("Hvad vil du gerne se?");
            System.out.println(y + ") Se mine achievements");
            y++;
            System.out.println(y + ") Se mine statistikker");
            y++;
            System.out.println(y + ") Se min løn");
            y++;
            System.out.println(y + ") Køb en PV");
            y++;
            if (!guard.returnRank().equalsIgnoreCase("A-Vagt")) {
                System.out.println(y + ") Rankup");
                y++;
            }
            System.out.println(y + ") Se mit level");
            y++;
            if (guard.returnLevel() <= 9) {
                System.out.println(y + ") Level up");
                y++;
            }
            System.out.println(y + ") Tilføj achievement");
            y++;
            System.out.println(y + ") Luk menuen");
            input = scanner.nextInt();
            if (input == y){
                break;
            }


        }


    }
}
