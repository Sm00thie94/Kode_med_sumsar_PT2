public class University extends School{
    private double avgBookPrice;

    public University(String name, int students, int teachers, int classrooms, double avgBookPrice){
        super(name,students,teachers,classrooms);
        this.avgBookPrice = avgBookPrice;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The average book price is: " + avgBookPrice + "DKK");
    }
}
