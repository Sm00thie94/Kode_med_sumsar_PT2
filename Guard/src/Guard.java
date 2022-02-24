public class Guard {
    private String name;
    private int salary;
    private int kills;
    private int jails;
    private int balance;
    private String rank;
    private int pvAmount;
    private int level;
    private Achievement[] achievements;
    private int achievementIndex = 0;


    public Guard(String name, int salary, int kills, int jails, int balance, String rank, int pvAmount, int level){
        this.name = name;
        this.salary = salary;
        this.kills = kills;
        this.jails = jails;
        this.balance = balance;
        this.rank = rank;
        this.pvAmount = pvAmount;
        this.level = level;

        achievements = new Achievement[10];


    }

    public void printStats (){
        System.out.println(name + "'s Statistikker:");
        System.out.println("Løn: " + salary);
        System.out.println("Kills: " + kills);
        System.out.println("Jails: " + jails);
        System.out.println("Penge: " + balance);
        System.out.println("Rank: " + rank);
        System.out.println("Antal PV'er: " + pvAmount);
    } public boolean isMaxLevel () {
        return level >= 10;
    } public boolean isAVAGT (){
        return rank.equalsIgnoreCase("a-vagt");
    } public void printLevel () {
        System.out.println("Du er i level: " + level);
    } public void levelUp () {
        if (isMaxLevel()){
            System.out.println("Hey! Du over max level!");
            return;
        }
        level++;
        System.out.println("Sådan! Du gik en level up! Du er nu level: " + level);
    } public void rankUp (){
        if (rank.equalsIgnoreCase("b-vagt")){
            rank = "A-Vagt";
            System.out.println("Tillykke! Du ranket op! Du er nu: " + rank);
            System.out.println();
        }
        if (rank.equalsIgnoreCase("c-vagt")){
            rank = "B-Vagt";
            System.out.println("Tillykke! Du ranket op! Du er nu: " + rank);
            System.out.println();
        }
        if (rank.equalsIgnoreCase("p-vagt")){
            rank = "C-Vagt";
            System.out.println("Tillykke! Du ranket op! Du er nu: " + rank);
            System.out.println();
        }

    }public boolean buyPV (){
        int price = pvAmount * 2 * 100000;
        if (balance >= price){
            pvAmount++;
            balance = balance - price;
            System.out.println("Du købte en PV. Du har nu: " + pvAmount + " PV'er");
            System.out.println("Det kostede: " + price + ", og efterlod dig med: " + balance + "DKK");
            System.out.println("Den næste PV Vil koste dig: " + price * 2 + "DKK");
            System.out.println();
            return true;
        }
        else {
            System.out.println("Øv, du havde desværre ikke nok penge til at købe en PV");
            System.out.println();
            return false;
        }
    } public void printSalary(){
        int totalSalary = 0;
        totalSalary = getAchievementSalary() + salary;
        System.out.println("Du har en løn på: " + totalSalary);

    } public void addAchievement (Achievement methodAchievement){
        if (achievementIndex == 10){
            System.out.println("Der er ikke plads til flere achievements");
            return;
        }
        achievements[achievementIndex] = methodAchievement;
        achievementIndex++;

    } private int getAchievementSalary (){
        int salaryIncrease = 0;
        for (int y = 0; achievementIndex > y; y++){
            Achievement tempAchievement;
            tempAchievement = achievements[y];
            salaryIncrease = salaryIncrease + tempAchievement.getSalaryIncrease();
        }
       return salaryIncrease;
    } public void printAchievements (){
        for (int y = 0; achievementIndex > y; y++){
            achievements[y].printAch();
        }
    }

}
