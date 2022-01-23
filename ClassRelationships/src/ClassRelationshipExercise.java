import java.sql.SQLOutput;

public class ClassRelationshipExercise {
    public static void main(String[] args) {
        car();






    } public static void car() {
        Car car = new Car("Rød");
        car.print();
    } public static void stoffer () {
        DrugDealer drugDealer = new DrugDealer("Rasmus", "male", 1);
        Drug amount = drugDealer.buyDrug();
        if (amount == null){
            System.out.println("Øv bøv, ingen stoffer i dag");
        } else {
            System.out.println("Du købte: " + drugDealer.drug.name);
            amount.print();
        }
    }
}
