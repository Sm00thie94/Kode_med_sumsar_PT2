public class School {
    private String name;
    private int students;
    private int teachers;
    private int classRooms;

    public School(String name, int students, int teachers, int classrooms){
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.classRooms = classrooms;
    }
    public void print (){
        System.out.println(name);
        System.out.println("The school has: " + students + " students");
        System.out.println("The school has: " + teachers + " teachers");
        System.out.println("The school has: " + classRooms + " classrooms");
    }
}
