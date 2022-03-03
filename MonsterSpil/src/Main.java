import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.intro();
        Scanner scanner = new Scanner(System.in);
        String playerName;
        playerName = scanner.nextLine();
        PlayerInfo player = new PlayerInfo(1, 1, 1, false, 2, 2, 1, 10, playerName);
        System.out.println("Starting game...");
        main.start(player);


    }

    public void intro() {
        System.out.println("Heyhey! Thanks for playing: A night in Millenium Hilton");
        System.out.println("Please choose your username.");

    }

    public void start(PlayerInfo player) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Atlast! You arrive at Millenium Hilton, the most luxury hotel in Bangkok.");
        System.out.println("You've always wanted to go to bangkok, and you've finally gotten the opportunity to go with you're Company");
        System.out.println("You're hotel room is amazing, you got the corner room on the 34th floor.");
        System.out.println("It's late at night, so you go to lay in your bed, one of the most luxurios beds you've ever laid in");
        System.out.println("You feel yourself start to drift away, and slowly fall asleep");

        System.out.println();
        System.out.println();
        System.out.println("You get awaken up by the slight sound of treading footsteps");
        System.out.println("The sound is comning from the hallway, and is getting louder for every second");
        System.out.println("Do you: 1) Go out to investigate? The noise is irritating, and you have an important meeting tomorrow");
        System.out.println("or 2) Try to sleep through it, you have to wake up in an hour, and whatever is making that noise has to go away at some point.");
        while (true) {
            input = scanner.nextInt();
            checkStats(input, player);
            if (input == 1) {
                break;
            } else if (input == 2) {
                System.out.println("You go back to sleep, and wake up the next day, feeling refreshed and excited for your meeting later that day");
                System.out.println("You go through your morning routine, and get ready to walk out the door");
                System.out.println("OOF");
                System.out.println("That's the sound of you opening the door and immediately getting tackled to the ground");
                System.out.println("In a total state of shock, you lay completely still on the floor");
                System.out.println("While laying face down, a man goes down to you and whispers in your ear:");
                //death method
                return;
            }
        }
        System.out.println("You get out of bed and open the door");
        System.out.println("You get shocked to see a team of heavily armored people at the end of the hall, all with large rifles you recongnize from playing Call of duty ");
        System.out.println("They spot you, and start rushing toward you");
        System.out.println("Do you: 1) Close the door, and hurry back inside to your own handgun?");
        System.out.println("Or 2) Try to make it to the elevator, which is very close to your room, and away from whoever it is that's aprroaching you");
    }
    public void checkStats (int input, PlayerInfo player){
        if (input == 0){
            player.printPlayerStats();
        }
    }
}
