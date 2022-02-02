public class Employee {
    private int salary;
    private String name;

    public Employee (int salary, String name){
        this.name = name;
        this.salary = salary;
    }
    public void print (){
        System.out.println("Employee name: " + name);
        System.out.println("Employee's Salary: " + salary);

    }
    public String getName (){
        return name;
    }
}
