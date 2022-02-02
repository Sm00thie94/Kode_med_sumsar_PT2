public class Car extends Vehicle{
    private int doorcount;
    private int windowCount;

    public Car (double speed, int doorcount, int windowCount){
        super(speed,4 );

        this.doorcount = doorcount;
        this.windowCount = windowCount;

    }
    public void print(){
        super.print();
        System.out.println("The car has " + doorcount + " doors");
        System.out.println("The car has " + windowCount + " windows");
    }
}
