public class Company {
    int amountWorkers;
    int[] salaryPerWorker;
    int salary;

    public Company(int workers) {
        amountWorkers = workers;
        salaryPerWorker = new int[amountWorkers];
        salary = 20000;
        printSalary();

    }
    public void printSalary() {
        System.out.println("alle de " + amountWorkers + " ansatte får " + salary + " i løn.");
    }
}
