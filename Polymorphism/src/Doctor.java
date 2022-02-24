public class Doctor extends HospitalWorker {
    private String speciality;

    public Doctor (int salary, String speciality){
        super(salary);
        this.speciality = speciality;
    }
    public void printStats(){
        super.printStats();
        System.out.println("Speciality: " + speciality);
    }
    public void treatPatient (){
        System.out.println("Behandler pateint");
    }
}
