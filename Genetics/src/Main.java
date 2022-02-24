public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey(5, 30);
        Giraffe giraffe = new Giraffe(9, 678);
        ZooArea<Monkey> zooArea = new ZooArea<>(monkey);
        ZooArea<Giraffe> zooArea1 = new ZooArea<>(giraffe);

        zooArea.visit();
        zooArea1.visit();


    } public static void opgave_17_2 (){
        Storage<String> storage = new Storage<>("yes");
        Storage<Integer> storage1 = new Storage<>(100);

        storage.print();
        storage1.print();
    }
}
