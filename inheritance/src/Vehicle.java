public class Vehicle {
    private double speed;
    private int wheels;

    public Vehicle (double speed, int wheels){
        this.speed = speed;
        this.wheels = wheels;

    }

    public void print (){
        System.out.println("The vehicle can drive " + speed + " km/h");
        System.out.println("The vehicle has " + wheels + " wheels");
    }
    public void setSpeed (int speed){
        this.speed = speed;
    }
}
