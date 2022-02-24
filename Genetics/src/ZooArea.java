public class ZooArea<T extends Animal> {
    private T genetic;

    public ZooArea(T genetic) {
        this.genetic = genetic;
    }
    public void visit (){
        System.out.println("Du besøger et sted med: " + genetic.getAnimalName());
    }
}
