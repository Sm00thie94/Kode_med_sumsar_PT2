public class Monkey extends Animal{
    private int bananasEaten;


    public Monkey(int age, int bananasEaten) {
        super(age);
        this.bananasEaten = bananasEaten;
    }

    @Override
    public String getAnimalName() {
        return "abe";
    }
}
