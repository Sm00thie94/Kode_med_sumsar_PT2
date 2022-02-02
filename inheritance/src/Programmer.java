public class Programmer extends Employee {
    private int bonus;

    public Programmer(int salary, String name, int bonus) {
        super(salary, name);
        this.bonus = bonus;
    }

    public void doProgramming() {
        System.out.println("Heyhey!");

    }
    public void print(){
        super.print();
        System.out.println(getName() + " gets a bonus of: " + bonus);
    }

}
