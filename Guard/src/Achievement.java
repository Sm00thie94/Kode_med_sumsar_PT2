public class Achievement {
    private String name;
    private int salaryIncrease;
    private String description;
    private String date;

    public Achievement (String name, int salaryIncrease, String date, String description){
        this.name = name;
        this.salaryIncrease = salaryIncrease;
        this.date = date;
        this.description = description;
    }
    public void printAch (){
        System.out.println( "----- " + name + " -----");
        System.out.println(description);
        System.out.println("Du fik en lønforhøjelse på: " + salaryIncrease);
        System.out.println("Du klarede " + name + " den:" + date);
    }


}
