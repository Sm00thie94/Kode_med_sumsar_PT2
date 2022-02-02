public class Guard {
    private String name;
    private int salary;
    private int kills;
    private int jails;
    private int money;
    private String rank;
    private int pvAmount;
    private int level;

    public Guard(String name, int salary, int kills, int jails, int money, String rank, int pvAmount, int level){
        this.name = name;
        this.salary = salary;
        this.kills = kills;
        this.jails = jails;
        this.money = money;
        this.rank = rank;
        this.pvAmount = pvAmount;
        this.level = level;
    }

    public void printStats (){
        System.out.println(name + "'s Statistikker:");
        System.out.println("Løn: " + salary);
        System.out.println("Kills: " + kills);
        System.out.println("Jails: " + jails);
        System.out.println("Penge: " + money);
        System.out.println("Rank: " + rank);
        System.out.println("Antal PV'er: " + pvAmount);
    } public int returnLevel () {
        return level;
    } public String returnRank (){
        return rank;
    }

}
