public class Nurse extends HospitalWorker{
    private boolean bloodsamples;

    public Nurse (int salary, boolean bloodsamples){
        super(salary);
        this.bloodsamples = bloodsamples;
    } public void printStats (){
        super.printStats();
        System.out.println("Må tage blodprøver: " + bloodsamples);

    }
}
