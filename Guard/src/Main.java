import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Guard guard = new Guard("Sumsar1812", 1000, 0, 0, 1000000, "P-Vagt", 1, 1);

        Scanner scanner = new Scanner(System.in);
        int input;

        int[] printNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        while (true) {

            System.out.println("Hvad vil du gerne se?");
            System.out.println(printNumber[0] + ") Se mine statistikker");
            System.out.println(printNumber[1] + ") Se mine achievements");
            System.out.println(printNumber[2] + ") Se min løn");
            System.out.println(printNumber[3] + ") Køb en PV");
            if (!guard.isAVAGT()){
                System.out.println(printNumber[4] + ") Rankup");
            } else {
                for (int i = 5; i < 9; i++) {
                    printNumber[i]--;
                }
            }
            System.out.println(printNumber[5] + ") Se mit level");
            if (!guard.isMaxLevel()){
                System.out.println(printNumber[6] + ") Level up");
            } else {
                for (int i = 5; i < 9; i++) {
                    printNumber[i]--;

                }
            }
            System.out.println(printNumber[7] + ") Tilføj achievement");

            System.out.println(printNumber[8] + ") Luk menuen");
            input = scanner.nextInt();

            if (input == printNumber[0]) {
                guard.printStats();
                System.out.println();
                System.out.println();
            }
            if (input == printNumber[1]){
                guard.printAchievements();
            }
            if (input == printNumber[2]){
                guard.printSalary();
            }
            if (input == printNumber[3]){
                guard.buyPV();
            }
            if (input == printNumber[4]){
                guard.rankUp();
            }
            if (input == printNumber[5]) {
                guard.printLevel();
            }
            if (input == printNumber[6]){
                guard.levelUp();
            }
            if (input == printNumber[7]){
                Achievement createdAchievement;

                createdAchievement = createAchievement();
                guard.addAchievement(createdAchievement);
            }
            if (input == printNumber[8]){
                break;
            }




        }


    } public static Achievement createAchievement (){
        Scanner scanner = new Scanner(System.in);
        String name;
        int salaryIncrease;
        String description;
        String date;
        System.out.println("Hvad skal navnet på dit achievement være?");
        name = scanner.nextLine();
        System.out.println("Hvad skal løn forhøjelsen være?");
        salaryIncrease = Integer.parseInt(scanner.nextLine());
        System.out.println("Hvad er beskrivelsen på din achievement?");
        description = scanner.nextLine();
        System.out.println("Hvilken dato har du fået achievementet på?");
        date = scanner.nextLine();
        return new Achievement(name, salaryIncrease, description, date);

    }
}

