public class Storage<T> {
    private T test;

    public Storage(T test) {
        this.test = test;

    } public void print (){
        System.out.println("Test:" + test);
    }
}
