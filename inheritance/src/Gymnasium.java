public class Gymnasium extends School {
    private String studyProgram;

    public Gymnasium (String name, int students, int teachers, int classrooms, String studyProgram){
        super(name, students, teachers, classrooms);
        this.studyProgram = studyProgram;
    }
    public void print (){
        super.print();
        System.out.println(studyProgram);
    }

}
