public class Person {
    String name;
    int age;

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setName (String name){
        this.name = name;
        return this;
    }
}
