public class Human {
    private String name;
    private int cpr;
    private int age;

    public Human(String name, int cpr, int age) {
        this.name = name;
        this.cpr = cpr;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getCpr() {
        return cpr;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setCpr (int cpr) {
        this.cpr = cpr;
    }
    public void printInfo(){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your CPR Number is: " + cpr);

    }
}
